/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The EthicsCase class is a parent class that represents an ethical case scenario
 * @author 343079463
 */
public class EthicsCase {
    // Encapsulated instance variables for the case details
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    /**
     * Constructor with a specified title, description, and category
     * Initializes a blank Verdict object for the case
     * @param caseTitle Title of the case
     * @param description Description and details of the case
     * @param catergory The category of the case
     */
    public EthicsCase (String caseTitle, String description, String catergory){
        this.caseTitle = caseTitle; 
        this.description = description;
        this.category = category;
        this.verdict = new Verdict(); // Instantiates a default Verdict object when the case is created
    }
    
    /**
     * Getter method to get the title of the case
     * @return 
     */
    public String getCaseTitle(){
        return caseTitle; // Return the title of the case
    }
    
    /**
     * Getter method to get the description of the case
     * @return 
     */
    public String getCaseDescription(){
        return description; // Returns the description of the case
    }
    
    /**
     * Getter method to get the category of the case
     * @return 
     */
    public String getCategory(){
        return category; // Returns the category of the case
    }
    
    /**
     * Returns a string representation of EthicsCase object
     * @return A string that contains the title, description, and category of the case
     */
    public String toString(){
        return "Title: " + caseTitle + " Description: " + description + " Category: " + category; // Returns the case details
    }
}
