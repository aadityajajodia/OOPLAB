import java.util.Scanner;
class SineSeries
{

	public static void main(String args[])
	{
		
		int n,i;
		double x,sin_sum,term;
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the value for which sin has to be found in radian:");
		x=adi.nextDouble();
		System.out.println("Enter the number of terms in the sin series:");
		n=adi.nextInt();
		sin_sum=x;
		term=x;
		for(i=2;i<=n;i++)
		{
			term=term*x*x*(-1)/((2*i-1)*(2*i-2));
			sin_sum=sin_sum+term;
		}
		System.out.println("The final answer is:"+sin_sum);
	}
}
