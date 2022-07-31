import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        boolean prime = true;
        //want to take number and divide it by all numbers up to half the value of the number and check for a remainder of 0

        System.out.println("Enter a number and I'll tell you if it's a prime number.");
        number = input.nextInt();
        //System.out.println(number);

        for (int i = 2; i <= (number / 2); i++){
            System.out.println(number + " divided by " + i + " = " + number % i);
            if(number % i == 0){
                System.out.println(number + " is not prime.");
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println(number + " is prime.");
        }
    }
}