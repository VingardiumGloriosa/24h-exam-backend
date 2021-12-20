package com.example.exambackend.repos;

import com.example.exambackend.entities.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends CrudRepository<Party,String> {
    List<Party> findAll();
}
