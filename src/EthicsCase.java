/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The EthicsCase class is a parent class that represents an ethical case scenario
 * @author 343079463
 */
public class EthicsCase { // the main class for EthicsCase
    // Encapsulated instance variables for the case details
    private String caseTitle; // string for the case title
    private String description; // string for the case description
    private String category; // string for the category of the case
    public Verdict verdict; // string for the users verdict
    
    /**
     * Constructor with a specified title, description, and category
     * Initializes a blank Verdict object for the case
     * @param caseTitle Title of the case
     * @param description Description and details of the case
     * @param category The category of the case
     */
    public EthicsCase (String caseTitle, String description, String category){ // constructor EthicsCase
        this.caseTitle = caseTitle;  // make this caseTitle the entered caseTitle
        this.description = description; // make this description the entered description
        this.category = category; // make this category the entered category
        this.verdict = new Verdict(); // Instantiates a default Verdict object when the case is created
    } // close the constructor
    
    /**
     * Getter method to get the title of the case
     * @return caseTitle
     */
    public String getCaseTitle(){ // getter method for the case title
        return caseTitle; // Return the title of the case
    } // close the getter method
    
    /**
     * Getter method to get the description of the case
     * @return description
     */
    public String getCaseDescription(){ // getter method for the case description
        return description; // Returns the description of the case
    } // close the getter method
    
    /**
     * Getter method to get the category of the case
     * @return category
     */
    public String getCategory(){ // getter method for the category
        return category; // Returns the category of the case
    } // close the getter method
    
    /**
     * Returns a string representation of EthicsCase object
     * @return A string that contains the title, description, and category of the case
     */
    public String toString(){ // toString method to return the information formatted when called upon
        return "Title: " + caseTitle + " Description: " + description + " Category: " + category; // Returns the case details
    } // close the method
    
    /**
     * Polymorphic method that returns a summary of the case
     * @return A string summary of the case details based on the case type
     */
    public String getCaseSummary() { // polymorphic method that returns the case summary
        return toString(); // calls the subclass toString() method based on the object type
    } // closes the method
} // close the main
