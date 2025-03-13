class User
{
public static double area()
{
double x = 0.5;
double b = 7;
double h = 5;
double res = x*b*h;
return res;
}
}
class Triangle
{
public static void main(String [] args)
{
double fres = User.area();
System.out.println(fres);
}
}