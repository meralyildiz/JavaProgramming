package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        //domain:
        int beginningIndex = email.indexOf("@")+1;
        int endigIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endigIndex);
        System.out.println("domain = " + domain);

        System.out.println("---------------------------------------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        String s1 = str1.substring(0, 10+1) ; //"Java is fun"
        System.out.println("s1 = " + s1);

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg, end ); //Java is cool
        System.out.println("s2 = " + s2);

        String s3 = str1. substring(str1. lastIndexOf("I") );
        System.out.println("s3 = " + s3);
    }
}

/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

 */
