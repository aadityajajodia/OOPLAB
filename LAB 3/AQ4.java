import java.util.Scanner;
class AQ4
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the number of elements in first array:");
		int n=adi.nextInt();
		System.out.println("Enter the number of elements in second array:");
		int m=adi.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[n+m];
		System.out.println("enter the elements of first matrix");
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			a[i]=adi.nextInt();
			c[i]=a[i];
		}
		System.out.println("Enter the elements of second matrix");

		for(i=0,j=n;i<m;i++,j++)
		{
			b[i]=adi.nextInt();
			c[j]=b[i];

		}
		for(i=0;i<n+m-1;i++)
			for(j=0;j<n+m-1-i;j++)
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
		System.out.println("The merged sorted array");
		for(i=0;i<n+m;i++)
			System.out.println(c[i]);
		



	}
}