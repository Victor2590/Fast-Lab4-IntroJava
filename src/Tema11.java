public class Tema11 extends SkeletonJava {

    /*
    11. Se da un sir.
    Sa se extraga toate numerele intre doua valori si
    sa se puna intr-un alt sir care apoi sa se afiseze.
     */

    public static void main(String[] args){

        int a[]= {0,1,2,3,4,5,6,7,8,9,10};
        int b[]= new int [a.length];
        int nr1=readIntGUI("Introduceti primul numar: ");
        int nr2=readIntGUI("Introduceti al doilea numar: ");
        for (int i = 0; i < a.length; i++)
            if (a[i] > nr1 && a[i] < nr2) {
                printGUI("Numerele sunt: " + i);
                b[i] = a[i];
            }
        for (int i=0; i<b.length;i++) {
            if (b[i] > 0) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(b[i]);

            }
        }


    }
}
