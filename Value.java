class Value
{
	public static void main(String[] args) 
	{

	int array[] = new int[10];

	array[0] = 1;
	array[1] = 10;
	array[2] = 100;

	for (int i=0; i<array.length; i++) 
	{
		int Value = array[i];
		System.out.println(Value);
	}
	System.out.println("\nPrining the number reverse order");
	for (int j =array.length-1;j>=0;j-- ) 
	{
		System.out.println(array[j]);
		
	}
	}
}