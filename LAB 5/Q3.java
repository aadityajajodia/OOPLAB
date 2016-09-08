import java.util.Scanner;
class Time
{
	int hh,mm,ss;
	Time()
	{
		hh=0;
		mm=0;
		ss=0;
	}
	Time(int hh,int mm,int ss)
	{
		this.hh=hh;
		this.mm=mm;
		this.ss=ss;
	}
	void dis()
	{
		System.out.println("hh:mm::ss"+" "+hh+":"+mm+":"+ss);
	}
	void add(Time obj1,Time obj2)
	{
		hh=obj1.hh+obj2.hh;
		mm=obj1.mm+obj2.mm;
		ss=obj1.ss+obj2.ss;
		if(ss>59)
		{
			ss=ss-60;
			mm++;
			if(mm>59)
			{
				mm-=60;
				hh++;
			}
			if(hh>23)
			{
				System.out.println("Got an extra day");
				hh-=24;
			}
		}
		if(mm>59)
		{
			mm-=60;
			hh++;
			if(hh>23)
			{
				System.out.println("Got an extra day");
				hh-=24;
			}
		}
		System.out.println("Added time is ");
		System.out.println("hh:mm::ss"+" "+hh+":"+mm+":"+ss);
	}
}
class Q3
{
	
	public static void main(String[] args) {
		Scanner adi=new Scanner(System.in);
		int hh1,mm1,ss1,hh2,mm2,ss2;
		int flag=0;
		System.out.println("Enter two time in 24 hour format");
		do{
			flag=0;
			System.out.println("Enter first time");
			hh1=adi.nextInt();
			mm1=adi.nextInt();
			ss1=adi.nextInt();
			System.out.println("Enter second time");
			hh2=adi.nextInt();
			mm2=adi.nextInt();
			ss2=adi.nextInt();
			if(hh1>23||mm1>59||ss1>59||hh2>23||mm2>59||ss2>59)
			{
				System.out.println("Enter correct time in 24 hour format");
				flag=1;
			}
		}while(flag==1);
		
		Time obj1=new Time(hh1,mm1,ss1);
		Time obj2=new Time(hh2,mm2,ss2);
		obj1.dis();
		obj2.dis();
		obj1.add(obj1,obj2);
	}
}