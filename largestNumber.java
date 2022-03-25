//Find largest number in an array?
import java.util.Arrays;

class largestNumber
{
public static void main(String[] args) {
int[] a = { 50, 40, 10, 20, 30 };
int size = a.length;
sort(a, size);
System.out.println(Arrays.toString(a));
System.out.println(a[a.length - 2]);
}
static void sort(int[] a, int size) {
for (int i = 0; i < size - 1; i++) {
for (int j = i + 1; j < size; j++) {
if (a[i] > a[j]) {
int temp;
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
}

/*
	public static void main(String arg[])
	{
		int a=0;
		int arr[] = {10,20,30,90,50,5};
		for (int i=0;i<arr.length;i++ ) 
		{
			for (int j=i+1;j<arr.length;j++ ) 
			if(arr[i]>arr[j])
			{
				int temp=0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			
			}System.out.println("bhushan"+arr[]);

		}
	}*/
}
