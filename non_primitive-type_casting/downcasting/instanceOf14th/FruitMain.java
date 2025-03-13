class Fruit
{

}
class Apple extends Fruit
{
    public void test(){
        System.out.println("The test of apple is sweet");
    }
}

class Orange extends Fruit
{
    public void test(){
        System.out.println("The test of Orange is mile-Sweet");
    }
}

class Banana extends Fruit
{
    public void test(){
        System.out.println("The test of Banana is also Sweet");
    }
}

class FruitMain
{
    public static void checkInstance(Fruit f){
        if(f instanceof Apple){
            Apple a = (Apple)f;
            a.test();
        }
        else if(f instanceof Orange){
            Orange o = (Orange)f;
            o.test();
        }
        else
        {
            Banana b = (Banana)f;
            b.test();
        }
    }

    public static void main(String [] args){
        Fruit f = new Banana();
        checkInstance(f);
    }
}