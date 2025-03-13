abstract class Demo
{
    abstract public void m1();
    abstract public void m2();
    public void m3(){
        System.out.println("Inside the demo class in m3 method");
    }
    public void m4(){
        System.out.println("Inside the demo class in m4 method");
    }
}
class Sample extends Demo
{
    @Override
    public void m1(){
        System.out.println("Inside the sample class in m1 method");
    }
    @Override
    public void m2(){
        System.out.println("Inside the sample class in m2 method");
    }
}

class Test
{
    public static void main(String [] args){
        Sample s = new Sample();
        s.m1();
        s.m2();
        s.m3();
        s.m4();
        // Demo d = new Demo(); // we cann't create obejct of abstract class
    }
}