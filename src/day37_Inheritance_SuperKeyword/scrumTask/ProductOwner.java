package day37_Inheritance_SuperKeyword.scrumTask;

public class ProductOwner extends Employee {

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void requirementGathering(){
        System.out.println(name+ " is gathering requirements");

    }
}
