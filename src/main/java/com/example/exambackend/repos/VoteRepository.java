package com.example.exambackend.repos;

import com.example.exambackend.entities.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends CrudRepository<Vote,Integer> {
    List<Vote> findAll();
}
