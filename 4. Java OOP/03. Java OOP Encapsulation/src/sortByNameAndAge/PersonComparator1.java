package sortByNameAndAge;

import java.util.Comparator;

public class PersonComparator1 implements Comparator<Person1> {
    @Override
    public int compare(Person1 firstPerson, Person1 secondPerson) {
        int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
        if (sComp != 0) {
            return sComp;
        } else {
            return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
        }
    }
}
