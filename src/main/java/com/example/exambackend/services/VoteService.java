package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.entities.Vote;
import com.example.exambackend.repos.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoteService {

    VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepo){
        voteRepository = voteRepo;
    }

    public List<Vote> getAllVotes(){
        System.out.println("suck my dick");
        return voteRepository.findAll();
    }
}
