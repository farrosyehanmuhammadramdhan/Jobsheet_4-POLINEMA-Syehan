import java.util.Scanner;

public class Assignment1Selection11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD");
        System.out.print("Has the UKT been paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        String msg = (uktPaid) ? "UKT payment verified" : "Pay the UKT first";
        System.out.println(msg);
        
        sc.close();
    }    
}