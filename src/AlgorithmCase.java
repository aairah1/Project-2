/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343079463
 */
public class AlgorithmCase extends EthicsCase { // child class (inheritance) extending EthicsCase
    
    private String biasType; // Instance variable to store the bias type
    
    /**
     * Constructor with the title, description, and bias type
     * @param caseTitle
     * @param description
     * @param biasType 
     */
    public AlgorithmCase (String caseTitle, String description, String biasType) { // Calls constuctor of EthicsCase
        super (caseTitle, description, "Algorithm Bias and Fairness"); // Passes along the title and description, and hardcodes the category
        this.biasType = biasType; // Initializes biasType with the value that is passed into the constructor
    } // close constructor
    
    /**
     * Getter method to get the bias type
     * @return biasType
     */
    public String getBiasType() { // The string getter method to get the bias type
        return biasType; // Returns the bias type
    } // close the getter method
    
    /**
     * The string representation of the AlgorithmCase object
     * @return A string displaying the bias type
     */
    public String toString (){ // toString method to get an automatic string message
        return super.toString() + " Bias Type: " + biasType; // Return the bias type with the same message as the parent
    } // close the toString
} // close the class
