class Example7
{
public static void main(String p[])
{
int sum,a=0,b=1;
System.out.println("Fibanocci series");
do
{
System.out.println(a);
sum=a+b;
a=b;
b=sum;
}
while(a<=16);
}
}