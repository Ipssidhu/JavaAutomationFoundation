package day1_basics;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello Automation";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
