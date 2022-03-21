//2. Understanding character datatype in java it prints ASCII code of a characters.
import java.util.*;
class Exercise2
{
	public static void main(String ar[])
	{
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int fact=1;			
		for (int i = 1;i<=a;i++) 
		{		
		fact = fact*i;	
		}
		System.out.println("factorial of given number is " + fact);		
	}
}