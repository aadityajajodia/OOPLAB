import java.util.Scanner;
class AQ1
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=adi.nextInt();
		System.out.println("Enter elements now");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			a[i]=adi.nextInt();
		int largest=a[0];
		int smallest=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<smallest)
				smallest=a[i];
			if(a[i]>largest)
				largest=a[i];
		}
		System.out.println("Smallest element = "+smallest);
		System.out.println("Largest element = "+largest);

	}
}