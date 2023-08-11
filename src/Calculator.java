// stworz nową klase która będzie sie nazywać kalkulator, ta klasa ma posaidać 5 metod, 1 metoda = operacja matematyczna, każda ma zwracać inta
public class Calculator {

    public int add(int firstNumber, int secondNumber){
        System.out.println("Suma to: ");
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public float mod(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }
}
