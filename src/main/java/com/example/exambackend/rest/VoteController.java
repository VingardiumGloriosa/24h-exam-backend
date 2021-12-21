package com.example.exambackend.rest;

import com.example.exambackend.entities.Vote;
import com.example.exambackend.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.VersionPathStrategy;

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

    @PostMapping("/vote/{partyID}/{candidateID}")
    public void vote(@PathVariable String partyID, @PathVariable int candidateID ){
        Vote temp = new Vote(partyID,candidateID);
        voteService.addVote(temp);
    }

    @PostMapping("/vote/{partyID}")
    public void voteForParty(@PathVariable String partyID){
        Vote temp = new Vote(partyID);
        voteService.addVote(temp);
    }

}
