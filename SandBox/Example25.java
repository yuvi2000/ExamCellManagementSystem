class Example25
{
int rollno;
String name;
int age;
Example25(int rollno,String name,int age)
{
this.rollno=rollno;
this.name=name;
this.age=age;
}
void show()
{
System.out.println(rollno+""+name+""+age);
}
public static void main(String args[])
{
Example25 obj=new Example25(101,"yuvi",19);
obj.show();
}
}