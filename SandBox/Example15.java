class yy
{
int a;
void show()
{
display(this);
}
void display(yy obj)
{
System.out.println(obj.a);
}
}
class Example15
{
public static void main(String args[])
{
yy obj1=new yy();
obj1.a=5;
obj1.show();
}
}