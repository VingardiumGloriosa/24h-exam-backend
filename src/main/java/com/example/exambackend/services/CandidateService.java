package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.entities.Candidate;
import com.example.exambackend.repos.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class CandidateService {

    CandidateRepository candidateRepository;

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
        candidateRepository.deleteById(candidateId);
    }
}
