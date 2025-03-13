class Faculty
{
static String instituteName = "kolkata QSpider";
String name;
long fNo;
String location;
String subject;
int age;
long phoneNo;
char gender;

    public void displayStudentDetails()
    {
        System.out.println("Institute name is : "+ instituteName);
        System.out.println("Faculty name is : "+ name);
        System.out.println("Faculty number : "+ fNo);
        System.out.println("Faculty address is  : "+ location);
        System.out.println("Faculty subject is : "+ subject);
        System.out.println("Faculty age is : "+ age);
        System.out.println("Faculty gender is : "+ gender);
    }
}

class FacultyMain
{
public static void main(String [] agrs)
{
Faculty f1 = new Faculty();
f1.name = "Akshay Slathia";
f1.fNo = 12345678L;
f1.location = "Jammu & Kashmir";
f1.subject = "Java";
f1.age = 30;
f1.phoneNo = 8798983786L;
f1.gender = 'M';
f1.displayStudentDetails();
}
}