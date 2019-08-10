package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream()
                .filter(person -> person.getAge()<18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return null;
    }
}
