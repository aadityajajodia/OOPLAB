import java.util.Scanner;
class Q3
{	
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		
		
		System.out.println("Enter a number ");
		int n=adi.nextInt();
		System.out.println(n+"*2 ="+(n<<1));
		System.out.println(n+"/2 ="+(n>>1));
	}
}