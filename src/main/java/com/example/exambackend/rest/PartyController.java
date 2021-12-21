package com.example.exambackend.rest;

import com.example.exambackend.dtos.PartyDTO;
import com.example.exambackend.entities.Party;
import com.example.exambackend.services.PartyService;
import com.example.exambackend.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/parties")
public class PartyController {

    @Autowired
    PartyService partyService;

    public PartyController(PartyService partySer){
        this.partyService = partySer;
    }

    @GetMapping
    public List<Party> getAllParties(){
        return partyService.getParties();
    }
}
