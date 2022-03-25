//write a program reverse string
/*
class reverseString
{
	public static void main(String[] args) 
	{
		String str = "YOURNAME";

		for (int i=0;i<str.length();i++) 
		{
			System.out.println(str[i]);			
		}
	}
}
*/
//wap which can random shuffle the contents of arry without using addition arrany

/*class reverseString
{
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=50;
		a[5]=90;
		a[3]=80;
		a[4]=60;
		
		for (int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);			
		}
		
		for (int i=a.length-1;i>=0;i--) 
		{
			System.out.println(a[i]);			
		}
	}
}
*/
//Java Program to transpose matrix


/*class reverseString
{
	public static void main(String[] args) 
	{
		int arr[][] ={{1,3,4},{2,4,3},{3,4,5}};    //{{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][] =new int[3][3];
		for (int i=0; i<3;i++ ) 
		{
			for (int j=0; j<3;j++) 
			{
				arr1[i][j] = arr[j][i];
			}

		}
		System.out.println("Original matrix");
		for (int i=0; i<3;i++ ) 
		{
			for (int j=0; j<3;j++) 
			{
				
			System.out.print("\t"+arr1[i][j]);
			}System.out.print("\n");			
		}
		System.out.println("Transpose matrix");

		for (int i=0; i<3;i++ ) 
		{
			for (int j=0; j<3;j++) 
			{
			System.out.print("\t"+arr1[i][j]);			
			}System.out.print("\n");			
		}
	}
}





*/

class reverseString
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c;
		/*c=a;
		a=b;
		b=c;
		*/
		//a=20;b=10
		a=a+b;
		b=a-b;
		a=a-b;
	System.out.print(a+"\t"+b);			

	}
}














