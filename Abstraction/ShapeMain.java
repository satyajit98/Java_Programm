abstract class Shape
{
    String color;
    Shape(){}
    Shape(String color){
        this.color = color;
    }

    abstract public void drawShape();
    abstract public double calculateArea();
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(String color, double length, double breadth){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing rectangle with color: "+color+", length "+length+
                                    ", breadth "+breadth+" whose area is "+calculateArea());
        System.out.println("----------------------------------------");
    }
    @Override
    public double calculateArea(){
        return (length * breadth);
    }

}

class Circle extends Shape
{
    double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing Circle with color: "+color+
                                    ", radius "+radius+" whose area is "+calculateArea());
        System.out.println("----------------------------------------");
    }
    @Override
    public double calculateArea(){
        return (Math.PI * radius * radius);
    }
}

class Square extends Shape
{
    double side;

    Square(String color, double side){
        super(color);
        this.side = side;
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing Squre with color: "+color+
                                    ", side "+side+" whose area is "+calculateArea());
        System.out.println("----------------------------------------");
    }
    @Override
    public double calculateArea(){
        return (side * side);
    }

}

class ShapeMain
{
    public static void main(String [] args){
        Shape s;
        s = new Rectangle("Blue", 14.50, 50.14);
        s.drawShape();
        s = new Circle("Green", 15.90);
        s.drawShape();
        s = new Square("Pink", 45.85);
        s.drawShape();
    }
}