import java.util.Scanner;
class Q1andQ2
{
  public static void main(String args[])
  {
	Scanner adi=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns:");
	int n=adi.nextInt();
	int m=adi.nextInt();
	int a[][]=new int[n][m];
	int pDiaSum=0,sDiaSum=0,i,j;
	System.out.println("Enter the elements now:");
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			a[i][j]=adi.nextInt();
	System.out.println("Principal Diagonal:");
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			if(i==j)
			{
				System.out.println(a[i][j]);
				pDiaSum+=a[i][j];
			}
	System.out.println("Sum="+pDiaSum);
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			if(i+j==m-1)
			{
				System.out.println(a[i][j]);
				sDiaSum+=a[i][j];
			}

	System.out.println("Sum="+sDiaSum);
  }
}