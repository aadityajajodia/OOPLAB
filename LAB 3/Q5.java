import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the dimension of matirx:");
		int n=adi.nextInt();
		int m=adi.nextInt();
		int a[][]=new int[n][m];
		int r[]=new int[n];
		int c[]=new int[m];
		int sDia=0;
		int pDia=0;
		int flag=1;
		System.out.println("Enter the elements now:");
		int i,j;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=adi.nextInt();
		for(i=0;i<n;i++)
		{
			r[i]=0;
			for(j=0;j<m;j++)
			{
				r[i]=r[i]+a[i][j];
			}
		}

		for(i=0;i<m;i++)
		{
			c[i]=0;
			for(j=0;j<n;j++)
			{
				c[i]=c[i]+a[j][i];
			}
		}
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
			{
				if(i==j)
					pDia+=a[i][j];
				if(i+j==m-1)
					sDia+=a[i][j];
			}

		for(i=0;i<n-1;i++)
			if(r[i]!=r[i+1])
				flag=0;
		for(i=0;i<m-1;i++)
			if(c[i]!=c[i+1])
				flag=0;
		if(c[0]!=sDia||sDia!=pDia||r[0]!=pDia)
			flag=0;
		if(flag==1)
			System.out.println("Magic");
		else
			System.out.println("Not Magic");
	
	}
}