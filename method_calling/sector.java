class Sector
{
public static void area()
{
double r = 17.32;
int angle = 60;
double pi = 3.142;
double res = pi*r*r*angle/360;
System.out.println(res);
}
public static void main(String [] args)
{
area();
}
}