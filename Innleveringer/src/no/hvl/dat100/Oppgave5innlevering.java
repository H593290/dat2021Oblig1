package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5innlevering {
    public static void main(String[] args) {
        
     for(int i = 0; i < 10; i++) {
      
     int Poeng = Integer.parseInt(showInputDialog("Skriv inn poeng: "));

     String tekst = "Med " + Poeng + " poeng" + " får du karakteren: " ;

     if(Poeng <= 100 && Poeng >= 90){ 
       tekst += "A";
       showMessageDialog(null, tekst);}

     else if(Poeng <= 89 && Poeng >= 80) {
     tekst += "B";
     showMessageDialog(null, tekst);}

     else if(Poeng <= 79 && Poeng >= 60){
     tekst += "C";
     showMessageDialog(null, tekst);}

     else if(Poeng <= 59 && Poeng >= 50){
     tekst += "D";
     showMessageDialog(null, tekst);}

     else if(Poeng <= 49 && Poeng >= 40){
     tekst += "E";
     showMessageDialog(null, tekst);}

     else if(Poeng <= 39 && Poeng >= 0){
     tekst += "F";
     showMessageDialog(null, tekst);}

     else if(Poeng < 0 || Poeng > 100){showMessageDialog(null, "Feil ved inntasting, prøv på nytt");
         i--;}
        
     
     
   
     }
     
    }
     

     
     
    

 

}