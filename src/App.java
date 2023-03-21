import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        QuestionOne();
        QuestionTwo();
    }

    public static void QuestionOne() {
        ArrayList<Person> persons = new ArrayList<>();
        
        persons.add(new Person("person1", 100, "address 1", new Address("street 1", "city 1", "state 1")));
        persons.add(new Person("person2", 101, "address 2", new Address("street 2", "city 2", "state 2")));
        persons.add(new Person("person3", 102, "address 3", new Address("street 3", "city 3", "state 3")));
        persons.add(new Person("person4", 103, "address 4", new Address("street 4", "city 4", "state 4")));

        for(var person : persons) {
            person.Print();
        }
    }

    public static void QuestionTwo() {
        ArrayList<NoRelationship> persons = new ArrayList<>();

        persons.add(new NoRelationship("person1", 100, "address 1", "street 1", "city 1", "state 1"));
        persons.add(new NoRelationship("person2", 101, "address 2", "street 2", "city 2", "state 2"));
        persons.add(new NoRelationship("person3", 102, "address 3", "street 3", "city 3", "state 3"));
        persons.add(new NoRelationship("person4", 103, "address 4", "street 4", "city 4", "state 4"));

        for(var person : persons) {
            person.Print();
        }
    }
}
