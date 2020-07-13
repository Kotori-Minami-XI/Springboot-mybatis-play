package com.Kotori.service;

import com.Kotori.domain.Person;

public interface PersonService {
    public Person getPersonById(Integer id);

    public void insertPerson(Person person);
}
