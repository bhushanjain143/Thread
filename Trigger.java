class job1 extends Thread
{
	public void run()
	{
		for (int i=0;i<100;i++) 
		{
			System.out.println(i);
			
		}
	}

}

class Trigger extends job1
{
	public static void main(String[] args) 
	{
		for (int i=100;i<200;i++) 
		{
			System.out.println(i);
		}	
	
		job1 j1 = new job1();
		//j1.run();
		j1.start();
		for (int i=300;i<400;i++) 
		{
			System.out.println(i);
		}	
	
	
		
	}
}