/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343079463
 */
public class PrivacyCase extends EthicsCase{ // child class (inheritance) that extends EthicsCase
    
    private String dataType; // private instance variable dataType
    
    /**
     * Constructor to set the case details
     * @param caseTitle the title of the case
     * @param description the description of the case
     * @param dataType the data type of the case
     */
    public PrivacyCase (String caseTitle, String description, String dataType){ // beginning of the privacyCase constructor
        super(caseTitle, description, "Privacy and Data protection"); // set the caseTitle and description from the parent class
        this.dataType = dataType; // set this data type as the entered data type
    } // close the constructor
    
    /**
     * Getter method for the data type
     * @return dataType 
     */
    public String getDataType(){ // beginning of the getter method for the data type
        return dataType; // return the data type
    } // close the getter method
    
    /**
     * toString method to state all of the case's details
     * @return case details
     */
    @Override
    public String toString(){ // begin the toString method to return all the default case information
        return super.toString() + " Data Type: " + dataType; // return the parent class toString message with the addition of the data type
    }// close the toString method
}
