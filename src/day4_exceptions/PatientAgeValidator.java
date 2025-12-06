package day4_exceptions;

public class PatientAgeValidator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 110) {
            throw new InvalidAgeException("❌ Invalid Patient Age: " + age);
        } else {
            System.out.println("Valid Age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(50); // valid
            validateAge(150); // invalid
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught → " + e.getMessage());
        }
    }
}
