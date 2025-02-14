package com.generics.aidrivenresumescreeningsystem;
import java.util.List;
class ScreeningPipeline {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Screening: " + role.getCandidateName());
            System.out.println("Eligibility: " + (role.isEligible() ? "Accepted" : "Rejected"));
            System.out.println();
        }
    }
}