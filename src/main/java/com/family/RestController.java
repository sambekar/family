package com.family;

import com.family.Person;
import com.family.ApplicationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ApplicationDao applicationDao;

    @RequestMapping( value = "/getAllPersons",produces = APPLICATION_JSON_VALUE)
    public List<Person> getAllPersons(){
        return applicationDao.getAllPersons();
    }
}
