class Sector
{
public static double sector(double r, double d)
{
double res = 3.142*r*r*d/360;
return res;
}
public static void main(String [] args)
{
double fres = sector(15.75, 45);
System.out.println(fres);
}
}