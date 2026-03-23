import java.util.*;
class Distance
{
	int feet,inches;
	Distance(int feet, int inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	void sum(Distance D1,Distance D2)
	{
		if(D1.inches<12&&D2.inches<12)
		{
			inches=D1.inches+D2.inches;
			feet=D1.feet+D2.feet+(inches/12);
			inches=inches%12;
			System.out.println("Total Distance is: \n Feet:"+feet+" \t Inches:"+inches);
		}
		else
			System.out.println("Inches should be less than 12!!!");
	}
}
class partA
{
	public static void main(String args[])
	{
		int feet1,feet2,inches1,inches2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance1");
		System.out.println("Enter feet1");
		feet1=sc.nextInt();
		System.out.println("Enter inches1");
		inches1=sc.nextInt();
		System.out.println("Enter Distance2");
		System.out.println("Enter feet2");
		feet2=sc.nextInt();
		System.out.println("Enter inches2");
		inches2=sc.nextInt();
		Distance D1=new Distance(feet1,inches1);
 		Distance D2=new Distance(feet2,inches2);
		D1.sum(D1,D2);
		sc.close();
	}
}