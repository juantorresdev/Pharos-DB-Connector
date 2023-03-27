package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.model.Candidate;
import com.pharos.dbconnector.repository.CandidateRepository;
import com.pharos.dbconnector.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public Candidate createCandidate() {
        return null;
    }

    @Override
    public Candidate updateCandidate() {
        return null;
    }

    @Override
    public Candidate getCandidate() {
        return null;
    }

    @Override
    public Candidate deleteCandidate() {
        return null;
    }
}