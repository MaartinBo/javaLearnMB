public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//
//        int result = metody.pobierzWynik();
//        int result2 = result *2;
//        System.out.println("Rezultat przed mnożeniem to; " + result);
//        System.out.println("Rezultat po mnożeniu to; " + result2);
//        metody.policzWynikParam(2);
//        metody.policzWynikParam(100);
//        metody.policzWynikParam(23);
        int result = metody.add(2,3, "hello");
        System.out.println(metody.add(2,6, "hello2"));
        System.out.println(result);
    }
}
