package Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        System.out.println(e.getMax());
        e.setMax(15);
        System.out.println(e.getMax());
        e.setMax(100);
        System.out.println(e.getMax());
        System.out.println(e.getPrice());
        e.setPrice(50.40);
        System.out.println(e.getPrice());
        System.out.println(e.getName());
        e.setName("Satyait");
        System.out.println(e.getName());
        System.out.println(e.getCh());
        e.setCh('c');
        System.out.println(e.getCh());
    }
}
