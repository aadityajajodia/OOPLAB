import java.util.Scanner;
class Combination
{
	public static void main(String args[])
	{
		int i,j,k,l;
		Scanner adi=new Scanner(System.in);
		
	
		int a[]=new int[4];
		System.out.println("Enter four different single digits:");
		for(i=0;i<4;i++)
			a[i]=adi.nextInt();
		
		System.out.println("Duplication not allowed");
		for(i=0;i<4;i++)
			for(j=0;j<4;j++)
				for(k=0;k<4;k++)
					for(l=0;l<4;l++)
						{
							if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l)
								System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]+"\t"+a[l]);
						}
		System.out.println("Duplication allowed:");
		for(i=0;i<4;i++)
			for(j=0;j<4;j++)
				for(k=0;k<4;k++)
					for(l=0;l<4;l++)
						System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]+"\t"+a[l]);
						
				
	}
}
