package day4_exceptions;

public class ArrayExceptionDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[7]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Invalid index access! Array length: " + arr.length);
        }
    }
}
