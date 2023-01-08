/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreesimpsons;

import java.util.ArrayList;

/**
 * Testklasse zum Aufbau eines BinaryTree, der den Ahnenbaum von Lisa Simpson
 * unter Verwendung einer Klasse Ahne darstellt.
 *
 * @author pardella
 */
public class BinaryTreeSimpsons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Ahne jacqueline = new Ahne("Jacqueline", "Bouvier", 'w'),
        clancy = new Ahne("Clancy", "Bouvier", 'm'),
        marge = new Ahne("Marge", "Simpson", 'w'),
        mona = new Ahne("Mona", "Simpson", 'w'),
        abraham = new Ahne("Abraham J.", "Simpson", 'm'),
        homer = new Ahne("Homer", "Simpson", 'm'),
        lisa = new Ahne("Lisa", "Simpson", 'w');

        BinaryTree<Ahne> k1, k2, k3;

        k2 = new BinaryTree<>(marge,
                new BinaryTree<>(jacqueline),
                new BinaryTree<>(clancy));
        k3 = new BinaryTree<>(homer, new BinaryTree<>(mona),
                new BinaryTree<>(abraham));
        k1 = new BinaryTree<>(lisa, k2, k3);
        
        System.out.println("Preorder");
        preorder(k1);
        System.out.println();
        System.out.println("Postorder");
        postorder(k1);
        System.out.println();
        System.out.println("Inorder");
        inorder(k1);
        
        System.out.println();
        System.out.println("Levelorder");
        levelorder(k1);

    }

    public static void preorder(BinaryTree<Ahne> pAktWurzel) {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
        System.out.print(pAktWurzel.getContent().getVorname() + " ");
       
        if (pAktWurzel.getLeftTree().getContent() != null) {
           preorder(pAktWurzel.getLeftTree());
        }
       
        if (pAktWurzel.getRightTree().getContent() != null) {
           preorder(pAktWurzel.getRightTree());
        }
    }

    public static void inorder(BinaryTree<Ahne> pAktWurzel) {
        if (pAktWurzel != null) {
            inorder(pAktWurzel.getLeftTree());
            System.out.println(pAktWurzel.getContent() + " ");
            inorder(pAktWurzel.getRightTree());
        }
    }
    
    public static void postorder(BinaryTree<Ahne> pAktWurzel)
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
    public static void levelorder(BinaryTree<Ahne> pAktWurzel)
    {
        ArrayList<Ahne> list;
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
    
    private static void getLevel(BinaryTree<Ahne> baum, int level, ArrayList<Ahne> list)
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
