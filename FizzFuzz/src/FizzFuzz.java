import java.util.Scanner;

public class FizzFuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = Integer.parseInt(input.next());

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzFuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Fuzz");
        } else
            System.out.println(number);
    }
}
