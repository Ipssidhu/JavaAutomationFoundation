package clinical_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientService {

    private Map<Integer, Patient> patientMap = new HashMap<>();

    // Add patient with duplicate & age validation
    public void addPatient(Patient patient) throws DuplicatePatientException, InvalidAgeException {
        validateAge(patient.getAge());

        if (patientMap.containsKey(patient.getId())) {
            throw new DuplicatePatientException("Patient already exists with ID: " + patient.getId());
        }

        patientMap.put(patient.getId(), patient);
        System.out.println("✅ Added patient: " + patient.getName() + " (ID: " + patient.getId() + ")");
    }

    // Age validation (0–110)
    private void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 110) {
            throw new InvalidAgeException("Invalid age for patient: " + age);
        }
    }

    // Get patient by ID
    public Patient getPatientById(int id) {
        return patientMap.get(id);
    }

    // Get all patients as a List
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patientMap.values());
    }

    // Print all patients
    public void printAllPatients() {
        System.out.println("\n--- Patient Records from PatientService ---");
        for (Patient p : getAllPatients()) {
            p.printDetails();
        }
    }
}
