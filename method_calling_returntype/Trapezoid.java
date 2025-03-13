class Trapezoid
{
public static double trapezoid()
{
double a = 21.43;
double h = 12.73;
double res = 0.5 * (a+a) * h;
return res;
}
public static void main(String [] args)
{
double fres = trapezoid();
System.out.println(fres);
}
}