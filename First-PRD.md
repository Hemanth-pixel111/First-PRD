# HireReady — Campus Placement Application Checker

## Requirement

Develop a Java console application named **HireReady** that checks whether a candidate is eligible to apply for a campus placement opportunity.

The application must store a candidate profile, calculate assessment percentages, evaluate every eligibility condition, and display the candidate's final application status with the next action.

## 1. Candidate Profile

Create variables for the following candidate details:

| Candidate Detail | Data Type |
|---|---|
| Candidate name | `String` |
| Registration number | `int` |
| Degree | `String` |
| Graduation year | `int` |
| Degree percentage | `double` |
| Active backlogs | `int` |
| Aptitude correct answers | `int` |
| Aptitude total questions | `int` |
| Coding test cases passed | `int` |
| Coding total test cases | `int` |
| Communication score | `int` |
| Project completed | `boolean` |
| Profile verified | `boolean` |

Each student must choose their **own fixed values** for all the variables. The submitted candidate profile must not use the same values as another student or copy sample values.

All the required candidate fields and data types must remain in the program.

## 2. Assessment Calculations

Calculate the aptitude percentage using:

```text
Aptitude Percentage =
Correct Answers / Total Questions × 100
```

Calculate the coding percentage using:

```text
Coding Percentage =
Test Cases Passed / Total Test Cases × 100
```

Perform decimal division so that both calculations produce accurate percentage values.

## 3. Eligibility Requirements

A candidate is eligible only when all the following conditions are satisfied:

1. Degree percentage is at least `60`.
2. Active backlogs are `0`.
3. Graduation year is between `2025` and `2027`, inclusive.
4. Aptitude percentage is at least `60`.
5. Coding percentage is at least `70`.
6. Communication score is at least `60`.
7. The required project is completed.
8. The candidate profile is verified.

Create a separate Boolean expression for every eligibility condition and one combined Boolean expression for the final eligibility result.

## 4. Application Status

Display only one final application status.

### Eligible to Apply

Display `Eligible to Apply` when all the eligibility requirements are satisfied.

### Not Eligible

Display `Not Eligible` when the candidate fails any of these requirements:

- Degree percentage
- Active backlogs
- Graduation year
- Aptitude percentage
- Coding percentage
- Communication score

### Application On Hold

Display `Application On Hold` when the candidate satisfies the performance requirements but:

- The project is incomplete, or
- The profile is not verified.

## 5. Condition Priority and Next Action

Evaluate the conditions in this order:

1. Degree percentage
2. Active backlogs
3. Graduation year
4. Aptitude percentage
5. Coding percentage
6. Communication score
7. Project completion
8. Profile verification

Display only the first failed condition and its corresponding next action.

| Failed Condition | Application Status | Next Action |
|---|---|---|
| Degree percentage | Not Eligible | Improve the required degree percentage |
| Active backlogs | Not Eligible | Clear all active backlogs |
| Graduation year | Not Eligible | Check the eligible graduation-year criteria |
| Aptitude percentage | Not Eligible | Improve aptitude assessment performance |
| Coding percentage | Not Eligible | Improve coding assessment performance |
| Communication score | Not Eligible | Improve communication assessment performance |
| Project incomplete | Application On Hold | Complete the required project |
| Profile not verified | Application On Hold | Complete profile verification |
| No failed condition | Eligible to Apply | Submit the company application |

## 6. Console Output

The console output must display:

- Complete candidate profile
- Aptitude score and percentage
- Coding score and percentage
- Communication score
- Project-completion status
- Profile-verification status
- Result of each eligibility condition
- Final application status
- Next action

Use meaningful output such as `Yes`, `No`, `Eligible`, and `Not Eligible` instead of printing only raw Boolean values.

The final output must contain the candidate values selected by the student.

## 7. Repository Structure

Create a GitHub repository named `First-PRD`, clone it to the local system, and use this structure:

```text
First-PRD/
└── Campus-Placement-Application-Checker/
    └── HireReady/
        ├── src/
        │   └── Main.java
        └── output/
            └── console-output.txt
```

Write the complete Java program inside:

```text
Campus-Placement-Application-Checker/HireReady/src/Main.java
```

After running the program, copy the **entire output printed in the console** and save it inside:

```text
Campus-Placement-Application-Checker/HireReady/output/console-output.txt
```

## 8. Repository Submission

Complete the requirement using the following flow:

1. Create the `First-PRD` GitHub repository.
2. Clone the repository to the local system.
3. Create the required folder structure.
4. Write the complete program in `Main.java`.
5. Compile and run the program.
6. Copy the complete console output into `console-output.txt`.
7. Add and commit the completed files.
8. Push the changes to GitHub.
9. Submit the GitHub repository link.

The completed repository must be submitted by **8:00 PM on 5 August 2026**.
