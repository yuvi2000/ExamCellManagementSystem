import java.util.Scanner;
class Example1
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
i=sc.nextInt();
if(i%2==0)
{
System.out.println("Even mumber");
}
else
{
System.out.println("Odd number");
}
}
}