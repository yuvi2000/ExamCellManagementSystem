import java.util.Scanner;
class Example3
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.nextInt();
System.out.println("Enter b value:");
b=sc.nextInt();
if(a>50)
{
System.out.println("pass");
if(b>=90)
{
System.out.println("Grade A");
}
else
{
System.out.println("Grade B");
}
}
else
{
System.out.println("fail");
}
}
}
