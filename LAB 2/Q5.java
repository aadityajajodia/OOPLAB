import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		
		boolean flag=false;
		do
		{
			System.out.println("Enter first number");
			float a=adi.nextFloat();
			System.out.println("Enter operator:");
			adi.nextLine();
			char op=adi.nextLine().charAt(0);
			System.out.println("Enter second number:");
			float b=adi.nextFloat();
			
	
			switch(op)
			{
				case '+':
				System.out.println(a+"+"+b+" = "+(a+b));
				break;
				case '-':
				System.out.println(a+"-"+b+" = "+(a-b));
				break;
				case '*':
				System.out.println(a+"*"+b+" = "+(a*b));
				break;
				case '/':
				System.out.println(a+"/"+b+" = "+(a/b));
				break;
				default:
				System.out.println("Enter correct operator:");
			}
			System.out.println("Do you want perform another calculation Y or N:");
			adi.nextLine();
			char c=adi.nextLine().charAt(0);
			if(c=='Y'||c=='y')
				flag=true;
			else
			if(c=='N'||c=='n')
				flag=false;
			else
				System.out.println("Wrong entry!!!!");
		}while(flag);
	}
}