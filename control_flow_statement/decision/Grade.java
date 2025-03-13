import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int num = sc.nextInt();
		num = num/10;
		switch(num){
			case 10: System.out.println("A+"); break;
			case 9: System.out.println("A"); break;
			case 8: System.out.println("B+"); break;
			case 7: System.out.println("B"); break;
			case 6: System.out.println("C+"); break;
			case 5: System.out.println("C"); break;
			case 4: System.out.println("E"); break;
			default: System.out.println("Fail");
		}
	}
}
