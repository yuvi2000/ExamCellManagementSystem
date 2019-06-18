class Example8
{
static int s=7;
int r=2;
void rectangle()
{
int l=1,b=2;
System.out.println("Area of rectangle:");
System.out.println(l*b);
System.out.println("Perimeter of rectangle:");
System.out.println(2*l*b);
}
static void square()
{
System.out.println("Area of square:");
System.out.println(s*s);
System.out.println("Perimeter of square:");
System.out.println(4*s);
}
void circle()
{
formula obj=new formula();
System.out.println("Area of circle:");
System.out.println(Math.PI*obj.r*obj.r);
System.out.println("Perimeter of circle:");
System.out.println(2*Math.PI*obj.r);
}
public static void main(String args[])
{
formula obj=new formula();
obj.rectangle();
square();
obj.circle();
}
}