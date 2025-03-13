class User
{
public static void area(double x, double b, double h)
{
double res = x*b*h;
System.out.println(res);
}
}
class Triangle
{
public static void main(String [] args)
{
User.area(0.5, 12.34, 10.43);
}
}