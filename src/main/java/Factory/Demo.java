package Factory;

public class Demo {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person firstPerson = personFactory.createPerson("john");
        Person secondPerson = personFactory.createPerson("matt");
        System.out.println(firstPerson.toString() + " " + secondPerson.toString());

    }
}
