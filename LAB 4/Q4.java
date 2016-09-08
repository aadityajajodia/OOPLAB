import java.util.Scanner;
class Complex
{
	double c1;
	double c2;
	void add(double c1,double c2,int i)
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

		System.out.println("1.Add two Complex number\n2.Add Complex number and natural number\nEnter your choice");
		int opt=adi.nextInt();
		int real1,real2,im1,im2;
		if(opt==1)
		{
			System.out.println("Enter real part ");
			real1=adi.nextInt();
			System.out.println("Enter imaginary part");
			im1=adi.nextInt();
			System.out.println("Enter real part ");
			real2=adi.nextInt();
			System.out.println("Enter imaginary part");
			im2=adi.nextInt();
			obj1.add(real1,im1,real2,im2);

		}
		if (opt==2)
		{
			System.out.println("Enter real part ");
			real1=adi.nextInt();
			System.out.println("Enter imaginary part");
			im1=adi.nextInt();
			System.out.println("Enter integer number ");
			real2=adi.nextInt();

			obj1.add(real1,im1,real2);

		}
		obj1.display();
	}
}
