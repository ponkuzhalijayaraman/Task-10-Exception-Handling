import java.util.Scanner;

public class ExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Runtime Exception example
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int result = 10 / num;
            System.out.println("Result: " + result);

            // Custom Exception
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (InvalidAgeException e) {
            System.out.println("Custom Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception: " + e);

        } finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
