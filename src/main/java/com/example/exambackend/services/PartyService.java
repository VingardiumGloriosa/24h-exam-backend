package com.example.exambackend.services;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.dtos.PartyDTO;
import com.example.exambackend.entities.Party;
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

    public List<PartyDTO> getPartyDTOS(){
        return PartyDTO.PartyDTOSfromParties(partyRepository.findAll());
    }

    public List<Party> getParties(){
        return partyRepository.findAll();
    }

    public Party getPartyById(String id){
        for (Party temporary : partyRepository.findAll()) {
            System.out.println(id);
            System.out.println(temporary.getPartyId());
            if(temporary.getPartyId().equals(id.toUpperCase())){
                return temporary;
            }
        }
        return null;
    }
}
