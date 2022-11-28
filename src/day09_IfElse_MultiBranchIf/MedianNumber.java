package day09_IfElse_MultiBranchIf;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 20;
        boolean AisMedianNumber = (a > b && a < c) || (a >c && a < b);
        boolean BisMedianNumber = (b > a  && b < c) || (b >c && b < a);
        boolean CisMedianNumber = !AisMedianNumber && !BisMedianNumber;

        if (AisMedianNumber) { //if a median number
            System.out.println(" A is median number");
        }
        if (BisMedianNumber) { //if b median number
            System.out.println(" B is median number");
        }

        if (CisMedianNumber) { //if c median number
        System.out.println(" C is median number");
            }

        }

    }

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number




Single if: for one condition
 */