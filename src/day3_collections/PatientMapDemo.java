package day3_collections;

import java.util.HashMap;
import java.util.Map;

public class PatientMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> patientMap = new HashMap<>();
		
		patientMap.put(101,"Jon Doe");
		patientMap.put(102,"Sarah Lee");
		patientMap.put(103,"Sam Hopper");
		patientMap.put(104,"Raman Singh");
		patientMap.put(105,"Ela Singh");
		
		// display patient details
		
		 System.out.println("Patient Map: " + patientMap);
		 
		// Fetch name by ID
	        int searchId = 104;
	        if(patientMap.containsKey(searchId)) {
	            System.out.println("\nPatient with ID " + searchId + ": " + patientMap.get(searchId));
	        } else {
	            System.out.println("\nPatient ID not found!");
	        }
	        
	        
	        // Loop through all entries
	        System.out.println("\n--- All Patient Details ---");
	        for(Map.Entry<Integer, String> entry : patientMap.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
	        }

	}

}
