import java.util.ArrayList;
import java.util.Scanner;

public class Calculator implements Display, Primes {

    @Override
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int int1 = scanner.nextInt();
        System.out.println("Enter second integer");
        int int2 = scanner.nextInt();
        System.out.println(int1 + int2);
    }

    @Override
    public boolean checkIsPrime(int number) {
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }   return true;

    }

    @Override
    public void printPrimeFactors(int number) {
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    public ArrayList range(int num1, int num2) {
        ArrayList<Integer> range = new ArrayList<Integer>();
        for(int i = num1; i < num2; i++) {
            range.add(i);
        }
        return range;
    }

}
