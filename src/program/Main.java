package program;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Adam", "Kowalski", 25, "Warszawa");

        PersonService.savePerson(person, "person.txt");

        Person personLoad = PersonService.loadPerson("person.txt");
        System.out.println(personLoad.toString());
    }
}
