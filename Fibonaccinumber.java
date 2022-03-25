//Fibonacci number
class Fibonaccinumber
{
	public static void main(String[] args) 
	{
/*		int z= 10;
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		for (int i = 1;i<=z-2;i++) 
		{		
			
			c=a+b;
			a=b;
			b=c;
		//System.out.println(b);

			System.out.println(c);
		}
*/
		int no1 = 0;
		int no2 = 1;
		int sum = 0;
		System.out.print(no1 + " " + no2 + " ");
		for (int i = 1; i <= 10; i++) 
		{
		sum = no1 + no2;
		System.out.print(sum + " ");
		no1 = no2;
		no2 = sum;
		}
	}
}