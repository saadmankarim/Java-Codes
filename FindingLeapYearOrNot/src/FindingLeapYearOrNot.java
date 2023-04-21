import java.util.Scanner;

public class FindingLeapYearOrNot {

    public static void main(String[] args) {

        Scanner readConsole=new Scanner(System.in);
        System.out.println("Please enter the year to find out is it leap year or not:");

        int year=readConsole.nextInt();

        if (year % 400 == 0){
            System.out.println("The year " +year+ " is a leap year");
            }
        else if (year % 100 == 0){
            System.out.println("The year " +year+ " is not a leap year");
        }
        else if (year % 4 == 0){
            System.out.println("The year " +year+ " is a leap year");
        }
        else{
            System.out.println("The year " +year+ " is not a leap year");
        }
    }
}
