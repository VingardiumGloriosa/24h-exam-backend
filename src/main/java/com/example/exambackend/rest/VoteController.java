package com.example.exambackend.rest;

import com.example.exambackend.entities.Vote;
import com.example.exambackend.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/votes")
public class VoteController {

    @Autowired
    VoteService voteService;

    public VoteController(VoteService voteSer){
        voteService = voteSer;
    }

    @GetMapping
    public List<Vote> getVotes(){
        return voteService.getAllVotes();
    }

}
