class Parent
{
    int a=100;
    public void m1(){
        System.out.println("This is the parent method");
    }
}

class Child extends Parent
{
    int a =10;
    public void m1()
    {
        super.m1();
        System.out.println(a);
        // System.out.println(super.a);
        System.out.println("this is the child method");
    }

}

class ChildMain5
{
    public static void main(String [] args){
        Child p = new Child();
        p.m1();
    }
}