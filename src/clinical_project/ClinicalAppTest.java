package clinical_project;

public class ClinicalAppTest {

    public static void main(String[] args) {

        PatientService service = new PatientService();

        try {
            // Create patients
            Patient p1 = new Patient(101, "John Doe", 45, "Diabetes");
            Patient p2 = new Patient(102, "Sarah Lee", 32, "Hypertension");
            Patient p3 = new Patient(101, "John Doe", 45, "Diabetes"); // duplicate
            Patient p4 = new Patient(103, "Raman Singh", 150, "Asthma"); // invalid age

            // Add valid patients
            service.addPatient(p1);
            service.addPatient(p2);

            // This will cause duplicate exception
            service.addPatient(p3);

            // This will cause invalid age exception
            service.addPatient(p4);

        } catch (DuplicatePatientException | InvalidAgeException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        // Print all valid patients stored
        service.printAllPatients();

        // Search by ID
        System.out.println("\n--- Search Patient By ID 102 ---");
        Patient found = service.getPatientById(102);
        if (found != null) {
            found.printDetails();
        } else {
            System.out.println("No patient found with ID 102");
        }
    }
}
