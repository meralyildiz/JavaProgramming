package day34_GarbageCollection_AccessModifiers;

public class CydeoStudents {

    public String studentName;
    public static String schoolName;
    public CydeoStudents(String studentName){
        this.studentName = studentName;
        // schoolName = "Cydeo School";

     }
    static {
         schoolName = "CydeoSchool";
     }
}

class CydeoStudentsObject{
    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Jimmy");
        CydeoStudents student2 = new CydeoStudents("Harun");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
