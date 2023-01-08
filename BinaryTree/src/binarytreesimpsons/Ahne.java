/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytreesimpsons;

/**
 *
 * @author Q1.01Bilant
 */
public class Ahne {
// Anfang private 
    private String vorname;
    private String nachname;
    private char geschlecht;
// Ende private 

    public Ahne (String pVorname, String pNachname, char pGeschlecht ){
        vorname = pVorname;
        nachname = pNachname;
        geschlecht = pGeschlecht; 
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String pvorname) {
        this.vorname = pvorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String pnachname) {
        this.nachname = pnachname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char pgeschlecht) {
        this.geschlecht = pgeschlecht;
    }
}
