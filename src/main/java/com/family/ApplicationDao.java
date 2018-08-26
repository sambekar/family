package com.family;

import com.family.Person;

import java.util.List;

public interface ApplicationDao {
    void createPerson(Person bo);
    List<Person> getAllPersons();
}
