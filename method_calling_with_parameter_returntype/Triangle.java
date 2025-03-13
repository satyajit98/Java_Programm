class Triangle
{
public static double triangle(double b, double h)
{
double res = 0.5*b*h;
return res;
}
public static void main(String [] args)
{
double fres = triangle (14.5, 19.5);
System.out.println(fres);
}
}