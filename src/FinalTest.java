public class FinalTest {
    public static void main(String[] args) {
        final int x = 2;
//        x = 5;

        final Person person = new Person("Marcin", 27);
        person.age = 25;

      //  person = new Person("Tom", 22)  pola typu final są niezmienne nie da się nadpisać ich wartosci
    }
}
