package com.Kotori.service;

import com.Kotori.domain.Person;
import com.Kotori.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService{
    @Resource
    private PersonMapper personMapper;

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.getPersonById(id);
    }
}
