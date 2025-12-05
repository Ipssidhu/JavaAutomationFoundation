package day1_basics;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Clinical Testing";
        int count = 0;

        String lower = input.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Vowel count: " + count);
    }
}
