package day4_exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int num = 10 / 0;
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

        System.out.println("Execution continues after exception handling...");
    }
}
