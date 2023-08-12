public class UserTest {
    public static void main(String[] args) {
//        User User = new User();
        User user = new User("Marcin", "hello");
//        User.username = "Marcin";
//        User.password = "hello";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
