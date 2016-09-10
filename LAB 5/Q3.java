import java.util.Scanner;
class Bank
{
	Scanner adi=new Scanner(System.in);

	double intCal;
	double p;
	double time;
	Bank()
	{
		System.out.println("Enter the principal and time in years ");
		 p=adi.nextDouble();
		 time=adi.nextDouble();


	}
	double  setInt()
	{
		return 0;
	}
	double calInterest(double rate)
	{
			intCal=p*rate*time/100;
			return intCal;
	}


}
class Sbi extends Bank
{
	Scanner adi=new Scanner(System.in);
	double rate;

	double setInt()
	{
		System.out.println("Enter the rate which bank provides");
		rate=adi.nextDouble();
		return rate;
	}
}
class Icici extends Bank
{
	Scanner adi=new Scanner(System.in);
	double rate;

	double setInt()
	{
		System.out.println("Enter the rate which bank provides");
		rate=adi.nextDouble();
		return rate;
	}

}
class Axis extends Bank
{
	Scanner adi=new Scanner(System.in);
	double rate;

	double setInt()
	{
		System.out.println("Enter the rate which bank provides");
		rate=adi.nextDouble();
		return rate;
	}

}
class Q3
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Which bank are you interested in?");
		System.out.println("1.SBI\n2.ICICI\n3.AXIS");
		int opt=adi.nextInt();
		Bank obj;
		switch(opt)
		{
			case 1:
			obj=new Sbi();
			System.out.println(obj.calInterest(obj.setInt()));
			break;
			case 2:
			obj=new Icici();

			System.out.println(obj.calInterest(obj.setInt()));
			break;
			case 3:
			obj=new Axis();

			System.out.println(obj.calInterest(obj.setInt()));
			break;
			default:
				System.out.println("Entered inccorect option");

		}

	}
}
