class Encap
{
    private int rollNumber;
    private String name;

    public int getrollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class EncapMain
{
    public static void main(String [] args){
        Encap e1 = new Encap();
        System.out.println(e1.getrollNumber());
        e1.setRollNumber(123);
        System.out.println(e1.getrollNumber());
        System.out.println("--------------");

        System.out.println(e1.getName());
        e1.setName("Satyaijt");
        System.out.println(e1.getName());

    }
}