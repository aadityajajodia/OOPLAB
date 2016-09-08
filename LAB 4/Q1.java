import java.util.Scanner;
class Box
{
	double height;
	double width;
	double length;
	void setData(double height,double width,double length)
	{
		
		this.height=height;
		this.width=width;
		this.length=length;

	}
	double volume()
	{
		return height*width*length;
	}
}
class Q1
{
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		System.out.println("Enter the dimension of box");
		double height=adi.nextDouble();
		double width=adi.nextDouble();
		double length=adi.nextDouble();
		Box obj=new Box();
		obj.setData(height,width,length);
		System.out.println("Volume = "+obj.volume());

	}
}