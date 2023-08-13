package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke za pomoca firefoxa");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca firefoxa");

    }
}
