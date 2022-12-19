/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreesimpsons;

/**
 * Testklasse zum Aufbau eines BinaryTree, der den Ahnenbaum von Lisa Simpson 
 * unter Verwendung einer Klasse Ahne darstellt.
 * @author pardella
 */
public class BinaryTreeSimpsons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ToDo 
        //1. Klasse Ahne implementieren
        //2. Ahnenobjekte für Lisa Simpson anlegen
        //3. Ahnenbaum für Lisa aufbauen, d.h. anlegen mit Ahneneobjekten und verknüpfen
        //4. Preorder (und beliebige weitere) implementieren s.u. und Ahnenbaum zur Probe ausgeben.
        //*: Levelorder [Lisa - Marge, Homer - Jacqueline, Clancey, Mona, Abe] implementieren. 
        //-> Tipp: Hier wird eine lineare Datenstruktur zur Zwischenspeicherung benötigt und
        //-> Rekursion ist nicht immer die Antwort, es kann auch mal mit einer Schleife besser gehen ;-)
    }
    
    public static void preorder(BinaryTree pAktWurzel)
    {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }
    
    public static void inorder(BinaryTree pAktWurzel)
    {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }
    
    public static void postorder(BinaryTree pAktWurzel)
    {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
if (pAktWurzel.getLeftTree().getContent() != null) {
           postorder(pAktWurzel.getLeftTree());
        }
        
        if (pAktWurzel.getRightTree().getContent() != null) {
           postorder(pAktWurzel.getRightTree());
        }
        
        System.out.print(pAktWurzel.getContent().getVorname() + " ");
    }
    
    public static void levelorder(BinaryTree pAktWurzel)
    {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }
}
