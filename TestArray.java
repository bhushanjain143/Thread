class TestArray
{
	public static void main(String[] args) 
	{
		int a[] =  new int[9];
		a[0]=06;
		a[1]=10;
		a[2]=20;
		a[2]=30;
		a[4]=40;
		a[8]=90;
		for (int i = 0; i<a.length; i++) 
		{
			System.out.printf("\n Printing the array index is %d and value is %d",i ,a[i]);
			
		}

		
	}
}
