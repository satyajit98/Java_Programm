import java.util.Scanner;
class Vowel
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        char val = sc.next().charAt(0);
        if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}