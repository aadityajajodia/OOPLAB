import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner adi=new Scanner(System.in);
		double len,bre,area,circum;

		System.out.println("Enter the length and breadth of recatangle:");
		len=adi.nextDouble();
		bre=adi.nextDouble();
		area=len*bre;		
		circum=2*(len+bre);
		System.out.println("Area= "+area+"\tCircumference= "+circum);
	}
}
