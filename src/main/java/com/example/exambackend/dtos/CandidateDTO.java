package com.example.exambackend.dtos;

import com.example.exambackend.entities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Getter
@Setter
public class CandidateDTO {

    private String first_name;
    private String last_name;

    private String party;

    public CandidateDTO(Candidate candidate){
        this.first_name = candidate.getFirst_name();
        this.last_name = candidate.getLast_name();
        this.party = candidate.getParty().getPartyName();
    }

    public static List<CandidateDTO> CandidateDTOSfromCandidate(Iterable<Candidate> candidates){
        List<CandidateDTO> dtos = StreamSupport.stream(candidates.spliterator(), false)
                .map(candidate -> new CandidateDTO(candidate))
                .collect(Collectors.toList());
        return dtos;
    }

}
