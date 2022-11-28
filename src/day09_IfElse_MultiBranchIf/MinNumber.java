package day09_IfElse_MultiBranchIf;

public class MinNumber {
    public static void main(String[] args) {
       int n1 = 100;
       int n2 = 100;
       boolean n1isMinNumber = n1 <n2; // n1 is less than n2
       boolean n2isMinNumber = n2 < n1; // n2 is less then n1
       boolean isEqual = n1 == n2;

       if(n1isMinNumber){ // if n1 is the minimum number than print "n1 is the minimum number"
           System.out.println(n1 + " is Minimum Number");
       }

        if(n2isMinNumber){ //if n2 is the minimum number than print "n2 is the minimum number"
            System.out.println(n2 + " is Minimum Number");
        }
        if(isEqual){ // if n1 is equal to n2
            System.out.println( n1 + " is Equal to " +n2);
        }

    }

}
/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */