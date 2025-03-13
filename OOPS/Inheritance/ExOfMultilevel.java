class A
{
    int x;
    A(){}

    A(int x){
        this.x = x;
    }
}

class B extends A
{
    int y;

    B(){}

    B(int x, int y){
        super(x);
        this.y = y;
    }
}

class C extends B
{
    int z;

    C(){}

    C(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
}

class ExOfMultilevel
{
    public static void main(String [] args){
        A a = new A();
        B b = new B();
        C c = new C(100, 200, 300);

        System.out.println(a.x);

        System.out.println(b.x);
        System.out.println(b.y);
        
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    }
}