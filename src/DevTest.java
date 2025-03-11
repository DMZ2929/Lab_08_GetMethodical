import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Name: " + name);

        // Test getInt
        int age = SafeInput.getInt(scanner, "Enter your age");
        System.out.println("Age: " + age);

        // Test getDouble
        double height = SafeInput.getDouble(scanner, "Enter your height in meters");
        System.out.println("Height: " + height);

        // Test getRangedInt
        int year = SafeInput.getRangedInt(scanner, "Enter your birth year", 1950, 2015);
        System.out.println("Birth Year: " + year);

        // Test getRangedDouble
        double price = SafeInput.getRangedDouble(scanner, "Enter the price of the item", 0.50, 10.00);
        System.out.println("Price: " + price);

        // Test getYNConfirm
        boolean isStudent = SafeInput.getYNConfirm(scanner, "Are you a student?");
        System.out.println("Student: " + isStudent);

        // Test getRegExString
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);

        // Test prettyHeader
        SafeInput.prettyHeader("Message Centered Here");
    }
}