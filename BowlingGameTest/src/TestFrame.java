
//TestFrame.java
//made by xie pingshi
//2012/4/14

import junit.framework.*;

public class TestFrame extends TestCase{
	
	//@Test
	public TestFrame(String name)
	{
		super(name);
	}
	
	//sucessfully test
	public void testScoreNoThrows()
	{
		Frame f=new Frame();
		assertEquals(0,f.getScore());
	}
	//sucessfully test
	public void testAddOneThrow()
	{
		Frame f=new Frame();
		f.add(5);
		assertEquals(5,f.getScore());
	}

}
