public class Reverse1
{

public static void main(String[] args) {
	
		boolean a[] = new boolean[5];
		a[0]= true;
		a[1]= false;
		a[2]= false;
		a[3]= true;
		a[4]= true;
		for (int b=a.length-1; b>=0;b--) 
		{

		System.out.println(a[b]);			
		}
	}
}
