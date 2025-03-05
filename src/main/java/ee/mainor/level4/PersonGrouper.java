package ee.mainor.level4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        HashMap<String, Person> hashPeople = new HashMap<>();
        for (Person person : people) {
            hashPeople.put(person.getIdCode(), person);
        }
        return new HashMap<>(hashPeople);
    }

}
