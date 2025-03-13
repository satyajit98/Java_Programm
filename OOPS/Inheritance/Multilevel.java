class Car
{
    String carName;
    double carPrice;

    Car(){}
    Car(String carName, double carPrice){
        this.carName = carName;
        this.carPrice = carPrice;
    }
}
class Bike extends Car
{
    String bikeName;
    double bikePrice;

    Bike(){

    }
    Bike(String carName, double carPrice, String bikeName, double bikePrice){
        super(carName, carPrice);
        this.bikeName = bikeName;
        this.bikePrice = bikePrice;
    }
}
class Scooty extends Bike
{
    String scootyName;
    double scootyPrice;

    Scooty(String carName, double carPrice, String bikeName, double bikePrice, String scootyName, double scootyPrice){
        super(carName, carPrice, bikeName, bikePrice);
        this.scootyName = scootyName;
        this.scootyPrice = scootyPrice;
    }
}
class Multilevel
{
    public static void main(String [] args){
        Scooty s = new Scooty("Bugati", 50000000D, "Ducati", 2500000D, "Burgman", 150000);
        System.out.println(s.carName);
        System.out.println(s.carPrice);
        System.out.println(s.bikeName);
        System.out.println(s.bikePrice);
        System.out.println(s.scootyName);
        System.out.println(s.scootyPrice);
    }
}