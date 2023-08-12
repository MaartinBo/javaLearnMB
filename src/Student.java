public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = " AGH po zmianie";

    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguje sie za pomoca " + nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Mój email to : " + email);
    }

    public static void infoUczelnia(){
//        System.out.println("Nazywam sie " + imie + " " + nazwisko); // w metodzie statycznej możemy sie odwolywac tylko do pol statycznych lub do innych metod statycznych
        System.out.println("Moja uczelnia to" + nazwaUczelni );
        druga();
    }
    public static void druga(){
        System.out.println("Jestem drugą metoda");
    }
}
