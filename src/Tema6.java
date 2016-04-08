public class Tema6 extends SkeletonJava {

    /*
    6. Sa se calculeze factorialul unui numar a .
factorialul este definit asa:
factorial  = 1*2*3*4….*a
     */

    public static void main(String[] args) {

        int a = readIntGUI("Introduceti un numar: ");

        int rez=1;
        int count=1;


        do {
            rez = rez * count;
            count++;
        }
            while (count<=a);{
            printGUI("Factorialul este: "+rez);
        }















    }

}