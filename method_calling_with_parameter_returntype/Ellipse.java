class Ellipse
{
public static double ellipse(double p, double a, double b)
{
double res = p*a*b;
return res;
}
public static void main(String [] args)
{
double fres = ellipse(3.142, 12.34, 15.20);
System.out.println(fres);
}
}