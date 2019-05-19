package com.molokotech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import com.molokotech.model.Person;

public interface PersonRespository extends JpaRepository<Person, Long>{

}
