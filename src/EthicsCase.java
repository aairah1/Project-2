/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343079463
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String catergory;
    public Verdict verdict;
    
    public EthicsCase (String caseTitle, String description, String catergory){
        this.caseTitle = caseTitle;
        this.description = description;
        this.catergory = catergory;
        this.verdict = new Verdict();
    }
    
    public String getCaseTitle(){
        return caseTitle;
    }
    
    public String getCaseDescription(){
        return description;
    }
    
    public String getCatergory(){
        return catergory;
    }
    
    public String toString(){
        return "Title: " + caseTitle + " Description: " + description + " Catergory: " + catergory;
    }
}
