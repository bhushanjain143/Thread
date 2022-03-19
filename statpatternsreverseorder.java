class statpatternsreverseorder
{
	public static void main(String[] args) 
	{
		int n =5;
/*		for (int i=5;i>=1 ;i--) 
		{
			for (int j=1;j<i;j++) 
			{
				System.out.print(i);
			}	System.out.print("\n");
		}
*/
/*		int n =5;
		for (int i=0;i<n ;i++ ) 
		{
			for (int j=0;j<i ;j++ ) 
			{
				System.out.print(j);
			}	System.out.print("\n");

			
		}
*/














		//int n =5;
		for (int i=5;i>=1 ;i-- ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				if(j%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}

			}	System.out.print("\n");
		}
			
		

	}
}