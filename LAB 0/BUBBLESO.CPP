#include<iostream.h>
#include<conio.h>
void main()
{
	int a[100],i,j,n,temp;
	cout<<"Enter the number of elements:";
	cin>>n;
	cout<<"Enter the elements now:";
	for(i=0;i<n;i++)
		cin>>a[i];
	for(i=0;i<n-1;i++)
		for(j=0;j<n-i-1;j++)
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
	for(i=0;i<n;i++)
		cout<<a[i]<<"\n";
	getch();
}