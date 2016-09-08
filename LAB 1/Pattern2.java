import java.util.Scanner;

class Pattern2
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		int i,j,x=1,n;
		System.out.println("Enter the number of rows:");
		n=adi.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}	