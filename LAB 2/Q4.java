class Q4
{
	public static void main(String args[])
	{
		int x =10;
		double y=x;
		double a=10.5;
		//int b=a; Error because of the lossy conversion
		double f=10.5;
		int t=(int)f;		
		System.out.println(y);
		System.out.println(t);
	
	}
}
