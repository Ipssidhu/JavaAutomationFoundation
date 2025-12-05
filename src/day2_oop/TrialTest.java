package day2_oop;

public class TrialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phase1Trial t1 = new Phase1Trial(101,"Cancer",145);
		Phase2Trial t2 = new Phase2Trial(102,"Sugar",120);
		
		System.out.println("------ Trial Details ------");
		t1.describeTrial();
		t2.describeTrial();
		

	}

}
