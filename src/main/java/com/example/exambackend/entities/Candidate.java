package com.example.exambackend.entities;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.repos.PartyRepository;
import com.example.exambackend.services.PartyService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    @Column(length =20,nullable = false)
    private String first_name;

    @Column(length =20,nullable = false)
    private String last_name;

    @ManyToOne
    @JoinColumn(name="partyId")
    private Party party;

    public Candidate() {
    }

    public Candidate(String first_name, String last_name, Party party){
        this.first_name = first_name;
        this.last_name = last_name;
        this.party = party;
    }

    public Candidate(Candidate candidate) {
        this.first_name = candidate.getFirst_name();
        this.last_name = candidate.getLast_name();
        this.party = candidate.getParty();
    }

    public Candidate(CandidateDTO candidate) {
        this.first_name = candidate.getFirst_name();
        this.last_name = candidate.getLast_name();
        this.party = new Party(candidate.getPartyId());
    }
}
