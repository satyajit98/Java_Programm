class Student
{
static String teachername ="ramesh";
String s = "apple";
int x = 30;
static
{
System.out.println("This is Static block");
}
public void study()
{
System.out.println("Styding");
}
{
System.out.println("In non static block");
}
public static void main(String [] args)
{
Student s1 = new Student();
s1.study();
Student s2 = new Student();
s2.study();
}
}