class Example12
{
void show()
{
System.out.println("hello");
}
void display()
{
System.out.println("world");
show();
}
public static void main(String args[])
{
Example12 obj=new Example12();
obj.display();
}
}