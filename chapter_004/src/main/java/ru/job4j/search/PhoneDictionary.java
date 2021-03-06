package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> tstPhone = p -> (p.getPhone().equals(key));
        Predicate<Person> tstName = p -> (p.getName().equals(key));
        Predicate<Person> tstSurname = p -> (p.getSurname().equals(key));
        Predicate<Person> tstAddress = p -> (p.getAddress().equals(key));
        Predicate<Person> combine = tstPhone.or(tstName.or(tstSurname.or(tstAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}