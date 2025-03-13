class Sector
{
public static double sector()
{
double pi= 3.142;
double r = 7.50;
int angle = 180;
double res = pi*r*r*angle/360;
return res;
}
public static void main(String [] args)
{
double fres = sector();
System.out.println(fres);
}
}