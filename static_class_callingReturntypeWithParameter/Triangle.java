class User
{
public static double area(double x, int b, int h)
{
double res = x * b * h;
return res;
}
}
class Triangle
{
public static void main(String [] args)
{
double res = User.area(0.5, 10, 5);
System.out.println(res);
}
}