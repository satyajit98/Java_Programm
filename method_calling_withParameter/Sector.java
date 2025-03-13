class Sector
{
public static void sector(double r, double angel)
{
double res= 3.142*r*r*angel/360;
System.out.println(res);
}
public static void main(String [] args)
{
sector(14.14, 180);
}
}