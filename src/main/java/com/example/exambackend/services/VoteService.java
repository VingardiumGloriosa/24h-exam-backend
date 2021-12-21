package com.example.exambackend.services;

import com.example.exambackend.entities.Vote;
import com.example.exambackend.repos.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepo){
        voteRepository = voteRepo;
    }

    public List<Vote> getAllVotes(){
        return voteRepository.findAll();
    }

    public void addVote(Vote vote){
        voteRepository.save(vote);
    }
}
