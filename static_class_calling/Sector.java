class Area
{
public static void sector()
{
int angel = 45;
double pi = 3.142;
double r = 15.40;
double res = pi * r * r * angel/360;
System.out.println(res);
}
}
class Sector
{
public static void main(String [] args)
{
Area.sector();
}
}