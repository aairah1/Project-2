/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345730287
 */
public class Verdict { // begin the class verdict
    // Variables that hold the info for a case decision
    private String caseName; // String for name of the case
    private String studentVerdict; // String for the student's verdict
    private String reason; // String for the reason on selected choice
    
    /**
     * Constructor that runs when making a blank verdict with placeholder text
     */
    public Verdict() { // beginning of the constructor with no parameters
        // Set all values to "empty" by default
        this.studentVerdict = "empty";  // make this studentVerdict empty
        this.caseName = "empty"; // make this caseName empty
        this.reason = "empty"; // make this reason empty
    } // close the constructor
    
    /**
     * Constructor that creates a verdict with the info
     * @param caseName The name of the case
     * @param verdict The choice of either ethical or unethical
     * @param reason The reason for the choice
     */
    public Verdict(String caseName, String verdict, String reason) { // beginning of the constructor
        // Save the given data into these variables
        this.caseName = caseName; // The name of the case
        this.studentVerdict = verdict; // The user's choice of ethical or unethical
        this.reason = reason; // The reason for the user's choice
    }
    
    /**
     * Changes the name of the case
     * @param title The title or name of the case
     */
    public void setCaseName(String title) { // Setter method for the case's name
        this.caseName = title; // Update the case name variable
    } // Closes setter method
    
    /**
     * Returns back the name of the case.
     * @return The case name string
     */
    public String getCaseName() { // Getter method for the case's name
        return caseName; // Return the current case name
    } // Closes getter method
    
    /**
     * Changes the reason text
     * @param reason The new explanation or reason
     */
    public void setReason(String reason) { // Setter method for the reason of case
        this.reason = reason; // Update the reason variable
    } // closes setter method
    
    /**
     * Returns back the reason text
     * @return The reason string
     */
    public String getReason() { // Getter method for the reason of case
        return reason; // Return the current reason or explanation
    } // Close getter method
    
    /**
     * Changes the user's choice
     * @param verdict The choice made by the user (ethical or unethical)
     */
    public void setStudentVerdict(String verdict) { // Setter method for student's verdict or choice
        this.studentVerdict = verdict; // Update the student verdict variable
    } // Close setter method
    
    /**
     * Returns back the user's choice
     * @return The student's choice of ethical or unethical
     */
    public String getStudentVerdict() { // Getter method for the student's verdict or choice
        return studentVerdict; // Return the current student verdict
    } // Close getter method
    
    /**
     * Returns a string representation of Verdict object
     * @return A string that contains the name, student's choice, and reason for each case
     */
    public String toString() { // toString method to return the information formatted when called upon
        return "Name: " + caseName + " Verdict: " + studentVerdict + " Reason: " + reason; // Returns the case details
    } // closes method
    
} // closes the main
