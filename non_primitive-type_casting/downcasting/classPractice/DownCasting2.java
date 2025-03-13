class School
{
    int schoolId;
    String schoolName;

    School(){}
    School(int schoolId, String schoolName){
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public void displaySchool(){
        System.out.println("School Id is: "+ schoolId);
        System.out.println("School Name is: "+schoolName);
        System.out.println("-----------------------------");
    }
}

class Teacher extends School
{
    int teacherId;
    String teacherName;
    Teacher(int schoolId, String schoolName, int teacherId, String teacherName){
        super(schoolId, schoolName);
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }
    public void displayTeacher(){
        System.out.println("School Id is: "+schoolId);
        System.out.println("School Name is: "+schoolName);
        System.out.println("Teacher Id is: "+teacherId);
        System.out.println("Teacher Name is: "+teacherName);
        System.out.println("-------------------------------");
    }
}

class JavaTeacher extends Teacher
{
    String subject;
    JavaTeacher(int schoolId, String schoolName, int teacherId, String teacherName, String subject){
        super(schoolId, schoolName, teacherId, teacherName);
        this.subject = subject;
    }
    public void displayJavaTeacher(){
        System.out.println("School Id is: "+schoolId);
        System.out.println("School Name is: "+schoolName);
        System.out.println("Teacher Id is: "+teacherId);
        System.out.println("Teacher Name is: "+teacherName);
        System.out.println("Subject is: "+subject);
        System.out.println("-------------------------------");
    }

}

class DownCasting2
{
    public static void main(String [] args){
    School s = new JavaTeacher(120, "Dabcha Nabakola High School", 1103, "Monajit", "English");
    Teacher t = new JavaTeacher(120, "Dabcha Nabakola High School", 1103, "Monajit", "English");
    s.displaySchool();
    // s.displayTeacher(); //CTE
    // s.displayJavaTeacher(); //CTE
    t.displaySchool();
    t.displayTeacher();
    // t.displayJavaTeacher(); //CTE
    JavaTeacher j = (JavaTeacher)s;
    j.displaySchool();
    j.displayTeacher();
    j.displayJavaTeacher();
    }

}