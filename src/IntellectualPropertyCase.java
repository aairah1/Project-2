/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author 345730287
 */
public class IntellectualPropertyCase extends EthicsCase{ // child class (inheritance) extending EthicsCase
    private String ipType; // private instance variable String ipType
    
    /**
     * Constructor to set the case information for an intellectual property case
     * @param caseTitle
     * @param description
     * @param ipType 
     */
    public IntellectualPropertyCase (String caseTitle, String description, String ipType){ // constructor which takes in the title, description, and iptype 
        super(caseTitle, description, "Intellectual Property and Digital Ownership"); // call upon the parent mehtod to set the variables not assigned in this class
        this.ipType = ipType; // make this ipType equal the entered ipType
    } // close the constructor
    
    /**
     * Getter method to retrieve the IP type of the case
     * @return the ipType of the case
     */
    public String getIpType() { // getter method to get the ip type
        return ipType; // return the ip type
    } // clsoe the getter method
    
    /**
     * toString method to get all the case details
     * @return the case details
     */
    public String toString() { // toString method to set the default return if called upon
        return super.toString() + "Intellectual Property: " + ipType; // return the previous toString method with the ip type added
    } // close the toString
} // close the class
