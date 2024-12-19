public class Person {

    // Atribut privat
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter pentru age
    public int getAge() {
        return age;
    }

    // Setter pentru age
    public void setAge(int age) {
        this.age = age;
    }

    // Metodă pentru afișare
    public void afisare() {
        System.out.println("Person's age is: " + age);
    }
}
