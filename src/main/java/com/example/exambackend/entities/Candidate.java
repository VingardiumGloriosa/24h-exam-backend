package com.example.exambackend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    @JoinColumn(name="partyId", nullable=false)
    private Party party;

    public Candidate() {
    }

    public Candidate(String first_name, String last_name, Party party){
        this.first_name = first_name;
        this.last_name = last_name;
        this.party = party;
    }
}
