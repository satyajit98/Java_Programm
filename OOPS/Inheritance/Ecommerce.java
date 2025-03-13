class Product
{
    String name;
    double price;

    Product(){}

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}
class Electronic extends Product
{
    String brand;
    double warrantyPeriod;

    Electronic(){}

    Electronic(String name, double price, String brand, double warrantyPeriod){
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
}

class SmartPhone extends Electronic
{
    double cameraSpecs;
    double batteryCapacity;

    SmartPhone(String name, double price, String brand, double warrantyPeriod, double cameraSpecs, double batteryCapacity){
        super(name, price, brand, warrantyPeriod);
        this.cameraSpecs = cameraSpecs;
        this.batteryCapacity = batteryCapacity;
    }

    public void displayDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Price is : "+price);
        System.out.println("Brand is : "+brand);
        System.out.println("Warranty Period is : "+warrantyPeriod + " Year");
        System.out.println("Camera Specification is : "+cameraSpecs + " Mega Pixel");
        System.out.println("Battery Capacity is : "+batteryCapacity + " MAH");
        System.out.println("--------------------------");
    }
}

class Ecommerce
{
    public static void main(String [] args){
        SmartPhone sp = new SmartPhone("Nord CE 3", 30000D, "OnePlus", 1.5D, 50D, 5000);
        SmartPhone sp1 = new SmartPhone("16 pro max", 180000D, "iPhone", 1D, 50D, 4550);
        sp.displayDetails();
        sp1.displayDetails();
    }
}