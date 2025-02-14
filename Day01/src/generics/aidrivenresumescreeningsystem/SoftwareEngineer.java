package com.generics.aidrivenresumescreeningsystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public boolean isEligible() {
        return getExperience() >= 2;
    }
}