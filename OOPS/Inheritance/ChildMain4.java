class Parent
{
    public void m1(){
        System.out.println("This is the m1 method");
    }
    public void m2(){
        System.out.println("This is the m2 method");
    }
}

class Child extends Parent
{
    int a = 435;
    public void m3()
    {
        int a = 2344;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println("This is the m3 method");
    }
    public void m4()
    {
        System.out.println("this is the m4 method");
    }

}

class ChildMain4
{
    public static void main(String [] args){
        Child p = new Child();
        p.m3();
    }
}