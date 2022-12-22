/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreesimpsons;

import java.util.ArrayList;

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
    }
    
    public static void levelorder(BinaryTree pAktWurzel)
    {
        ArrayList<Object> list;
        int level = 0;
        do
        {
            list = new ArrayList<>();
            getLevel(pAktWurzel, level, list);
            level++;
            for(Object o : list)
            {
                System.out.print(o.toString() + " ");
            }
            System.out.println();
        }
        while(!list.isEmpty());
    }
    
    private static void getLevel(BinaryTree baum, int level, ArrayList<Object> list)
    {
        if(level == 0)
        {
            list.add(baum.getContent());
        }
        else
        {
            if(!baum.getLeftTree().isEmpty()) getLevel(baum.getLeftTree(), level - 1, list);
            if(!baum.getRightTree().isEmpty()) getLevel(baum.getRightTree(), level - 1, list);
        }
    }
}
