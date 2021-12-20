package com.example.exambackend.dtos;

import com.example.exambackend.entities.Party;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PartyDTO {

    private String name;

    public PartyDTO(Party party){
        this.name = party.getPartyName();
    }
}
