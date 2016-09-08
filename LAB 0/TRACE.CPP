#include<iostream.h>
#include<conio.h>
void main()
{       int n,m,i,j,trace=0;
	cout<<"Enter the dimension of the matrix";
	cin>>n>>m;
	cout<<"Enter the elements now:"<<"\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
			cin>>a[i][j];
		if(i==j)
			trace+=a[i][j];
	}
	cout<<"Trace= "<<trace;
}