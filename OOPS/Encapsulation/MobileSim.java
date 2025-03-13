class Sim
{
    String simProvider;
    Long simNo;
}

class Mobile
{
    Sim slot;

    public void addSim(Sim slot){
        if(this.slot == null){
            this.slot = slot;
            System.out.println("Sim inserted Successfully");
        }else{
            System.out.println("Sim already Exists!!");
        }
    }

    public void removeSim(){
        if(this.slot != null){
            this.slot = null;
            System.out.println("Sim removed Successfully");
        }else{
            System.out.println("Sim not present");
        }
    }
}

class MobileSim
{
    public static void main(String [] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Mobile m = new Mobile();
        boolean flag = true;

        while(flag == true){
            System.out.println("------------------------");
            System.out.println("1. Add Sim");
            System.out.println("2. Remove Sim");
            System.out.println("3. Exit");
            System.out.println("------------------------");
            System.out.println("Enter your choice: "); int choice = sc.nextInt();

            switch(choice){
                case 1: m.addSim(new Sim()); break;

                case 2: m.removeSim(); break;

                case 3: flag = false; break;

                default : System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thanks for your patience!!.. Happy New Year....");
    }
}