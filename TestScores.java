package inClass.finalProj0;

public class TestScores {
	
	private float [] scores;
	
	TestScores(float [] myScores)throws IllegalArgumentException{// non-default constructor
		// the throws in the header is for the client to handle the exception
		// check if any values in the array is negative
		for(int y = 0; y< myScores.length;y++)
		{
			if(myScores[y]< 0)
			{
				throw new IllegalArgumentException("The scores cannot be negative");
			}
		}
			
	
		this.scores = new float[myScores.length];
		for(int i = 0; i< this.scores.length; i++)
		{
			this.scores[i] = myScores[i];
			
		}
		
	}
	
	//acessor
	public float [] getScores()
	{
		float[] myScores = new float[this.scores.length];
		for(int j =  0; j < myScores.length;j++)
		{
			myScores [j] = this.scores[j];
		}
		return myScores;
			
	}
	
	//mutator
	
	public void setScores(float [] myScores)throws IllegalArgumentException
	{
		for(int y = 0; y< myScores.length;y++)
		{
			if(myScores[y]< 0)
			{
				throw new IllegalArgumentException("The scores cannot be negative");
			}
		}
		
		this.scores = new float[myScores.length];
			for(int h =  0; h < myScores.length;h++)
			{
				myScores [h] = this.scores[h];
			}
		
		}
	
	public void setScores(float myScores, int index)throws IllegalArgumentException
	{
		if(myScores< 0)
		{
			throw new IllegalArgumentException("The scores cannot be negative");
		}
		this.scores[index] = myScores;
	}
	
	// other methods
	
	public float calculateAverage() {
		
		float avg = 0.0f;
		for(int g = 0; g<this.scores.length; g++)
		{
			avg = avg+ this.scores[g];
		}
		
		avg = avg/ this.scores.length;
		
		return avg;
	}
	
	//to String Method
	
	public String toString() {
		String ret = ""; 
		for(int r = 0; r<this.scores.length; r++)
		{
			ret = ret + "Score"+ r + " is "+ this.scores[r]+ "\n";
		}
		
		return ret;
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
