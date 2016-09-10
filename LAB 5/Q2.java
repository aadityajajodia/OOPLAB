import java.util.Scanner;
class Student
{
	int reg;
	String name;
	int age;
	int semester;
	int fees;
	Scanner adi=new Scanner(System.in);
	Student()
	{

		System.out.println("Enter name, age and registration number");

		name=adi.nextLine();
		age=adi.nextInt();
		reg=adi.nextInt();
	}
	void dis()
	{

		System.out.println(name+" "+age+" "+reg+""+semester+" "+fees);

	}

}
class Ug extends Student
{
	Scanner adi=new Scanner(System.in);

	int semester;
	int fees;
	void setData()
	{
		System.out.println("Enter semester and fees");
		semester=adi.nextInt();
		fees=adi.nextInt();
	}
	void dis()
	{

		System.out.println(name+" "+age+" "+reg+" "+semester+" "+fees);

	}
}
class Pg extends Student
{
	Scanner adi=new Scanner(System.in);

	int semester;
	int fees;
	void setData()
	{
		System.out.println("Enter semester and fees");
		semester=adi.nextInt();
		fees=adi.nextInt();
	}
	void dis()
	{

		System.out.println(name+" "+age+" "+reg+" "+semester+" "+fees);

	}
}
class Q2
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("For UG student enter 1 or for PG student enter 2");
		int opt=adi.nextInt();
		if(opt==1)
		{Ug obj1=new Ug();

		obj1.setData();
		obj1.dis();
	}else
	if(opt==2)
		{
			Pg obj2=new Pg();
		obj2.setData();
		obj2.dis();
	}
	else
	System.out.println("You didn't enter the correct option");
}
}
