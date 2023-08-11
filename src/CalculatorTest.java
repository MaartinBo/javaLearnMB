import java.util.Scanner;

public class CalculatorTest {
    // napisz program który poprosi użytkownika o 2 liczby, a następnie wykonana na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj drugą liczbe");
        int secondNumber = scanner.nextInt();

        // rozwiazanie pierwotne


//        int addition = firstNumber + secondNumber;
//        int subtraction = firstNumber - secondNumber;
//        int multiplication = firstNumber * secondNumber;
//        float division = firstNumber/secondNumber;
//        int mod = firstNumber%secondNumber;

        // rozwiazanie z użyciem obiektu klasy kalkulator

        Calculator calculator = new Calculator();
        System.out.println("Dodawania: " + calculator.add(firstNumber,secondNumber));
        System.out.println("Odejmowanie: " + calculator.subtraction(firstNumber,secondNumber));
        System.out.println("Dzielenie: " + calculator.division(firstNumber,secondNumber));
        System.out.println("Mnożenie: " + calculator.multiplication(firstNumber,secondNumber));
        System.out.println("Modulo: " + calculator.mod(firstNumber,secondNumber));
    }
}
