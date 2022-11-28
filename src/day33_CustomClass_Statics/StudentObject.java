package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Meral");
        Student student2 = new Student("Maria",'F');
        Student student3 = new Student("Ahmad",'M', 28);
        Student student4 = new Student("John",'M', 29, 235689);
        Student student5 = new Student("Elif",'F', 45, 147896, 'A');
        Student student6 = new Student("Giulia",'F', 13);

        Student[] students = {student1, student2, student3, student4,student5, student6};



        System.out.println(student1);
        System.out.println(Arrays.toString(students));
    }
}
