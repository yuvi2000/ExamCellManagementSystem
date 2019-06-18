class Example13
{
int a=10;
void show(int a) 
{
a=12;
int sum=this.a+a;
System.out.println("Sum of two nos :"+sum);
}
void display() 
{
int a=25;
int mul=this.a*a;
System.out.println("multiply of two nos:"+mul);
}
public static void main(String args[]) 
{		
Example13 obj = new Example13();
obj.show(50);
obj.display();
}
}
