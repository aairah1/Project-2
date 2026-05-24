/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345730287
 */
public class MisinformationCase extends EthicsCase{ // child class (inheritance) extending EthicsCase for a Misinformation case
    private String mediaType; // rpivate instance variable for the media type

    /**
     * Constructor to set the case details for the Misinformation Case
     * @param caseTitle the title of the case
     * @param description the description of the case
     * @param mediaType the media type of the case
     */
    public MisinformationCase(String caseTitle, String description, String mediaType) { // constructor for the case to set its details
        super (caseTitle, description, "Misinformation and Digital Deception"); // call upon the parent class to set the title, description, and category
        this.mediaType = mediaType; // make this mediatype the entered media type
    } // close the constructor
    
    /**
     * Getter method for the media type
     * @return mediaType
     */
    public String getMediaType() { // the getter mehtod for the media type of this case
        return mediaType; // return the media type
    } // close the getter method
    
    /**
     * Default string method for the basic case information
     * @return case details
     */
    @Override
    public String toString() { // create the toString to call upon the default message 
        return super.toString() + " Media Type: " + mediaType; // return the parent toString information witht he media type
    } // close the toString    
} // close the class
