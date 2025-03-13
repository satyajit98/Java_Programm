class Fruit
{
    String origin;
    int quantity;

    Fruit(){}
    Fruit(String origin, int quantity){
        this.origin = origin;
        this.quantity = quantity;
    }
}

class Apple extends Fruit
{
    String taste;
    double price;

    Apple(String origin, int quantity, String taste, double price){
        super(origin, quantity);
        this.taste = taste;
        this.price = price;
    }

    public void displayApple(){
        System.out.println("Origin : "+ origin);
        System.out.println("Quantity : "+ quantity + " packets");
        System.out.println("Taste : "+ taste);
        System.out.println("Price : "+ price);
        System.out.println("------------------------");
    }
}

class Orange extends Fruit
{
    String taste;
    double price;

    Orange(String origin, int quantity, String taste, double price){
        super(origin, quantity);
        this.taste = taste;
        this.price = price;
    }

    public void displayOrange(){
        System.out.println("Origin : "+ origin);
        System.out.println("Quantity : "+ quantity + " packets");
        System.out.println("Taste : "+ taste);
        System.out.println("Price : "+ price);
        System.out.println("------------------------");
    }
}

class ExOfHirarchical
{
    public static void main(String [] args){
        Apple a = new Apple("Himachal", 10, "Sweet", 150.50D);
        a.displayApple();
        Orange o = new Orange("Kashmir", 15, "Sour", 80D);
        o.displayOrange();
    }
}