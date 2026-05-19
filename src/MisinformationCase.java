/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345730287
 */
public class MisinformationCase extends EthicsCase{
    private String mediaType;

    public MisinformationCase(String caseTitle, String description, String mediaType) {
        super (caseTitle, description, "Misinformation and Digital Deception");
        this.mediaType = mediaType;
    }
    
    public String getMediaType() {
        return mediaType;
    }
    
    public String toString() {
        return super.toString() + " Media Type: " + mediaType;
    }    
}
