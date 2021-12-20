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
    @JoinColumn(name="candidateId", nullable=false)
    private Candidate candidate;


    public Vote(Candidate candidate){
        this.candidate = candidate;
    }

    public Vote() {

    }
}
