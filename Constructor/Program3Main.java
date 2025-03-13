//Create a class Program 3 and declare 3 non-static variables, create a no arguement constructor, and check what happens with the values by creating the object.(check with default as well as programmer created constructor also).

class Program3
{
	String name;
	int age;
	String location;
	
}

class Program3Main
{
	public static void main(String [] args)
	{
		Program3 p3 = new Program3();
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.location);	
	}
	
}