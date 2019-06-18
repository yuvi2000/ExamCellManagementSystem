import java.util.Scanner;
class Example2
{
public static void main(String args[])
{
int mark;
Scanner s=new Scanner(System.in);
System.out.println("Enter the mark:");
mark=s.nextInt();
if(mark>90&&mark<=100)
{
System.out.println("Grade A");
}
else if(mark>70&&mark<=90)
{
System.out.println("Grade B");
}
else if(mark>50&&mark<=70)
{
System.out.println("Grade c");
}
else if(mark>40&&mark<=50)
{
System.out.println("Grade D");
}
else
{
System.out.println("Fail");
}
}
}
