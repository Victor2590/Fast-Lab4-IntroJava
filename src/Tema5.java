public class Tema5 extends SkeletonJava {

    /*
    5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n
de ex
a =3
b = 2
se va calcula 3*3

a = 3
b = 5
se va calcula 3*3*3*3*3
     */

    public static void main(String[] args) {


        int a = readIntGUI("Introduceti nr:");
        int n = readIntGUI("Introduceti puterea la care sa fie ridicat:");
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * a;
        }

        printGUI("Rezultatul este:" + result);






    }

}
