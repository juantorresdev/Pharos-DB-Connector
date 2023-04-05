package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Candidate;
import com.pharos.dbconnector.wrapper.request.CandidateRequest;
import com.pharos.dbconnector.wrapper.response.CandidateResponse;

import java.util.List;

public interface CandidateService {
    public CandidateResponse createCandidate(CandidateRequest candidateRequest);
    public CandidateResponse updateCandidate(CandidateRequest candidateRequest);
    public CandidateResponse getCandidate();
    public CandidateResponse deleteCandidate(CandidateRequest candidateRequest);
    public List<Candidate> getCandidates();
}
