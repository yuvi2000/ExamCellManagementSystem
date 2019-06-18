class Example17
{
public static void main(String args[])
{
try
{
int[] a=new int[4];
a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
System.out.println(a[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
finally
{
System.out.println("close");
}
}
}