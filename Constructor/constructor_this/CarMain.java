class Car
{
	String registration_number;
	String model;
	String manufacturer;
	double price;
	String fuel_type;
	double milage;
	
	public Car(String registration_number, String model, String manufacturer, double price, String fuel_type, double milage){
		this.registration_number = registration_number;
		this.model= model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.fuel_type = fuel_type;
		this.milage = milage;
	}
	
	public void display(){
		System.out.println(registration_number);
		System.out.println(model);
		System.out.println(manufacturer);
		System.out.println(price);
		System.out.println(fuel_type);
		System.out.println(milage);
	}
}

class CarMain
{
	public static void main(String [] args){
	Car c1 = new Car("WB34HU7687", "ALTO 800", "FSXDR2345675", 750000D, "DISEL", 23.5);
	c1.display();
	
	}
}