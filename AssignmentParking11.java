import java.util.Scanner;

public class AssignmentParking11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicle;

        System.out.print("Enter Vehicle Type: ");
        vehicle = sc.nextInt();
        if (vehicle == 4) {
            System.out.println("Car Parking fee Rp.5.000");
        } else if (vehicle == 2) {
            System.out.println("Motorcycle Parking fee Rp.3.000");
        } else if (vehicle == 3) {
            System.out.println("Bicycle Parking fee Rp.2.000");
        } else {
            System.out.println("Unknown vehicle type");
        }

        sc.close();
    }
}
