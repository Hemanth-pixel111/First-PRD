
public class Main {

    public static void main(String[] args) {

        String candidateName = "Aarav";
        int registrationNumber = 24031;
        String degree = "Bachelor of Engineering in Computer Science";
        int graduationYear = 2026;
        double degreePercentage = 72.5;
        int activeBacklogs = 0;
        int aptitudeCorrectAnswers = 38;
        int aptitudeTotalQuestions = 50;
        int codingTestCasesPassed = 8;
        int codingTotalTestCases = 10;
        int communicationScore = 68;
        boolean projectCompleted = true;
        boolean profileVerified = true;

        double aptitudePercentage = ((double) aptitudeCorrectAnswers / aptitudeTotalQuestions) * 100.0;
        double codingPercentage = ((double) codingTestCasesPassed / codingTotalTestCases) * 100.0;

        boolean degreeEligible = degreePercentage >= 60.0;
        boolean backlogEligible = activeBacklogs == 0;
        boolean graduationYearEligible = graduationYear >= 2025 && graduationYear <= 2027;
        boolean aptitudeEligible = aptitudePercentage >= 60.0;
        boolean codingEligible = codingPercentage >= 70.0;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean verificationEligible = profileVerified;

        boolean applicationEligible = degreeEligible && backlogEligible && graduationYearEligible && aptitudeEligible && codingEligible && communicationEligible && projectEligible && verificationEligible;

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
        System.out.println("Project Status          : " + (projectEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Profile Status          : " + (verificationEligible ? "Eligible" : "Not Eligible"));
        System.out.println("------------------------------------------------");

        if (applicationEligible) {
            System.out.println("Application Status      : Eligible to Apply");
            System.out.println("Next Action             : Submit the company application.");
        } else if (!degreeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve the required degree percentage.");
        } else if (!backlogEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Clear all active backlogs.");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Check the eligible graduation-year criteria.");
        } else if (!aptitudeEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve aptitude assessment performance.");
        } else if (!codingEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve coding assessment performance.");
        } else if (!communicationEligible) {
            System.out.println("Application Status      : Not Eligible");
            System.out.println("Next Action             : Improve communication assessment performance.");
        } else if (!projectEligible) {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete the required project.");
        } else {
            System.out.println("Application Status      : Application On Hold");
            System.out.println("Next Action             : Complete profile verification.");
        }

        System.out.println("================================================");
    }
}
