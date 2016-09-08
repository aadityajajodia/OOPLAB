#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	struct stddet
	{
		int reg;
		char name[20];
		int marks1;
		int marks2;
		int marks3;
		int result;
		char grade[2];
	};
	stddet students;
	cout<<"enter the details";
	cin>>students.reg;
	cin>>students.name;
	cin>>students.marks1;
	cin>>students.marks2;
	cin>>students.marks3;
	students.result=(students.marks1+students.marks2+students.marks3)/3;
	if(students.result>90)
	       {	students.grade[0]= 'A';
		students.grade[1]='+';   }
	else
	if(students.result>80)
	       {	students.grade[0]= 'A';
		students.grade[1]='.';   }
	else
	if(students.result>70)
	      {	students.grade[0]= 'B';
		students.grade[1]='.'; }
	else
	if(students.result>60)
		{students.grade[0]= 'C';
		students.grade[1]='.';}
	else
	if(students.result>50)
	       {students.grade[0]= 'D';
		students.grade[1]='.';}
	else
	if(students.result>40)
		{students.grade[0]= 'E';
		students.grade[1]='.';}
	 else
		{students.grade[0]= 'F';
		students.grade[1]='.';}
	cout<<students.name<<"  "<<students.grade[0]<<students.grade[1];
	getch();
}