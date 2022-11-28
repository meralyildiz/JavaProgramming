package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("David", 'G', 20, 10000);
        employee1.setAge(35);
        employee1.setGender('M');
        System.out.println(employee1);

        Employee employee2 =new Employee("Maria", 'F', 50, 115000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+ 15000);
        System.out.println(employee2);

    }

}
