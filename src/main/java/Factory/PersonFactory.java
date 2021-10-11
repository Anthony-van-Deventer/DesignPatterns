package Factory;

public class PersonFactory {
    private int indexOfPerson;
    public Person createPerson(String name)
    {
        Person person = new Person(indexOfPerson,name);
        indexOfPerson++;
        return person;
    }
}
