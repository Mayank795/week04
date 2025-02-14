package Collectionframework.insurancepolicymanagementsystemamap;

import java.time.LocalDate;

class Policy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{Number=" + policyNumber + ", Holder=" + policyholderName + ", Expiry=" + expiryDate +
                ", Type=" + coverageType + ", Premium=" + premiumAmount + "}";
    }
}


