package com.generics.aidrivenresumescreeningsystem;
import java.util.ArrayList;
import java.util.List;
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Furqan", 3));
        applicants.add(new DataScientist("Anubhav", 2));
        applicants.add(new ProductManager("Deepansh", 6));

        ScreeningPipeline.processResumes(applicants);
    }
}
