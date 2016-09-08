import java.util.Scanner;
class Complex
{
	double c1;
	double c2;
	void add(int i,double c1,double c2)
	{
		this.c1=c1+i;
		this.c2=c2;
	}
	void add(double c1,double c2,double c3,double c4)
	{
		this.c1=c1+c3;
		this.c2=c2+c4;

	}
	void display()
	{
		System.out.println("Final result "+c1+"+"+c2+"i");
	}
}
class Q4
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		Complex obj1=new Complex();
		Complex obj2=new Complex();
		obj1.add(12,14,15);
		
		obj1.display();
		obj2.add(12,13,13,22);
		obj2.display();
	}
}