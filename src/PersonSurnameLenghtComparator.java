import java.util.Comparator;

public class PersonSurnameLenghtComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameWordsO1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surnameWordsO2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (surnameWordsO1.length < surnameWordsO2.length) {
            return -1;
        } else if (surnameWordsO1.length > surnameWordsO2.length) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
