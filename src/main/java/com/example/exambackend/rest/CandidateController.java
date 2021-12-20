package com.example.exambackend.rest;

import com.example.exambackend.dtos.CandidateDTO;
import com.example.exambackend.services.CandidateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {

    CandidateService candidateService;

    public CandidateController(CandidateService candidateSer){
        candidateService = candidateSer;
    }

    @GetMapping
    List<CandidateDTO> getCandidates(){
        return candidateService.getCandidates();
    }
}
