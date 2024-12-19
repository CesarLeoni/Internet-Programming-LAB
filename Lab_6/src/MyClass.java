public class MyClass {

    public static void main(String[] args) {
        System.out.println("Modular Java Programming");

        // Instanțierea clasei Person
        Person person = new Person(25);

        // Afișarea vârstei
        person.afisare();

        // Modificarea vârstei cu setter
        person.setAge(30);

        // Reafișarea vârstei actualizate
        person.afisare();
    }
}
