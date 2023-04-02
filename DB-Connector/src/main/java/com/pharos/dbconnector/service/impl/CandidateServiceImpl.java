package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.entities.Candidate;
import com.pharos.dbconnector.repository.CandidateRepository;
import com.pharos.dbconnector.service.CandidateService;
import com.pharos.dbconnector.wrapper.request.CandidateRequest;
import com.pharos.dbconnector.wrapper.response.CandidateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public CandidateResponse createCandidate(CandidateRequest candidateRequest) {

        Candidate candidate = convertRequestToModel(candidateRequest);

        candidate.setPharosId(UUID.randomUUID().toString());
        candidate.setEnable("true");
        candidate.setStatus("true");

        candidateRepository.save(candidate);

        CandidateResponse response = null;

        return response;
    }

    @Override
    public CandidateResponse updateCandidate(CandidateRequest candidateRequest) {
        return null;
    }

    @Override
    public CandidateResponse getCandidate() {
        return null;
    }

    @Override
    public CandidateResponse deleteCandidate(CandidateRequest candidateRequest) {
        return null;
    }

    private Candidate convertRequestToModel(CandidateRequest candidateRequest) {
        Candidate candidate = new Candidate();
        candidate.setName(candidateRequest.name);
        candidate.setLastname(candidateRequest.lastname);
        candidate.setBirthdate(candidateRequest.birthdate);
        candidate.setEmail(candidateRequest.email);
        candidate.setPhone(candidateRequest.phone);

        return candidate;
    }
}