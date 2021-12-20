package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.entities.Candidate;
import com.example.exambackend.repos.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    public List<CandidateDTO> getCandidates(){
        return CandidateDTO.CandidateDTOSfromCandidate(candidateRepository.findAll());
    }
}
