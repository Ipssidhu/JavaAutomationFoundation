package day2_oop;

public class ClinicalTrial {
	
	int trialId;
	String trialName;
	
	
	 public ClinicalTrial(int trialId, String trialName) {
	        this.trialId = trialId;
	        this.trialName = trialName;
	    }
	 
	 public void describeTrial() {
		 System.out.println("Trail ID: " + trialId);
		 System.out.println("Trail Name: " + trialName);
		 
	 }
	
}
