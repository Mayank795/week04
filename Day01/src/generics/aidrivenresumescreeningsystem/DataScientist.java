package com.generics.aidrivenresumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public boolean isEligible() {
        return getExperience() >= 3;
    }
}