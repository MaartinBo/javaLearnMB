// Stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy i dodaj wszystkie 4 metody.
public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student jan = new Student();
        jan.email = "jan@gmail.com";
        jan.nick = "Janula.J";
        jan.nazwisko = "Janowski";
        jan.imie = "Jan";
        jan.numerIndeksu = 123;
        String uczelniaAdama = jan.nazwaUczelni;
        jan.infoUczelnia();


        Student kasia = new Student();
        kasia.email = "kasia@gmail.com";
        kasia.nick = "Kasiula.K";
        kasia.nazwisko = "Kasiowska";
        kasia.imie = "Kasia";
        kasia.numerIndeksu = 124;

        Student ola = new Student();
        ola.email = "ola@gmail.com";
        ola.nick = "Ola.O";
        ola.nazwisko = "Olowa";
        ola.imie = "Ola";
        ola.numerIndeksu = 125;

        Student[] students = new Student[3];
        students[0] = jan;
        students[1] = kasia;
        students[2] = ola;

        for (int i=0; i <students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }

    }
}
