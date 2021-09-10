package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6innlevering {
    public static void main(String[] args) {  
        int n = Integer.parseInt(showInputDialog("Skriv inn ett tall: "));
        int x = 1;
        if(n >0)
        for (int y = 1; y <= n; y++) {
            x = x * y;
        
            
        }
        
        showMessageDialog(null, x);
    




    }
}