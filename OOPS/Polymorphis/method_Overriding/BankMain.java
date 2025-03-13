class RBI
{
    double roi()
    {
        System.out.println("Rate of Interest of RBI Bank is: 12%");
        return 3;
    }
}

class SBI extends RBI
{
    @Override
    double roi(){
    System.out.println("Rate of Interest of State Bank of India is: 15%");
    return 4;
    }

}

class HDFC extends RBI
{
    @Override
    double roi(){
    return 12;
    }
}

class ICICI extends RBI
{
    @Override
    double roi(){
    return 10;
    }
}

class BankMain
{
    public static void main(String [] args){
        RBI r;
        r = new SBI();
        r.roi();
        r = new HDFC();
        System.out.println("Rate of Interest of HDFC Bank is: "+r.roi()+"%");
        r= new ICICI();
        System.out.println("Rate of Interest of ICICI Bank is: "+r.roi()+"%");
    }
}