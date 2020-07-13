package com.Kotori.mapper;

import com.Kotori.domain.Person;

public interface PersonMapper {
    public Person getPersonById(Integer id);

    public void insertPerson(Person person);
}
