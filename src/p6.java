public class p6 extends SkeletonJava {

    public static void main(String[] args) {

/*
Se da un sir de numere. Sa se afiseze:
numarul maxim, numarul minim, suma lor, sirul dublat .
*/

        int n[] = {2,4,7,3,5,6};

        int min = n[0];
        int max = n[0];
        int sum = n[0];


        for(int i=0; i<n.length; i++) {
            if (n[i] > max)
                max = n[i];

            if (n[i] < min)
                min = n[i];

            sum = sum + n[i];

        }


            System.out.println("Cel mai mare numar: " + max);
            System.out.println("Cel mai mic numar: " + min);
            System.out.println("Suma numerelor din sir: " + sum);


        for (int i=0; i<n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i] = 2 * n[j];

                System.out.print(" " + n[i]);
            }break;


        }



    }
}