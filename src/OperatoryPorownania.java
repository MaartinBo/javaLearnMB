import java.util.Scanner;

// porownuja lementy rownania i zwracaja logiczna wartosc (true/false)
public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe a");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj drugą liczbe b");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber; // true
        System.out.println(result);
        System.out.println("a > b :" + (firstNumber>secondNumber));
        System.out.println("a < b :" + (firstNumber<secondNumber));
        System.out.println("a >= b :" + (firstNumber>=secondNumber));
        System.out.println("a <= b :" + (firstNumber<=secondNumber));
        System.out.println("a = b :" + (firstNumber == secondNumber));
        System.out.println("a != b :" + (firstNumber != secondNumber));

    }
}
