class Example16
{
public static void main(String args[])
{
try
{
int b=100/0;
System.out.println(b);
}
catch(ArithmeticException e)
{
System.out.println("Divide by 0:"+e);
}
finally
{
System.out.println("close");
}
}
}