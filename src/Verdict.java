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
    
    public static final String ethical = "Ethical";
    public static final String unethical = "Unethical";
    
    public Verdict() {
        this.studentVerdict = "empty";
        this.caseName = "empty";
        this.reason = "empty";
    }
    
    public Verdict(String caseName, String verdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    public void setCaseName(String title) {
        this.caseName = title;
    }
    
    public String getCaseName() {
        return caseName;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setStudentVerdict(String verdict) {
        this.studentVerdict = verdict;
    }
    
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    public String toString() {
        return "Name: " + caseName + " Verdict: " + studentVerdict + " Reason: " + reason;
    }
    
}
