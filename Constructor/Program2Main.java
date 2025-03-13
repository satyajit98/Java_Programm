//Create a class Program 2 and declare 2 non-static variable, assign with a suitable constructor.(local and non-static variables names same).

class Program2
{
	String name;
	int age;

	public Program2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Program2Main
{
	public static void main(String [] args)
	{
		Program2 p2 = new Program2("Satya", 24);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}