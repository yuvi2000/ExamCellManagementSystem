import java.util.Scanner;
class Example4
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ch:");
ch=sc.next().charAt(0);
switch(ch)
{
case'g':
System.out.println("Gayathri");
break;
case'y':
System.out.println("Yuvi");
break;
case'd':
System.out.println("Divya");
break;
default:
System.out.println("Not found");
break;
}
}
}
