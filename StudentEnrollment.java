import java.util.Scanner;

public class StudentEnrollment {

    // Fee per unit and maximum subjects
    private static final int FEE_PER_UNIT = 1000;
    private static final int MAX_SUBJECTS = 10;

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Variables for student information
        String studentName;
        String course;
        String courseCode;
        int numberOfUnits;
        int totalFee;

        // Input student information
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        courseCode = scanner.nextLine();

        // Input number of units with validation
        do {
            System.out.print("Enter Number of Units (max " + MAX_SUBJECTS + "): ");
            numberOfUnits = scanner.nextInt();
            if (numberOfUnits < 1 || numberOfUnits > MAX_SUBJECTS) {
                System.out.println("Invalid number of units. Please enter a value between 1 and " + MAX_SUBJECTS + ".");
            }
        } while (numberOfUnits < 1 || numberOfUnits > MAX_SUBJECTS);

        // Calculate total enrollment fee
        totalFee = numberOfUnits * FEE_PER_UNIT;

        // Output student's name and total fee
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // Input payment amount
        System.out.print("Enter Payment Amount: ");
        int payment = scanner.nextInt();

        // Check payment status
        if (payment == totalFee) {
            System.out.println("Status: Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Status: Partial Payment");
            System.out.println("Amount Paid: " + payment);
        } else {
            System.out.println("Status: Overpayment");
            System.out.println("Amount Paid: " + payment);
            System.out.println("Refund Amount: " + (payment - totalFee));
        }

        // Close the scanner
        scanner.close();
    }
}
