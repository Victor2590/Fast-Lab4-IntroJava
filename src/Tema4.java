public class Tema4 extends SkeletonJava {
    /*
    4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24].
    Altfel sa se afiseze ‘false'.
     */

    public static void main (String[] args){

        int  num=readIntGUI("Introduceti un numar:" );

        if (num>=9 && num<=24){
            printGUI("True");
        }
        else {
            printGUI("False");
        }



    }
}
