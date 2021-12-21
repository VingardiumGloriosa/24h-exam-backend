package com.example.exambackend.rest;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.entities.Candidate;
import com.example.exambackend.entities.Party;
import com.example.exambackend.services.CandidateService;
import com.example.exambackend.services.PartyService;
import com.example.exambackend.services.VoteService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @Autowired
    PartyService partyService;

    public CandidateController(CandidateService candidateSer){
        candidateService = candidateSer;
    }

    @GetMapping
    public List<CandidateDTO> getCandidates(){
        return candidateService.getCandidates();
    }

    @GetMapping("/all")
    public List<Candidate> getAllCandidates(){
        return candidateService.getAllCandidates();
    }

    @GetMapping("/party/{partyId}")
    public List<CandidateDTO> getCandidatesByParty(@PathVariable String partyId){
        return candidateService.getCandidatesByParty(partyId);
    }

    @PostMapping("/addCandidate/{partyId}/{first_name}/{last_name}")
    public CandidateDTO addCandidate(@PathVariable String partyId,@PathVariable String first_name,@PathVariable String last_name){
        CandidateDTO temp = new CandidateDTO(first_name,last_name,partyId);
        candidateService.addCandidate(temp);
        return temp;
    }

    @DeleteMapping("/delete/{candidateId}")
    public void deleteCandidate(@PathVariable int candidateId){
        candidateService.deleteCandidate(candidateId);
    }

    @PutMapping("/editByPartyId/{candidateId}/{first_name}/{last_name}/{partyId}")
    public void editCandidate(@PathVariable int candidateId,
                                   @PathVariable String first_name,
                                   @PathVariable String last_name,
                                   @PathVariable String partyId){
        candidateService.editCandidate(candidateId,first_name,last_name,new Party(partyService.getPartyById(partyId.toUpperCase())));
    }

}
