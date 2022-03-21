import java.util.*;

/*class Exercise1
{
	public static void main(String[] args) 
	{
		
		double d1 = 10;
		double d2 = 20;
		System.out.println("Addtion of 2 number is --> "+(d1+d2));
		
	}
}
*/
/*class Exercise1
{
		double sum(double d1,double d2)
		{
			double c;
			c = d1+d2;
			return c;
		}
	public static void main(String[] args) 
	{
		Exercise1 e = new Exercise1();
		double var = e.sum(10,20);
		System.out.println("Addtion of 2 number is --> "+var);
	}
}*/
class Exercise1
{		
		double c;
		Exercise1(double d1,double d2)
		{
			
			c= d1+d2;
		}
		void display()
		{
			System.out.println(c);
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double  d1 = sc.nextInt();
		double  d2 = sc.nextInt();
		Exercise1 e = new Exercise1(d1,d2);
		e.display();

	}
}