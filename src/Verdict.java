/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345730287
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    public Verdict() {
        this.studentVerdict = "empty";
    }
    
    public Verdict(String caseName, String verdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = studentVerdict;
    }
    
    public void setCaseName() {
        this.caseName = caseName;
    }
    
    public String getCaseName() {
        return caseName;
    }
    
    public void setReason() {
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setStudentVerdict() {
        this.studentVerdict = studentVerdict;
    }
    
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    public String toString() {
        return "Name: " + caseName + " Verdict: " + studentVerdict + " Reason: " + reason;
    }
    
}
