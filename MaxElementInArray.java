
//MaxElementInArray 
/*
class MaxElementInArray
{
	public static void main(String[] args) 
	{
		int a[] = {10,60,80,90,100,20,30};
		for (int i=0;i<a.length-1;i++ ) 
		{
			if (a[i]>a[i+1]) 
			{
					System.out.println(a[i]);	
			}	
		}				
	}	
}
*/
/*class MaxElementInArray
{
	public static void main(String[] args) 
	{
		
		int a[] = {10000,10,60,80,90,100,20,30,100000};
		int maxv = a[0];
		for (int i=1;i<a.length;i++) 
		{
			if (a[i]>maxv) 
			{
				maxv = a[i];			
			}	
		}				
				System.out.println("Second largest element in array-->"+maxv);
	}	
}*/

/*   5*2  10*2   20 
500 2500 5000 10000
*/







class MaxElementInArray
{
	public static void main(String[] args) 
	{
		for (int i =0;i<10;i++ ) 
		{
			if (i%2==0) 
			{
				System.out.println("Numbat is Even --> "+i);			
			}
/*			else
			{
				System.out.println("Numbat is Odd  --> "+i);			
			}
*/					
		}

	}
}

/*import java.util.*;
class MaxElementInArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbar -> ");	
		int Uinput = sc.nextInt();

		for (int i=0;i<Uinput;i=i+5) 
		{
		if (i==0) 
		{
			System.out.println("500");	
		}
		else
		{
			int z = i*500;
			System.out.println(z);
		}
		}
	}	
}



*/












