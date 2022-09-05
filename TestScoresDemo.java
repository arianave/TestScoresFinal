package inClass.finalProj0;

public class TestScoresDemo {
	
	public static void main(String [] args) {
		float[] myScores = {10.5f, 5.9f, 15.0f, 20.0f};
		
		try {
		TestScores korahScores = new TestScores(myScores);
		System.out.println("Average: "+ korahScores.calculateAverage());
		System.out.println(korahScores);
		korahScores.setScores(-1f, 2 );
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
