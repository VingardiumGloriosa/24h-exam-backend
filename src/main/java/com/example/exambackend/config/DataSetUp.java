package com.example.exambackend.config;

import com.example.exambackend.entities.Candidate;
import com.example.exambackend.entities.Party;
import com.example.exambackend.entities.Vote;
import com.example.exambackend.repos.CandidateRepository;
import com.example.exambackend.repos.PartyRepository;
import com.example.exambackend.repos.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSetUp implements CommandLineRunner {


    @Autowired
    VoteRepository voteRepository;

    @Autowired
    PartyRepository partyRepository;

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public void run(String... args) throws Exception {

        //Creating parties
        Party p1 = new Party("A","Socialdemokratiet");
        Party p2 = new Party("C","Det konservative Folkeparti");
        Party p3 = new Party("F","SF");
        Party p4 = new Party("O","Dansk Folkeparti");
        Party p5 = new Party("V","Venstre");

        //Creating candidates
        Candidate c1 = new Candidate("Marcel","Meijer",p1);
        Candidate c2 = new Candidate("Michael","Kristensen",p1);
        Candidate c3 = new Candidate("Helle","Hansen",p1);
        Candidate c4 = new Candidate("Karina","Knobelauch",p1);
        Candidate c5 = new Candidate("Stefan","Hafstein Wolffbrandt",p1);
        Candidate c6 = new Candidate("Robert","V. Rasmussen",p1);
        Candidate c7 = new Candidate("Pia","Ramsing",p1);
        Candidate c8 = new Candidate("Anders","Baun Sørensen",p1);

        Candidate c9 = new Candidate("Per","Urban Olsen",p2);
        Candidate c10 = new Candidate("Peter","Askjær",p2);
        Candidate c11 = new Candidate("Martin","Sørensen",p2);
        Candidate c12 = new Candidate("Louise","Bramstorp",p2);
        Candidate c13 = new Candidate("Sigfred","Jensen",p2);
        Candidate c14 = new Candidate("Jørn","C. Nissen",p2);
        Candidate c15 = new Candidate("Morten","Ø. Kristensen",p2);
        Candidate c16 = new Candidate("Susanne","Andersen",p2);
        Candidate c17 = new Candidate("Iulian","V. Paiu",p2);
        Candidate c18 = new Candidate("Per","Hingel",p2);

        Candidate c19 = new Candidate("Ulla","Holm",p3);
        Candidate c20 = new Candidate("Kjeld","Bønkel",p3);
        Candidate c21 = new Candidate("Anne","Grethe Olsen",p3);
        Candidate c22 = new Candidate("Lone","Krag",p3);
        Candidate c23 = new Candidate("Børge"," S. Buur",p3);

        Candidate c24 = new Candidate("Per","Mortensen",p4);

        Candidate c25 = new Candidate("Søren","Wiese",p5);
        Candidate c26 = new Candidate("Anita","Elgaard Højholt Olesen",p5);
        Candidate c27 = new Candidate("Carsten","Bruun",p5);
        Candidate c28 = new Candidate("Mogens","Exner",p5);
        Candidate c29 = new Candidate("Anja","Guldborg",p5);
        Candidate c30 = new Candidate("Klaus","Holdorf",p5);


        //Creating votes
        Vote v1 = new Vote(c1,p1);
        Vote v2 = new Vote(c1,p1);
        Vote v3 = new Vote(c1,p1);
        Vote v4 = new Vote(p1);
        Vote v5 = new Vote(p1);
        Vote v6 = new Vote(c1,p1);
        Vote v7 = new Vote(c1,p1);

        //saving all created above to db
        partyRepository.save(p1);
        partyRepository.save(p2);
        partyRepository.save(p3);
        partyRepository.save(p4);
        partyRepository.save(p5);

        candidateRepository.save(c1);
        candidateRepository.save(c2);
        candidateRepository.save(c3);
        candidateRepository.save(c4);
        candidateRepository.save(c5);
        candidateRepository.save(c6);
        candidateRepository.save(c7);
        candidateRepository.save(c8);
        candidateRepository.save(c11);
        candidateRepository.save(c12);
        candidateRepository.save(c13);
        candidateRepository.save(c14);
        candidateRepository.save(c15);
        candidateRepository.save(c16);
        candidateRepository.save(c17);
        candidateRepository.save(c18);
        candidateRepository.save(c9);
        candidateRepository.save(c10);
        candidateRepository.save(c19);
        candidateRepository.save(c20);
        candidateRepository.save(c21);
        candidateRepository.save(c22);
        candidateRepository.save(c23);
        candidateRepository.save(c24);
        candidateRepository.save(c25);
        candidateRepository.save(c26);
        candidateRepository.save(c27);
        candidateRepository.save(c28);
        candidateRepository.save(c29);
        candidateRepository.save(c30);

        voteRepository.save(v1);
        voteRepository.save(v2);
        voteRepository.save(v3);
        voteRepository.save(v4);
        voteRepository.save(v5);
        voteRepository.save(v6);
        voteRepository.save(v7);

    }
}
