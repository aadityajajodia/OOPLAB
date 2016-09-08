import java.util.Scanner;
class Q2
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter a int, double and character:");
		int i=adi.nextInt();
		double d=adi.nextDouble();
		adi.nextLine();
		char c=adi.nextLine().charAt(0);
		System.out.println("From int "+i+" to byte "+ (byte)i);
		System.out.println("From double "+d+" to byte "+(byte)d);
		System.out.println("From char "+c+" to int "+(int)c);
		System.out.println("From double "+d+" to int "+(int)d);
	}
}