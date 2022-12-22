package progra3.payroll.logic;
import java.util.HashMap;

public class Container {
    private HashMap<Integer, Person> people;

    public Container() {
        people = new HashMap<Integer, Person>();
    }

    public void add(Person entering) {
        people.put(entering.getId(), entering);
    }

    public void remove(Person removing) {
        people.remove(removing.getId());
    }

    public Person getPerson(int finding) {
        return people.get(finding);
    }

    @Override
    public String toString() {
        return "Container{" +
                "people=" + people +
                '}';
    }
}
