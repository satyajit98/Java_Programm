class Vehicle
{
    private String brand;
    private int speed;

    Vehicle(){}
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }

    public void start(){
        System.out.println("Bike is starting");
        System.out.println("-------------------");
    }

    public void stop(){
        System.out.println("Bike is stopping");
        System.out.println("-------------------");
    }
}

class Bike extends Vehicle
{
    private String type;
    
    public String getType(){
        return type;
    }

    Bike(String brand, int speed, String type){
        super(brand, speed);
        this.type = type;
    }

    public void displayDetails(){
        System.out.println("Bike Properties");
        System.out.println("-------------------");
        System.out.println("Brand is : "+ getBrand());
        System.out.println("Speed is : "+ getSpeed()+"Km/H");
        System.out.println("Type is : "+ getType());
        System.out.println("-------------------");
    }

    public void doWheelie(){
        System.out.println("Bike is wheelie");
        System.out.println("-------------------");
    }

}

class BikeMain
{
    public static void main(String [] args){
        Bike bike = new Bike("Suzuki", 320, "Petrol");
        bike.displayDetails();
        bike.start();
        bike.doWheelie();
        bike.stop();
    }
}