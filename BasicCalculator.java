import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        //Different Calculations
        System.out.println("\nPossible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = input.next();  //gets one letter

        //multiplication
        double result = num1 * num2;
        System.out.println("\n" + num1 + " * " + num2 + " = " + result);





    }
}
