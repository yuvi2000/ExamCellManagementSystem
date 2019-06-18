class Example14
{	
Example14() 
{
this(5,10);
System.out.println("Constructor without parameter");
}
Example14(int a,int b) 
{
int sum=a+b;
System.out.println("Sum of two nos:" + sum);
}
public static void main(String[] args) 
{
Example14 obj = new Example14();
}
}