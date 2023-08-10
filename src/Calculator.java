import java.util.Scanner;

public class Calculator {
    // napisz program który poprosi użytkownika o 2 liczby, a następnie wykonana na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj drugą liczbe");
        int secondNumber = scanner.nextInt();

        // 1 rozwiazanie
//        System.out.println("Wynik dodawania obydwu liczb to "  + (firstNumber+secondNumber));
//        System.out.println("Wynik odejmowania obydwu liczb to" + (firstNumber-secondNumber));
//        System.out.println("Wynik mnożenia  obydwu liczb to "  + (firstNumber*secondNumber));
//        System.out.println("Wynik dzielenia obydwu liczb to "  + (firstNumber/secondNumber));

        // 2 rozwiazanie

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);

    }
}
