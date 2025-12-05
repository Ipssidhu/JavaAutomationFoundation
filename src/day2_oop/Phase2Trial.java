package day2_oop;

public class Phase2Trial extends ClinicalTrial {
	
	private int numberOfSubjects;
	
	public Phase2Trial(int trialId, String trialName, int numberOfSubjects) {
		super(trialId, trialName);
		this.numberOfSubjects=numberOfSubjects;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	 public void describeTrial() {
		
		super.describeTrial();
		System.out.println("Phase: Phase 2");
       System.out.println("Subjects: " + numberOfSubjects);
       System.out.println("----------------------------");
		 
	 }

}
