import java.util.Scanner;
class Q1
{
	public static void main(String args[])
	{
		
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the year you want to check:");
		int year=adi.nextInt();
		boolean flag;
		if(year%4==0&&year%100!=0)
			flag=true;
		else
		if(year%400==0)
			flag=true;
		else
			flag=false;
		if(flag)
			System.out.println("Leap year:");
		else
			System.out.println("Not a leap year:");

	}
}