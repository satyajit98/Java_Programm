//Create a class Program 4 and create 3 objects and print the reference of current object in non static method.

class Program4
{
	int age;
	String name;
	
	public void m1()
	{
		System.out.println(this);
	}
}

class Program4Main
{
	public static void main(String [] args)
	{
		Program4 p1 = new Program4();
		System.out.println(p1);
		p1.m1();

		Program4 p2 = new Program4();
		System.out.println(p2);
		p2.m1();

		Program4 p3 = new Program4();
		System.out.println(p3);
		p3.m1();	
	}
}