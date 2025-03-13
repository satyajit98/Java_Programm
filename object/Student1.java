class Student1
{
    static String teacherName = "Govind Sir";
    String name;
    int rollNo;
    char gender;
    long phoneNo;
    int age;
}

class StudentMain
{
    public static void main(String [] args)
    {
        Student1.teacherName = "Akshay Slathia";
        Student1 s1 = new Student1();
        s1.name ="Satyajit";
        s1.rollNo = 120;
        s1.gender = 'M';
        s1.phoneNo = 9823453421L;
        s1.age = 23;

        System.out.println("Printing the details of 1st student");
        System.out.println("Name is : "+s1.name);
        System.out.println("Roll no is : "+ s1.rollNo);
        System.out.println("Gender is : "+s1.gender);
        System.out.println("Phone no is : "+s1.phoneNo);
        System.out.println("Age is : "+s1.age);
        System.out.println("Teacher Name is : "+Student1.teacherName);

        Student1 s2 = new Student1();
        s2.name = "Kartik";
        s2.rollNo = 230;
        s2.gender = 'M';
        s2.phoneNo = 8793834578l;
        s2.age = 26;

        System.out.println("-------------------------------------------------------------");
         System.out.println("Name is : "+s2.name);
        System.out.println("Roll no is : "+ s2.rollNo);
        System.out.println("Gender is : "+s2.gender);
        System.out.println("Phone no is : "+s2.phoneNo);
        System.out.println("Age is : "+s2.age);
        System.out.println("Teacher Name is : "+Student1.teacherName);    

    }
}