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
    public void m3()
    {
        System.out.println("This is the m3 method");
    }
    public void m4()
    {
        System.out.println("this is the m4 method");
    }

}

class ChildMain1
{
    public static void main(String [] args){
        Parent p = new Parent();
        p.m4();
    }
}