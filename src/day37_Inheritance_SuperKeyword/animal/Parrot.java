package day37_Inheritance_SuperKeyword.animal;

public class Parrot extends Animal{

    public Parrot(String name,String breed, char gender, int age, String size, String colour ){
        super(name,breed,gender,age,size,colour);

    }
    public void sing (){
        System.out.println(name+ " is singing ");
    }
}
