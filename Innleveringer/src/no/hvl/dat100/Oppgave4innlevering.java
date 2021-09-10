package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4innlevering {
    public static void main(String[] args) {
       int lån = Integer.parseInt(showInputDialog("Skriv inn brutto lån: "));
       String tekst = "Med " + lån + " får du dette i trinnskatt: " ;

       if(lån <= 164000) 
       tekst += "0";

     else if(lån >= 164101 && lån <= 230950) 
     tekst += 0.93*lån/100;

     else if(lån >= 230951 && lån <= 580650)
     tekst += 2.41*lån/100;

     else if(lån >= 580651 && lån <= 934050)
     tekst += 11.52*lån/100;

     else if(lån >= 934051)
     tekst += 14.52*lån/100;

     else
     tekst = "Feil ved inntasting";



     showMessageDialog(null, tekst);
    }

 
}