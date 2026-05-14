/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343079463
 */
public class MyMain {
    public static void main (String [] args){
        AlgorithmCase algo = new AlgorithmCase ("Algorithm Case", "The Biased Hiring Bot", "gender bias");
        IntellectualPropertyCase intel = new IntellectualPropertyCase ("Intellectual Property Case", "AI Trained on Artist Work", "AI-generated art");
        MisinformationCase misinfo = new MisinformationCase ("Misinformation Case", "The Deepfake Politician", "deepfake video");
        PrivacyCase priv = new PrivacyCase ("Privacy Case", "The Always-On Microphone", " audio recordings");
        
        algo.verdict = new Verdict ("Misinformation Case", "Unethical", "user recieved wrong information");
        
        System.out.println((AlgorithmCase)algo.getBiasType());
    }
}
