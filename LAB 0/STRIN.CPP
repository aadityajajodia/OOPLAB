#include<iostream.h>
#include<conio.h>
void main()
{
	cout<<"Enter two strings:";
	cin>>str1>>str2;
	for(i=0;str1[i];i++);
	str1len=i;
	for(i=0;str2[i];i++);
	str2len=i;
	cout<<str1len<<"\t"<<str2len<<"\n";
	if(str1len!=str2len)
		cout<<"Strings are not same:";
	else
	{
		for(i=0;str1[i];i++)
			if(str1[i]!=str2[i])
				flag=0;
		if(flag==1)
			cout<<"Strings are same";
	}
	getch();
}
