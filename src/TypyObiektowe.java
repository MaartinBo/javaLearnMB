public class TypyObiektowe {


    public static void main(String[] args) {
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty
        Long fourthNumber = 2148000L; // 8 bajtów

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
        Double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku

        // wartość logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedyczny znak
        Character letter = 'A';

        // ciagi znakow
        String hello = "Hello Marcin";

        System.out.println(hello.charAt(0));

    }
}
