package day3_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PatientSetDemo {
	
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
		
		System.out.println("Original List: " + patients);
        System.out.println("Size with duplicates: " + patients.size());
        
        // Convert List to Set to remove duplicates
        Set<String> uniquePatients = new HashSet<>(patients);

        System.out.println("\nSet (Unique Values): " + uniquePatients);
        System.out.println("Size without duplicates: " + uniquePatients.size());

}	
}
