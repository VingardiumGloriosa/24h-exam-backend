package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.dtos.PartyDTO;
import com.example.exambackend.repos.CandidateRepository;
import com.example.exambackend.repos.PartyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    PartyRepository partyRepository;

    public PartyService(PartyRepository partyRepository){
        this.partyRepository = partyRepository;
    }

    public List<PartyDTO> getParties(){
        return PartyDTO.PartyDTOSfromParties(partyRepository.findAll());
    }
}
