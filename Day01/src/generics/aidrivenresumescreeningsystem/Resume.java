package com.generics.aidrivenresumescreeningsystem;
class Resume<T extends JobRole> {
    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + candidate.getCandidateName());
        if (candidate.isEligible()) {
            System.out.println("Candidate is eligible for the job.");
        } else {
            System.out.println("Candidate does not meet the eligibility criteria.");
        }
    }
}