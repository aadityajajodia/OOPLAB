import java.util.Scanner;
class Result
{
	Scanner adi=new Scanner(System.in);
	int rollnum[]=new int[3];
	int sub[][]=new int[3][3];
	int total[]=new int[3];
	int high[][]=new int[2][3];
	int i,j;
	void setData()
	{
		for(i=0;i<3;i++)
		{
			System.out.println("Enter roll number");
			rollnum[i]=adi.nextInt();
		}
		for(j=0;j<3;j++)
		{
			System.out.println("Enter marks of threee subject for student");
			for(i=0;i<3;i++)
			{
				sub[j][i]=adi.nextInt();

			}
		}
	}
	void cal()
	{
		for(i=0;i<3;i++)
		{
			total[i]=0;
			for(j=0;j<3;j++)
			{
				total[i]+=sub[i][j];
			}
		}
		for(i=0;i<3;i++)
		{
			high[0][i]=sub[0][i];
			high[1][i]=rollnum[i];
			for(j=0;j<3;j++)
			{
				if(high[0][i]>sub[j][i])
				{
					high[0][i]=sub[j][i];
					high[1][i]=rollnum[j];
				}	
			}
		}
		for(i=0;i<3;i++)
			System.out.print(high[1][i]+"\t");
		System.out.println();
		for(i=0;i<3;i++)
			System.out.print(high[0][i]+"\t");
	}

}
class AQ1
{
	public static void main(String[] args) {
		Result obj=new Result();
		obj.setData();
		obj.cal();
	}
}