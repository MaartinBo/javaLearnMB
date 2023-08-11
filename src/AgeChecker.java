import java.util.Scanner;

/* Zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informacje że nei może kupić alko,
Gdy ma więcej niż 18 lat to podziękuj za zakupy
*/
public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj swój wiek");
        int age = scanner.nextInt();
        if (age < 18 && age >= 0) {
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age < 0 ) {
            System.out.println("Wprowadz poprawną wartość");
        }   else {
            System.out.println("Dziękujemy za zakupy! Zapraszamy ponownie");
        }
    }
}
