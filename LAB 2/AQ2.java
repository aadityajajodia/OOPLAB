import java.util.Scanner;
class AQ2
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=adi.nextInt();
		int b=adi.nextInt();
		int c=adi.nextInt();
		System.out.println("Greatest among three is:");
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
	}
}			