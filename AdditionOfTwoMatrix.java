class AdditionOfTwoMatrix
{
	public static void main(String arg[])
	{
		System.out.println("Bhushan");
		/*String a = "Bhusha";
		int c = a.length();	
		System.out.println(c);	
		*/
		int arr1[][] = {{1,2,3},{4,5,6}};
		int arr2[][] = {{1,2,3},{4,5,6}};
		int result[][] = {{0,0,0},{0,0,0}};
		
		for (int i=0;i<arr1.length;i++ ) 
		{
			for (int j=0;j<arr1[i].length;j++)
			{
				result[i][j] = arr1[i][j]+arr2[i][j];
				
			System.out.print(" \t "+i +j);	

			}
			
		}

				System.out.print("------------------------------------------------\n");

		for (int i=0;i<arr1.length;i++ ) 
		{
			for (int j=0;j<arr1[i].length;j++)
			{
				System.out.print(" \t "+result[i][j]);

			}
			
		}
	}
}