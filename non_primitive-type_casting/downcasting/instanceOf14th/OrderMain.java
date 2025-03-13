class Order
{
    int OrderId;

    Order(){}

    Order(int OrderId){
        this.OrderId = OrderId;
    }
    public void orderDone(){

    System.out.println("Order Successfully");
    System.out.println("----------------------------");
    }
}

class Laptop extends Order
{
    String brand;
    double price;
    
    Laptop(int OrderId, String brand, double price){
        super(OrderId);
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("The OrderId is: "+ OrderId);
        System.out.println("The Brand is: "+ brand);
        System.out.println("The Price is: "+ price);

    }
}

class Mobile extends Order
{
    String brand;
    double price;
    
    Mobile(int OrderId, String brand, double price){
        super(OrderId);
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("The OrderId is: "+ OrderId);
        System.out.println("The Brand is: "+ brand);
        System.out.println("The Price is: "+ price);

    }
}
class Ac extends Order
{
    String brand;
    double price;
    
    Ac(int OrderId, String brand, double price){
        super(OrderId);
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("The OrderId is: "+ OrderId);
        System.out.println("The Brand is: "+ brand);
        System.out.println("The Price is: "+ price);

    }
}

class OrderMain
{
    public static void checkInstance(Order o){
        if(o instanceof Laptop){
            Laptop l = (Laptop)o;
            l.orderDone();
            l.displayDetails();
        }
        else if(o instanceof Mobile){
            Mobile m = (Mobile)o;
            m.orderDone();
            m.displayDetails();
        }
        else{
            Ac a = (Ac)o;
            a.orderDone();
            a.displayDetails();
        }
    }

    public static void main(String [] args){
        Order o1 = new Laptop(201, "HP", 79998.00D);
        Order o2 = new Mobile(301, "Mobile", 29998.00D);
        Order o3 = new Ac(401, "Blue star", 49998.00D);
        checkInstance(o3);
    }
}