class Trapezoid
{
public static double trapezoid (double a, double h)
{
double res = 0.5 * (a+a) * h;
return res;
}
public static void main(String [] args)
{
double fres = trapezoid(11.40, 12.30);
System.out.println(fres);
}
}