import java.util.Scanner;

public class AssignmentQueue11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Academic Queue Machine ---");
        System.out.println("1. KRS Validation");
        System.out.println("2. Academic Consultation");
        System.out.println("3. Transcript Request");
        System.out.println("4. Graduation Registration");
        System.out.println("Enter service code (1-4)");
        int serviceCode = sc.nextInt();


        switch (serviceCode) {
            case 1:
                System.out.println("Service Selected: KRS Validation");
                break;
            case 2:
                System.out.println("Service Selected: Academic Consultation");
                break;
            case 3:
                System.out.println("Service Selected: Transcript Request");
                break;
            case 4:
                System.out.println("Service Selected: Graduation Registration");
                break;
            default:
                System.out.println("Service code is not available");
                break;
        }

        sc.close();
    }
}
