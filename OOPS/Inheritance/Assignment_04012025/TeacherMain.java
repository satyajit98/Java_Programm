class Teacher
{
    private String name;
    private String subject;

    Teacher(){}

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    public void teach(){
        System.out.println(name + " Teach : "+ subject);
        System.out.println("------------------------");
    }
}

class MathTeacher extends Teacher
{
    private String specialization;
    
    MathTeacher(String name, String subject, String specialization){
        super(name, subject);
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void conductExam(){
        System.out.println(getName() + " Conducting exam for this subject : "+ getSubject());
        System.out.println("------------------------");
    }

    public void displayDetails(){
        System.out.println("------------------------");
        System.out.println("Teacher Properties");
        System.out.println("Teacher name is : "+ getName());
        System.out.println("Subject is : "+ getSubject());
        System.out.println("Speciality is : "+ getSpecialization());
        System.out.println("------------------------");
    }
}

class TeacherMain
{
    public static void main(String args [])
    {
        MathTeacher mt = new MathTeacher("Akshay", "Java", "Java king");
        MathTeacher mt1 = new MathTeacher("Sunil Kumar R", "Math", "Math Expert");
        mt.displayDetails();
        mt.teach();
        mt.conductExam();

        mt1.displayDetails();
        mt1.teach();
        mt1.conductExam();
    }
}