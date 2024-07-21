import java.util.Scanner;
import java.util.Locale;

public class Testes {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
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