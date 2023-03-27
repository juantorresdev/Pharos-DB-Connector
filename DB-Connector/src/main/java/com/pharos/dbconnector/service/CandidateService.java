package com.pharos.dbconnector.service;

import com.pharos.dbconnector.model.Candidate;

public interface CandidateService {
    public Candidate createCandidate();
    public Candidate updateCandidate();
    public Candidate getCandidate();
    public Candidate deleteCandidate();
}
