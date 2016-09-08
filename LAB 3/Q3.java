import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter dimension of the sqaure matrix:");
		int n=adi.nextInt();
		int i,j;
		int a[][]=new int[n][n];
		System.out.println("Enter the elements now:");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=adi.nextInt();
		int flag=1;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(a[i][j]!=a[j][i])
					flag=0;
		if(flag==1)
			System.out.println("Symmetric");
		else	
			System.out.println("Not Symmetric");
	}
}