package com.example.hibernate.repository;

import com.example.hibernate.entity.BasePerson;
import com.example.hibernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Persons, BasePerson> {
   List<Persons> findPersonsByCityOfLiving(@Param(value = "city_of_living") String city);
   List<Persons> findPersonsByAgeLessThanOrderByAgeAsc(int age);
   List<Optional<Persons>> findPersonsByNameSurname(String name, String surname);
}
