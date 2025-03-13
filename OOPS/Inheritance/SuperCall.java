class Sample
{
    int x;
    int y;

    Sample(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Demo extends Sample
{
    int m;
    int n;

    Demo (int x, int y, int m, int n){
        super(x,y);
        this.m = m;
        this.n = n;
    }
}

class SuperCall
{
    public static void main(String [] args){
        Demo s = new Demo(100, 45, 89, 200);
        System.out.println(s.x);
        System.out.println(s.y);
        System.out.println(s.m);
        System.out.println(s.n);
    }
}