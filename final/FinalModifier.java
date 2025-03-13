class Variable
{
    
    final public void m1(){
        System.out.println("Inside the final method");
    }

}

/*final class InheritClass extends Variable
{

    // System.out.println("Inside the Final class");
}*/

class FinalModifier
{
    public static void main(String [] args){
    
    final int x;
    x = 10;
    x = 2000;

    Variable v = new Variable();
    System.out.println(x);
    // v.m1();
    }

    
}

