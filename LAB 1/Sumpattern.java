import java.util.Scanner;
class Sumpattern
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		int n,i;
		double sum=0;
		System.out.println("Enter the number of terms of the given series:");
		n=adi.nextInt();
		for(i=1;i<=n;i++)
			sum=sum+Math.pow((1.0/i),i);
		System.out.println("Answer ="+sum);
	}
}
		