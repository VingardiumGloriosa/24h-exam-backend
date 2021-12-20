package com.example.exambackend.dtos;

import com.example.exambackend.entities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class VoteDTO {

    private String candidate;
    private String party;

    public VoteDTO(Candidate candidate){
        this.candidate = candidate.getFirst_name()+" "+candidate.getLast_name();
        this.candidate = candidate.getParty().getPartyName();
    }
}
