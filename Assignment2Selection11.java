import java.util.Scanner;;

public class Assignment2Selection11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCredits;

        System.out.print("Enter Total Credits: ");
        totalCredits = sc.nextInt();

        if (totalCredits > 24) {
            System.out.println("Exceeds the limit");
        } else {
            System.out.println("KRS is Valid");
        }

        sc.close();
    }
}
