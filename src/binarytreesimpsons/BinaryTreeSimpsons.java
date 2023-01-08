/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreesimpsons;

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

    }

    public static void preorder(BinaryTree pAktWurzel) {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }

    public static void inorder(BinaryTree pAktWurzel) {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }

    public static void postorder(BinaryTree pAktWurzel) {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }

    public static void levelorder(BinaryTree pAktWurzel) {
        //ToDo: Implementiere preorder hier. NEU: Der Teilbaum wird als
        //Parameter übergeben, es wird nicht auf diesem aufgerufen!
    }
}
