import java.util.Scanner;

class Login
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String userName = "Satyajit";
        String pass = "Bhunia";

        boolean flag = false;
        int no_attampts = 1;

    
        do{
            System.out.print("Enter the UserName: "); String u = sc.next();
            System.out.print("Enter the Password: "); String p = sc.next();

            if(userName.equals(u) && pass.equals(p)){
                System.out.println("Login Successful");
                flag = true;
                break;
            }else{
                no_attampts ++;
                System.out.println("You have left with "+(3 - no_attampts +1)+ " attampts");
            }
        }while(no_attampts <= 3);
        if(flag == false)
            System.out.println("Logged out for the Day");
    }
    
}