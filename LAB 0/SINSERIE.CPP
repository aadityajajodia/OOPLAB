#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int n,i;
	float x,sin_sum,term;
	cout<<"Enter the value for which sin has to be found in radian:";
	cin>>x;
	cout<<"Enter the number of terms in the sin series:";
	cin>>n;
	sin_sum=x;
	term=x;
	for(i=2;i<=n;i++)
	{
		term=term*x*x*(-1)/((2*i-1)*(2*i-2));
		sin_sum=sin_sum+term;
	}
	cout<<"The final answer is:"<<sin_sum;
	getch();
}
