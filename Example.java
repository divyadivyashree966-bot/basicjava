import java.util.*;
class Example
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}
}