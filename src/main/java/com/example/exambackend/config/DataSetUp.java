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
        Party p6 = new Party("Ø","Enhedslisten + De Rød Grønne");

        //Creating candidates
        Candidate c1 = new Candidate("Marcel","Meijer",p1);
        Candidate c2 = new Candidate("Michael","Kristensen",p1);
        Candidate c3 = new Candidate("Helle","Hansen",p1);
        Candidate c4 = new Candidate("Karina","Knobelauch",p1);
        Candidate c5 = new Candidate("Stefan","Hafstein Wolffbrandt",p1);
        Candidate c6 = new Candidate("Robert","V. Rasmussen",p1);
        Candidate c7 = new Candidate("Pia","Ramsing",p1);
        Candidate c8 = new Candidate("Anders","Baun Sørensen",p1);

        //Creating votes
        Vote v1 = new Vote(c1);
        Vote v2 = new Vote(c1);
        Vote v3 = new Vote(c1);
        Vote v4 = new Vote(c1);
        Vote v5 = new Vote(c1);
        Vote v6 = new Vote(c1);
        Vote v7 = new Vote(c1);

        //saving all created above to db
        partyRepository.save(p1);
        partyRepository.save(p2);
        partyRepository.save(p3);
        partyRepository.save(p4);
        partyRepository.save(p5);
        partyRepository.save(p6);

        candidateRepository.save(c1);
        candidateRepository.save(c2);
        candidateRepository.save(c3);
        candidateRepository.save(c4);
        candidateRepository.save(c5);
        candidateRepository.save(c6);
        candidateRepository.save(c7);
        candidateRepository.save(c8);

        voteRepository.save(v1);
        voteRepository.save(v2);
        voteRepository.save(v3);
        voteRepository.save(v4);
        voteRepository.save(v5);
        voteRepository.save(v6);
        voteRepository.save(v7);

    }
}
