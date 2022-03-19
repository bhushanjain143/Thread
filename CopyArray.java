class CopyArray
{
	public static void main(String arg[])

	{

		/*int a[] = {111,100,10,20,60,40,50,80};
		int x = a.length;
		int b[] = new int[x];

		for (int i = 0;i<x ; i++) 
		{
			System.out.println(a[i]);
			
		}
		for (int j = 0;j<x ; j++) 
		{		b[j]=a[j];
			System.out.println(b[j]);
			
		}*/

		int a1[][] = {{111,100,10,20},{60,40,50,80}};
		int x = a1.length;
		int b1[][] = new int[x][];

		for (int i = 0;i<x ; i++) 
		{
			for (int j = 0;j<x ; j++) 
				{
					System.out.println(a1[i][j]);
				}
		}
			
			

		for (int i = 0;i<x ; i++) 
		{
			for (int j = 0;j<x ; j++) 
				{
					b1[i][j] =  a1[i][j] ;

					System.out.println(b1[i][j]);
				}
		}
		
	}
}