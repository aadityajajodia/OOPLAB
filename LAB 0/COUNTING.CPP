#include<iostream.h>
#include<conio.h>
void main()
{
	char str[100];
	int i;
	cout<<"Enter the string:";
	cin>>str;
	int a[1000]={0};
	for(i=0;str[i];i++)
	       a[(int)str[i]]++;
	cout<<"character"<<"\t"<<"Occurance"<<"\n";
	for(i=0;i<1000;i++)
		if(a[i]!=0)
			if((i>='1'&&i<='9')||i=='a'||i=='e'||i=='i'||i=='o'||i=='o')
				cout<<(char)(i)<<"\t\t"<<a[i]<<"\n";
	getch();
}
