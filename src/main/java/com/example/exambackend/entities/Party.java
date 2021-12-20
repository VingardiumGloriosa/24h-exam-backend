package com.example.exambackend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Party {

    @Id
    private String partyId;

    @Column(length =40,nullable = false)
    private String partyName;

    public Party() {
    }
/*
    public Party(String id,String partyName) {
        this.partyId = id;
        this.partyName = partyName;
    }
*/

}
