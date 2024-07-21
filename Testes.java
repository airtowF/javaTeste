import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorialNumber = 1;
        while (number > 1) {
            factorialNumber *= number;
            number--;
        }
        System.out.println(factorialNumber);
        scanner.close();
    }
}