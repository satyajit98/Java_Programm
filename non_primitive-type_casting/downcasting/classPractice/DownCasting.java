class Vehicle
{
    int vehicleId;
    String brand;
    String vehicleType;

    Vehicle(){}
    Vehicle(int vehicleId, String brand, String vehicleType){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.vehicleType = vehicleType;
    }

    public void vehicleDetails(){
        System.out.println("Vehicle ID is : "+ vehicleId);
        System.out.println("Vehicle Brand is : "+ brand);
        System.out.println("Vehicle Type is : "+ vehicleType);
        System.out.println("--------------------------------------");
    }
}

class Car extends Vehicle
{
    String model;
    short noOfWheels;

    Car(int vehicleId, String brand, String vehicleType, String model, short noOfWheels){
        super(vehicleId, brand, vehicleType);
        this.model = model;
        this.noOfWheels = noOfWheels;
    }

    public void displayCar(){
        System.out.println("Car Id is: "+vehicleId);
        System.out.println("Car Brand is: "+brand);
        System.out.println("Car Type is: "+vehicleType);
        System.out.println("Car Model is: "+model);
        System.out.println("Car Wheels is: "+noOfWheels);
        System.out.println("--------------------------------------");
    }
}

class DownCasting
{
    public static void main(String [] args){
        Vehicle v1 = new Car(11, "Mahindra", "Car", "Thar", (short)4);
        v1.vehicleDetails();
        // v1.displayCar();
        Car c = (Car)v1;
        c.displayCar();
    }
}