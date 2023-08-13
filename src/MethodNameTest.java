public class MethodNameTest {
    public static void main(String[] args) {
        MethodName methodName = new MethodName();
        methodName.add();
        methodName.add(2);
        methodName.add("Method overloading");
        methodName.add(1,2);
        methodName.add(1,2,3);
    }
}
// Method overloading to jest definiowanie wewnątrz klasy kilku metod o tej samej nazwie i o różnych parametrach
// a method overwriting przesłoniecie działanie metody z klasy bazowej w klasie potmonej
