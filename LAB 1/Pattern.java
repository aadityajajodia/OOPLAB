import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		int i,j,n;
		System.out.println("Etner the number of rows:");
		Scanner adi=new Scanner(System.in);
		n=adi.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}