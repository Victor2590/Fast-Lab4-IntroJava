public class Tema2 extends SkeletonJava {

    /*
    2. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
int n = 20;/sau o alta valoare.
     */
    public static void main(String[] args) {

        int n = readIntGUI("Introduceti numar natural:");
        int count = 0;
        int suma = 0;

        do {
            suma = suma + count;
            count++;
        } while (count <= n);


        printGUI("Suma primelor " + n + " numere naturale este: " + suma);









    }


}