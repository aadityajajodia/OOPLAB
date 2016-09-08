import java.util.Scanner;
class Employee
{
	Scanner adi=new Scanner(System.in);
	String name;
	String city;
	double baSal;
	double deAll;
	double hoRe;
	double toSal;
	void getData()
	{
		System.out.println("Enter your name, city, basic salary, dearness allowance and house rent ");
		name=adi.nextLine();
		city=adi.nextLine();
		baSal=adi.nextDouble();
		deAll=adi.nextDouble();
		hoRe=adi.nextDouble();


	}
	void calculate()
	{
		toSal=baSal+baSal*deAll/100+baSal*hoRe/100;
	}
	void display()
	{
		System.out.println(name+" lives in "+city+" and earns "+toSal);
	}
}









class Q2
{
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.getData();
		obj.calculate();
		obj.display();

	}
}