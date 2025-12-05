package day2_oop;

public class PatientTest {

    public static void main(String[] args) {

        // Creating patient using parameterized constructor
        Patient p1 = new Patient(101, "John Doe", 45, "Diabetes");
        Patient p2 = new Patient(102, "Sarah Lee", 30, "Hypertension");

        // Creating patient using no-arg constructor + setter methods
        Patient p3 = new Patient();
        p3.setId(103);
        p3.setName("Raman Singh");
        p3.setAge(50);
        p3.setDisease("Asthma");

        // Print details of all patients
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
    }
}
