import java.util.*;
class PrimeGenerator
{
	public static void main(String args[])
	{
		int i,j,flag;	
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n=adi.nextInt();
		int m=adi.nextInt();
		for(i=n;i<=m;i++)
		{
			flag=1;
			for(j=2;j<i;j++)
				if(i%j==0)
				{
					flag=0;
					break;
				}
			if(flag==1&&i!=1)
				System.out.println(i);
		}
	}
}