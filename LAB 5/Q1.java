import java.util.Scanner;
class Account
{
	String cusName;
	int accNum;
	char accType;
	double balance;
	double interest;
	final double minBal=10000;
	final double rate=0.04;
	void deposit(int money)
	{
		balance+=money;
	}
	void dis()
	{
		System.out.println("Your balance is "+balance);
	}
	void interest()
	{
		interest=balance*rate*0.5/100;
		balance=balance+interest;
		System.out.println("interest received "+interest);
	}
	void withdraw(int money)
	{
		balance-=money;
		if(balance<0)
		{
			System.out.println("not sufficient funds");
			balance+=money;
		}
	}
	void checkMin()
	{
		if(balance<=minBal)
		{
			System.out.println("Minumum balance not maintained. Penalty of 1000 bucks");
			balance-=1000;
		}
	}


}
class SavingAcount extends Account
{
	void checkMin()
	{
		System.out.println("No minimum balance required");
	}
}
class CurrentAccount extends Account
{
	void interest()
	{
		System.out.println("No interest received");
	}

}
class Q1
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		int opt=1;
		Account obj1=new SavingAcount();
		Account obj2=new CurrentAccount();
		Account obj=new SavingAcount();
		System.out.println("1.Saving Account\n2.Current Account\nEnter your Option");
		opt=adi.nextInt();
		if(opt==1)
			obj=obj1;
		else
		if(opt==2)
			obj=obj2;

		do
		{
			System.out.println("1.deposit\n2.interest\n3.checkMin\n4.withdraw\n5.balance\n6.Exit\nenter your Option");
			opt=adi.nextInt();
			switch(opt)
			{
				case 1:
				System.out.print("Enter the amount you would like to deposit");
				int money=adi.nextInt();

				obj.deposit(money);
				break;
				case 2:
				obj.interest();
				break;
				case 3:
				obj.checkMin();
				break;
				case 4:
				System.out.println("Enter the amount to would like to withdraw");
				 money=adi.nextInt();
				obj.withdraw(money);
				break;
				case 5:
				obj.dis();
				break;
				case 6:
				System.out.println("Bye Bye");
				break;
				default:
					System.out.println("Enter correct Option");
			}

		}while(opt!=6);
			}
}
