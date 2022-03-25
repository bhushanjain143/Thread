//Write a program for sum of digits 123 – 6
class sumofdigits
{
	public static void main(String arg[])
	{
		int num = 123,newnum,n,sum;
		
		while(num !=0)
		{
			newnum =  num%10;
			sum = sum + newnum;
			num=  num/10;
			System.out.println(newnum);			
		}

	}
}