package day3_collections;

import java.util.ArrayList;
import java.util.List;

public class PatientListDemo {
	public static void main(String[] args) {
		
		List<String> patients = new ArrayList<>();
		
		// adding patient name
		patients.add("Jon Doe");
		patients.add("Sarah Lee");
		patients.add("Sam Hopper");
		patients.add("Raman Singh");
		patients.add("Sarah Lee");
		patients.add("Ela Singh");
		patients.add("Raman Singh");
		
		System.out.println("Patient List (with Duplicates)" + patients);
		System.out.println("Total Patients (with Duplicates)" + patients.size());
		
		// Remove duplicate values
		List<String> uniquePatients = patients.stream().distinct().toList();

		System.out.println("\nUnique Patients List: " + uniquePatients);
		System.out.println("Total Unique Patients: " + uniquePatients.size());
		
		 // Searching for a patient
        String searchPatient = "Raman Singh";
        if (uniquePatients.contains(searchPatient)) {
            System.out.println("\n" + searchPatient + " found in the patient list!");
        } else {
            System.out.println("\n" + searchPatient + " not found!");
        }
		
}


}
