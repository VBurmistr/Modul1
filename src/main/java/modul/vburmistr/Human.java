package modul.vburmistr;

public class Human implements Fightable{
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

    public void sayName() {
        System.out.println("My name is" + name);
    }

    public void sayAge() {
        System.out.println("My age is" + age);
    }

    public String getName() {
        return name;
    }

    @Override
    public void canFight() {
        System.out.println("No, im civilian");
    }

    @Override
    public void report() {
        System.out.println("I cant report im civilian");
    }
}
