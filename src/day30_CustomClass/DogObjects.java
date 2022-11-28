package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

       Dog dog1   = new Dog();
       dog1.name  = "Lucy";
       dog1.breed = "Husky";
       dog1.age   = 5;
       dog1.gender = 'F';
       dog1.size   = "Small";
       dog1.colour = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name  = "AC";
        dog2.breed = "Husky";
        dog2.age   = 5;
        dog2.gender= 'M';
        dog2.size  = "Large";
        dog2.colour = "White";
        System.out.println(dog2);
    }



}

