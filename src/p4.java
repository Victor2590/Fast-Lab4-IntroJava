public class p4 extends SkeletonJava {

    public static void main(String[] args){

    //Se da un numar in grade Fahrenheit. Sa se converteasca in Celsius stiind formula.


        double F=readDoubleConsole("Temperatura in F: " );

        double C=((F-32)*5)/9;

        printConsole("Conversia in grade C: "+C);



    }
}