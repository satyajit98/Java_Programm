//Create a class Program 1 and declare 2 non-static variable, assign with a suitable constructor.(local and non-static variables names different).

class Program1
{
	String name;
	int age;
	
	public Program1(String num, int ages)
	{
		name = num;
		age = ages;
	}

}

class Program1Main
{
	public static void main(String [] args)
	{
		Program1 p1 = new Program1("satya", 24);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}