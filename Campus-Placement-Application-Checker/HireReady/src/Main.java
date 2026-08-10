public class Main {

    public static void main(String[] args) {

        // Candidate Details
        String candidateName = "Ananya Sharma";
        int registrationNumber = 24089;
        String degree = "B.Tech Computer Science and Engineering";
        int graduationYear = 2026;
        double degreePercentage = 78.4;
        int activeBacklogs = 0;

        int aptitudeCorrectAnswers = 42;
        int aptitudeTotalQuestions = 50;

        int codingTestCasesPassed = 9;
        int codingTotalTestCases = 10;

        int communicationScore = 75;

        boolean projectCompleted = true;
        boolean profileVerified = true;

        // Calculate Aptitude Percentage with type casting before division
        double aptitudePercentage = ((double) aptitudeCorrectAnswers / aptitudeTotalQuestions) * 100.0;

        // Calculate Coding Percentage with type casting before division
        double codingPercentage = ((double) codingTestCasesPassed / codingTotalTestCases) * 100.0;

        // Individual Eligibility Conditions
        boolean degreeEligible = degreePercentage >= 60.0;
        boolean backlogEligible = activeBacklogs == 0;
        boolean graduationYearEligible = graduationYear >= 2025 && graduationYear <= 2027;
        boolean aptitudeEligible = aptitudePercentage >= 60.0;
        boolean codingEligible = codingPercentage >= 70.0;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean profileEligible = profileVerified;

        // Combined Eligibility Condition using Logical AND
        boolean applicationEligible = degreeEligible && backlogEligible && graduationYearEligible
                && aptitudeEligible && codingEligible && communicationEligible
                && projectEligible && profileEligible;

        // Display Candidate Details and Assessment Report
        System.out.println("================================================");
        System.out.println("        CAMPUS PLACEMENT APPLICATION REPORT     ");
        System.out.println("================================================");
        System.out.println("Candidate Name          : " + candidateName);
        System.out.println("Registration Number     : " + registrationNumber);
        System.out.println("Degree                  : " + degree);
        System.out.println("Graduation Year         : " + graduationYear);
        System.out.println("Degree Percentage       : " + degreePercentage);
        System.out.println("Active Backlogs         : " + activeBacklogs);
        System.out.println("------------------------------------------------");
        System.out.println("Aptitude Score          : " + aptitudeCorrectAnswers + " / " + aptitudeTotalQuestions);
        System.out.println("Aptitude Percentage     : " + aptitudePercentage);
        System.out.println("Coding Test Cases       : " + codingTestCasesPassed + " / " + codingTotalTestCases);
        System.out.println("Coding Percentage       : " + codingPercentage);
        System.out.println("Communication Score     : " + communicationScore);
        System.out.println("Project Completed       : " + (projectCompleted ? "Yes" : "No"));
        System.out.println("Profile Verified        : " + (profileVerified ? "Yes" : "No"));
        System.out.println("------------------------------------------------");
        System.out.println("Degree Eligibility      : " + (degreeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Backlog Eligibility     : " + (backlogEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Graduation Year         : " + (graduationYearEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Aptitude Eligibility    : " + (aptitudeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Coding Eligibility      : " + (codingEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Communication Status    : " + (communicationEligible ? "Eligible" : "Not Eligible"));
        System.out.println("------------------------------------------------");

        // Condition Checking Order (Section 12 & 13)
        if (applicationEligible) {
            System.out.println("Application Status      : Eligible to Apply");
            System.out.println("Next Action             : Submit the company application");
        } else if (!degreeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve degree percentage");
        } else if (!backlogEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Clear active backlogs");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Check graduation-year criteria");
        } else if (!aptitudeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve aptitude performance");
        } else if (!codingEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve coding performance");
        } else if (!communicationEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve communication");
        } else if (!projectEligible) {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete the project");
        } else if (!profileEligible) {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete profile verification");
        }

        System.out.println("================================================");
    }
}
