class AddArray
{
	public static void main(String arggg[])

	{
		int arr1[][] = {{10,20},{30,40}}; //new int[2][2];
		int arr2[][] = {{10,20},{30,40}}; //new int[2][2];

		for (int i=0;i<2; i++ ) 
		{
			for (int j=0;j<2; j++ ) 
			{ 
				int c[][] = new int[2][2];
				c[i][j] = arr1[i][j]+arr2[i][j];
				System.out.println(c[i][j]);

			}			
		}

	}
}