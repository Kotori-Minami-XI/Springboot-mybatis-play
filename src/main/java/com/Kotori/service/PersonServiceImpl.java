package com.Kotori.service;

import com.Kotori.domain.Person;
import com.Kotori.mapper.PersonMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{
    @Resource
    private PersonMapper personMapper;

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.getPersonById(id);
    }

    @Override
    public void insertPerson(Person person) {
        personMapper.insertPerson(person);
    }
}
