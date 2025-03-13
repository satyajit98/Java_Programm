class Fruit
{
    public void m1(){
        System.out.println("Inside the m1 method");
    }
}

class Apple extends Fruit
{
    public void m2(){
        System.out.println("Inside the m2 method");
    }
}

class KashmirApple extends Apple
{
    public void m3(){
        System.out.println("Inside the m3 method");
    }
}

class Upcasting
{
    public static void main(String [] args){
        Apple f = new KashmirApple();
        f.m1();
        f.m2();
        // f.m3(); //CTE
    }
}