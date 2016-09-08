#include<iostream.h>
#include<conio.h>
void main()
{
	int i,j,n,a[100][100],b[100][100];
	cout<<"Enter the dimension of the square matrix:";
	cin>>n;
	cout<<"Enter the elements now:"<<"\n";
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			cin>>a[i][j];
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			b[i][j]=a[j][i];
	cout<<"\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
			cout<<a[i][j]<<"\t";
		cout<<"\n";
	}
	cout<<"\n\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
			cout<<b[i][j]<<"\t";
		cout<<"\n";
	}
	getch();
}