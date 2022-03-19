import java.util.*; 
class B
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firest number : ");
		int z = sc.nextInt();
		System.out.println("Enter second number : ");
		int y = sc.nextInt();

		A bhushan = new A();
		int Abc = bhushan.add(z,y);
		System.out.println("Addition of 2 number is : "+Abc);
		A bhusha = new A();
		int Abcd = bhusha.Sub(10,20);
		System.out.println(Abcd);

		System.out.println("100*25 "+(100*25));
		System.out.println("600*25 "+(600*25));

		System.out.println("100*50 "+(100*50));
		System.out.println("600*50 "+(600*50));



		
	}

}