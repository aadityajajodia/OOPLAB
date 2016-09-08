import java.util.Scanner;
class Number
{
	private int num;
	Number()
	{
		num=0;
	}
	Number(int num)
	{
		this.num=num;
	}
	boolean isZero()
	{
		if(num==0)
			return true;
		return false;
	}
	boolean isPositive()
	{
		if(num>0)
			return true;
		return false;
	}
	boolean isNegative()
	{
		if(num<0)
			return true;
		return false;
	}
	boolean isOdd()
	{
		if(num%2==1)
			return true;
		return false;
	}
	boolean isEven()
	{
		if(num%2==0)
			return true;
		return false;
	}
	boolean isPrime()
	{
		if(num==1)
			return false;
		int i;
		for(i=2;i<num;i++)
			if(num%i==0)
				return false;
		return true;

	}
	boolean isArmstrong()
	{
		int x=num;
		int ld;
		int sum=0;
		while(x>0)
		{
			ld=x%10;
			sum+=ld*ld*ld;
			x=x/10;
		}
		if(sum==num)
			return true;
		return false;
	}
}
class Q5
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter number of your choice");
		int num=adi.nextInt();
		Number obj=new Number(num);
		System.out.println("Checking for "+num+"........\n"+" isZero "+obj.isZero()+" isPositive "+obj.isPositive()+" isNegative "+obj.isNegative()+" isOdd "+obj.isOdd()+" isEven "+obj.isEven()+" isPrime "+obj.isPrime()+" isArmstrong "+obj.isArmstrong());

	}
}