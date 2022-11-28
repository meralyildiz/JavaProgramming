package day32_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Julia", 'F');

        Employee employee3 = new Employee("Meral", 'F', "SDET");

        Employee employee4 = new Employee("Heidi", 'F', "QA", 120000);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);





    }
}
