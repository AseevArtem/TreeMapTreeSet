import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Artem", "Aseev General Admiral", 33));
        people.add(new Person("Nikolay", "Medvedev Petuxov", 28));
        people.add(new Person("Aram", "Kolobkov First King", 17));
        people.add(new Person("Olya", "Li May Chu", 20));
        people.add(new Person("Anna", "Suxova", 16));
        people.add(new Person("Annet", "Petrova Petrova", 29));
        people.add(new Person("Marina", "Petrova-Vasechkina-Gluxova", 50));

        Predicate<Person> predicate = person -> person.getAge() < 18;


        people.removeIf(predicate);
        System.out.println(people);


    }
}
