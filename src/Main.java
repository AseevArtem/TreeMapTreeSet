import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> comparator = (o1, o2) -> {
            String[] surnameWordsO1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surnameWordsO2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            if (surnameWordsO1.length < surnameWordsO2.length) {
                return -1;
            } else if (surnameWordsO1.length > surnameWordsO2.length) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(people, comparator);
        Collections.reverse(people);
        System.out.println(people);
    }
}
