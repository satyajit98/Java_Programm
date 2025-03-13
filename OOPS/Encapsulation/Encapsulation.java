class Encapsulation
{
    private int max;
    public int getMax()
    {
        return max;
    }
    public void setMax(int max)
    {
        this.max = max;
    }
}

class EncapsulationMain
{
    public static void main(String [] args)
    {
        Encapsulation e = new Encapsulation();
        System.out.println(e.getMax());
        e.setMax(145);
        System.out.println(e.getMax());
    }
}