// stworz klase bazowa App - zawiera pole name i metoda appInfo, dodaj konstruktor do ktore przekażesz wartosc name
// stworz kalse potomna AndroiApp i IphoneApp - zawiera metode runAndroidApp/ runIphoneApp
public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.appInfo();
        android.runAnrodiApp();

        IphoneApp iphone = new IphoneApp("Calculator");
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
