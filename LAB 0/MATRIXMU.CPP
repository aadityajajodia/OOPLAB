#include<iostream.h>
#include<conio.h>
void main()
{
	int n,m,p,q,i,j,k;
	int a[100][100],b[100][100],c[100][100];
	cout<<"Enter the dimension of first matrix:";
	cin>>n>>m;
	cout<<"Enter the dimension of second matrix:";
	cin>>p>>q;
	if(m!=p)
		cout<<"The two matrix cannot be multipied";
	else
		cout<<"Enter the elements of first matrix:";
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				cin>>a[i][j];
		cout<<"Enter the elements of second matrix:";
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				cin>>b[i][j];
		for(i=0;i<n;i++)
			for(j=0;j<q;j++)
			{
				c[i][j]=0;
				for(k=0;k<m;k++)
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
	cout<<"\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<q;j++)
			cout<<a[i][j]<<"\n";
		cout<<"\n";
	}
	getch();
}







