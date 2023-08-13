public class ReadOnly {
    private String name = "Marcin";
    // getter uzyskanie wartosci z pol prywatnych
//    public String getName(){
//        return name + "jest ok";
//    }

//    public void setName(String name){ // settery umozliwiaja ustawienie wartosci pola prywatnego
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
