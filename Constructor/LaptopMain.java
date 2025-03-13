class Laptop
{
	// non-static variable
	String name;
	String color;
	double price;
	String modelName;
	int ram;

	// Constructor
	public Laptop(String name, String color, double price, String modelName, int ram)
	{
		this.name = name;
		this.color = color;
		this.price = price;
		this.modelName = modelName;
		this.ram = ram;
	}

	// non-static method
	public void display()
	{
		System.out.println("Laptop name is : "+name);
		System.out.println("Laptop color is : "+color);
		System.out.println("Laptop price is : "+price);
		System.out.println("Laptop modelname is : "+modelName);
		System.out.println("Laptop ram is : "+ram);
		System.out.println("-------------------------------");
	}

}

class LaptopMain
{
	public static void main(String [] args)
	{
		// creating object and pass the value
		Laptop l1 = new Laptop("HP", "Silver", 45.000, "15-da0326TU", 20);
		//calling method
		l1.display();
		
		Laptop l2 = new Laptop("Dell", "Black", 65.000, "Dell-da3445LU", 16);
		l2.display();
	}
}