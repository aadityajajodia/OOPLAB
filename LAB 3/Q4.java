import java.util.Scanner;
class Q4
{

	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		int n,m,p,q,i,j,k;

		System.out.println("Enter the dimension of first matrix:");
		n=adi.nextInt();
		m=adi.nextInt();

		System.out.println("Enter the dimension of second matrix:");
		p=adi.nextInt();
		q=adi.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[p][q];
		int c[][]=new int[m][p];
		if(m!=p)
			System.out.println("The two matrix cannot be multipied");
		else
		{
			System.out.println("Enter the elements of first matrix:");
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
					a[i][j]=adi.nextInt();
			System.out.println("Enter the elements of second matrix:");
			for(i=0;i<p;i++)
				for(j=0;j<q;j++)
					b[i][j]=adi.nextInt();
			for(i=0;i<n;i++)
				for(j=0;j<q;j++)
				{
					c[i][j]=0;
					for(k=0;k<m;k++)
							c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			System.out.println();
			for(i=0;i<n;i++)
			{
				for(j=0;j<q;j++)
					System.out.print(c[i][j]+"\t");
				System.out.println();
			}
		}
	}
}





