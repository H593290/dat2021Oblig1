package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave1{
    public static void main(String[] args) {
       int x = Integer.parseInt(showInputDialog("Skriv inn brutto lonn: "));
       String tekst = "Med " + x + " får du dette i trinnskatt: " ;

       if(x <= 164000) 
       tekst += "0";

     else if(x >= 164101 && x <= 230950) 
     tekst += 0.93*x/100;

     else if(x >= 230951 && x <= 580650)
     tekst += 2.41*x/100;

     else if(x >= 580651 && x <= 934050)
     tekst += 11.52*x/100;

     else if(x >= 934051)
     tekst += 14.52*x/100;

     else
     tekst = "Feil ved inntasting";



     showMessageDialog(null, tekst);
    }

 
}
