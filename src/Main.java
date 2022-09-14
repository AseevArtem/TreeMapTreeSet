import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Artem", "Aseev General Admiral", 33));
        people.add(new Person("Nikolay", "Medvedev Petuxov", 28));
        people.add(new Person("Aram", "Kolobkov First King", 45));
        people.add(new Person("Olya", "Li May Chu", 20));
        people.add(new Person("Anna", "Suxova", 25));
        people.add(new Person("Annet", "Petrova Petrova", 29));
        people.add(new Person("Marina", "Petrova-Vasechkina-Gluxova", 50));


        Collections.sort(people, new PersonSurnameLenghtComparator());
        Collections.reverse(people);
        System.out.println(people);


    }
}
