import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class SkeletonJava {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }
    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/


    /* here starts the main class */
    public static void main(String[] arguments) {



    /*
    Se da un sir de numere ordonate crescator.
    Se va determina daca un numar n exista in sir,
    si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
    sirul va fi definit asa, numerele sunt de exemplu.
    int[] a = {1,3,4,6,7,8,10,12,14,23};
    */



                int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
                int n = readIntGUI("Introduceti numarul:");
                int count = 0;

                for (int i=0; i < a.length; i++) {
                    // atata timp cat a[i] nu e egal cu n, incrementeaza count
                    if (a[i] != n) {
                        count++;
                    } else {
                        printGUI("Numarul a fost gasit la pozitia: " + i + " a sirului!");
                    }
                }

                // daca count e egal cu lungimea sirului
                // inseamna ca nr nu a fost gasit
                if (count == a.length) {
                    printGUI("-1");
                }





    }
    //end of main method
}
// end of class
