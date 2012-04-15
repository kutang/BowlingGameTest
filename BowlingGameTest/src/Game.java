
public class Game {
	
	private int itsScore=0;
	private int[] itsThrows=new int[21];
	private int itsCurrentThrow=0;
	public int score()
	{
		return scoreForFrame(getCurrentFrame()-1);
	}
	public void add(int pins)
	{
		itsThrows[itsCurrentThrow++]=pins;
		itsScore+=pins;
		adjustCurrentFrame(pins);
	}
	private void adjustCurrentFrame(int pins)
	{
		if(firstThrowInFrame==true)
		{
			//firstThrow=false;
			if(pins==10)
				itsCurrentFrame++;
			else{
				firstThrowInFrame=false;
				
			}
				
		}
		else
		{
			firstThrowInFrame=true;
			itsCurrentFrame++;
		}
		//int itsCurrentFrame=1;
		itsCurrentFrame=Math.min(11,itsCurrentFrame);
	}
	private int itsCurrentFrame=1;
	//private boolean firstThrow=true;
	
	public int scoreForFrame(int theFrame)
	{
		ball=0;
		int score=0;
		for(int currentFrame=0;currentFrame<theFrame;currentFrame++)
		{
			int firstThrow=itsThrows[ball++];
			if(firstThrow==10)
			{
				score+=10+itsThrows[ball]+itsThrows[ball+1];
			}
			else
			{
				secondThrow=itsThrows[ball++];
				int frameScore=firstThrow+secondThrow;
				if(frameScore==10)
					score+=frameScore+itsThrows[ball];
				else
					score+=frameScore;
				//score+=handleSecondThrow();
			}
		}
		return score;
	}
	private int handleSecondThrow()
	{
		int score=0;
		secondThrow=itsThrows[ball++];
		
		int frameScore=firstThrow+secondThrow;
		if(frameScore==10)
			score+=frameScore+itsThrows[ball];
		else
			score+=frameScore;
		return score;
	}
	public int getCurrentFrame()
	{
		return itsCurrentFrame;
	}
	private int ball;
	private int firstThrow;
	
	private int secondThrow;
	private boolean firstThrowInFrame=true;

}
