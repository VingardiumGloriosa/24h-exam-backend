package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.entities.Candidate;
import com.example.exambackend.entities.Party;
import com.example.exambackend.entities.Vote;
import com.example.exambackend.repos.CandidateRepository;
import com.example.exambackend.repos.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    VoteRepository voteRepository;

    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    public List<CandidateDTO> getCandidates(){
        return CandidateDTO.CandidateDTOSfromCandidate(candidateRepository.findAll());
    }

    public List<CandidateDTO> getCandidatesByParty(String partyID){
       List<CandidateDTO> temp = new ArrayList<>();
        for (CandidateDTO temporary : CandidateDTO.CandidateDTOSfromCandidate(candidateRepository.findAll())) {
            if(temporary.getPartyId().equals(partyID.toUpperCase())){
                temp.add(temporary);
            }
        }
        return temp;
    }

    public Candidate addCandidate(CandidateDTO candidate){
        return candidateRepository.save(new Candidate(candidate));
    }

    public void deleteCandidate(int candidateId){
        for (Vote temporary : voteRepository.findAll()) {
            if(temporary.hasCandidate()){
                if(temporary.getCandidate().getCandidateId()==candidateId){
                    voteRepository.delete(temporary);
                }
            }
        }
        candidateRepository.deleteById(candidateId);
    }

    public void editCandidate(int id, String firstname, String lastname, Party party){
        Candidate orig = candidateRepository.findById(id).orElseThrow();
        orig.setFirst_name(firstname);
        orig.setLast_name(lastname);
        orig.setParty(party);
        candidateRepository.save(orig);
        System.out.println(orig.toString());
    }
}
