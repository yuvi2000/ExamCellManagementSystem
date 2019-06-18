class Dog
{
String color="white";
void eat()
{
System.out.println("Eating flesh");
}
}
class Animal extends Dog
{
String color="black";
void eat()
{
System.out.println("Eating bread");
}
void printcolor()
{
//System.out.println(color);
//System.out.printn(super.color);
super.eat();
this.eat();
}
}
class Example24
{
public static void main(String args[])
{
Animal obj=new Animal();
obj.printcolor();
}
}
