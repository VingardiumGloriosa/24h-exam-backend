package com.example.exambackend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteId;

    @ManyToOne
    @JoinColumn(name="candidateId")
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name="partyId", nullable=false)
    private Party party;


    public Vote(Candidate candidate, Party party){
        this.candidate = candidate;
        this.party = party;
    }

    public Vote(Party party){
        this.party = party;
    }

    public Vote() {

    }
}
