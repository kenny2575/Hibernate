package com.example.hibernate.repository;

import com.example.hibernate.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager manager;

    public List getPersonByCity(String city) {
        Query query = manager.createQuery("select a from Persons a where a.city = :city", Persons.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}
