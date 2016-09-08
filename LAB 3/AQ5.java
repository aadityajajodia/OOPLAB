import java.util.Scanner;
class AQ5
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the dimension of square matrix");
		int n=adi.nextInt();
		System.out.println("Enter the elements now");
		int i,sum=0,j,trace=0;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)	
			for(j=0;j<n;j++)
				a[i][j]=adi.nextInt();
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				sum+=a[i][j]*a[i][j];
				if(i==j)
					trace+=a[i][j];
			}
		System.out.println("trace = "+trace);
		System.out.println("norm = "+Math.sqrt(sum));

	}
}