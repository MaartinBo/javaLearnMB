public class MathTeacher extends Person {
    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathteacher");
        this.school = school;
    }

    public void walk(){
        super.walk();
        System.out.println("I walk very fast");
        //  method overwriting przesłoniecie działanie metody z klasy bazowej w klasie potmonej
    }

    public void teachMath(){
        System.out.println("I am teaching Math!");
    }
    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
