/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343079463
 */
public class AlgorithmCase extends EthicsCase {
    
    private String biasType;
    
    public AlgorithmCase (String caseTitle, String description, String biasType) {
        super (caseTitle, description, "Algorithm Bias and Fairness");
        this.biasType = biasType;
    }
    
    public String getBiasType() {
        return biasType;
    }
    
    public String toString (){
        return super.toString() + " Bias Type: " + biasType;
    }
}
