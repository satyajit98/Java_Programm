class Circle
{
public static double circle(double p, double r)
{
double res = p*r*r;
return res;
}
public static void main(String [] args)
{
double fres = circle(3.142, 17.34);
System.out.println(fres);
}
}