package com.example.exambackend.dtos;

import com.example.exambackend.entities.Candidate;
import com.example.exambackend.entities.Party;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
@AllArgsConstructor
public class PartyDTO {

    private String name;

    public PartyDTO(Party party){
        this.name = party.getPartyName();
    }

    public static List<PartyDTO> PartyDTOSfromParties(Iterable<Party> parties){
        List<PartyDTO> dtos = StreamSupport.stream(parties.spliterator(), false)
                .map(party -> new PartyDTO(party))
                .collect(Collectors.toList());
        return dtos;
    }
}
