package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4innlevering {
    public static void main(String[] args) {
       int l�n = Integer.parseInt(showInputDialog("Skriv inn brutto l�n: "));
       String tekst = "Med " + l�n + " f�r du dette i trinnskatt: " ;

       if(l�n <= 164000) 
       tekst += "0";

     else if(l�n >= 164101 && l�n <= 230950) 
     tekst += 0.93*l�n/100;

     else if(l�n >= 230951 && l�n <= 580650)
     tekst += 2.41*l�n/100;

     else if(l�n >= 580651 && l�n <= 934050)
     tekst += 11.52*l�n/100;

     else if(l�n >= 934051)
     tekst += 14.52*l�n/100;

     else
     tekst = "Feil ved inntasting";



     showMessageDialog(null, tekst);
    }

 
}