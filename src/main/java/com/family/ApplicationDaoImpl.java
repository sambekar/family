package com.family;

import com.family.Person;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ApplicationDaoImpl implements ApplicationDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void createPerson(Person bo){
        em.persist(bo);
    }

    @Override
    public List<Person> getAllPersons() {
        return em.createQuery("from Person").getResultList();
    }
}
