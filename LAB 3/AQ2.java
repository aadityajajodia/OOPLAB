import java.util.Scanner;
class AQ2
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=adi.nextInt();
		int i;
		int a[]=new int[n];
		System.out.println("Enter the elements now");

		for(i=0;i<n;i++)
			a[i]=adi.nextInt();
		AQ2 obj=new AQ2();
		System.out.println("Prime numbers are:");
		
		for(i=0;i<n;i++)
		{
			if(obj.myPrime(a[i]))
				System.out.println(a[i]);
		}

	}
	boolean myPrime(int x)
	{
		int i;
		if(x==1)
			return false;
		for(i=2;i<x;i++)
			if(x%i==0)
				return false;
			return true;
	}
	
}