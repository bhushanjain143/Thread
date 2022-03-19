class Average
{
	public static void main(String[] args) 
	{
		int sum=0;
		int av[] = {10,30,50,70,90};
		for (int a: av) 
		{
			//System.out.println(a);
			sum = sum+a;
		}
		//System.out.println("Sum of given number: - "+sum);
		System.out.println("Avg of given number --> "+sum/av.length);


		
	}

}
