import java.util.*;
class pay
{
	String name;
	double salary,da,hra,pf,grosSal,netSal;
	pay(String n,double s)
	{
		name=n;
		salary=s;
		da=0;
		hra=0;
		pf=0;
		grosSal=0;
		netSal=0;
	}
	void calculate()
	{
		da=salary*15/100;
		hra=salary*10/100;	
		pf=salary*12/100;
		grosSal=salary+da+hra;
		netSal=grosSal-pf;
	}
	void display()
	{
		System.out.println("employye name="+name);
		System.out.println("employee salary="+salary);
		System.out.println("derness allowness="+da);
		System.out.println("house alowness="+hra);
		System.out.println("providebt fund="+pf);
		System.out.println("gross salary="+grosSal);
		System.out.println("netsalary="+netSal);
	}
}
	class basic
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employee name");
			String name =sc.nextLine();
			System.out.println("enter employye salary");
			double salary=sc.nextDouble();
			pay ob=new pay(name,salary);
			ob.calculate();
			ob.display();
		}
	}
