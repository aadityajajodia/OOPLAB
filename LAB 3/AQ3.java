import java.util.Scanner;
class AQ3
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n=adi.nextInt();
		int a[]=new int[n];
		int i,counter=0;
		System.out.println("Enter the elements now");
		for(i=0;i<n;i++)
			a[i]=adi.nextInt();
		System.out.println("Enter the element to be searched:");
		int x=adi.nextInt();
		for(i=0;i<n;i++)
		{
				if(a[i]==x)
					counter++;
		}
		System.out.println("Number of occurances = "+counter);
	}
}