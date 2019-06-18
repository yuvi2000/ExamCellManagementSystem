class Example20
{
int rollno;
String name;
void show(int id,String n)
{
rollno=id;
name=n;
}
void display()
{
System.out.println(rollno+""+name);
}
public static void main(String args[])
{
new Example20().show(101,"yuvi");
new Example20().display(101,"yuvi");

}
}

