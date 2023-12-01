import java.util.Arrays;
import java.util.Scanner;

public class Actividades {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuOpciones();
    }

    public static void menuOpciones() {
        int opcion = 0;
        do {
           menuTexto();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
                case 17 -> ejercicio17();
                case 18 -> ejercicio18();
                case 19 -> ejercicio19();
                case 20 -> ejercicio20();
                case 21 -> System.out.println("Hasta otra");
            }
        } while(opcion != 21);
    }

    public static void menuTexto() {
        int i;
        System.out.println("\nQue ejercicio quieres ejecutar?");
        for (i = 1; i <= 20; i++) {
            System.out.println("\t" + i + ". Ejercicio "+ i);
        }
        int salida = i + 1;
        System.out.println("\t" + i + ". Salir");
    }

    public static void ejercicio1() {
        int numeros [] = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            numeros[i] = validaInt();
        }
        System.out.println(Arrays.toString(numeros));
    }

    public static void ejercicio2() {
        int suma = 0;
        int Snumeros [] = new int[15];
        for (int i = 0; i < Snumeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            Snumeros[i] = validaPositivo();
            suma += Snumeros[i];
        }
        System.out.println("La suma de los numeros introducidos por teclado es: " +suma);
    }

    public static void ejercicio3() {
        int numMax = Integer.MIN_VALUE, numMin = Integer.MAX_VALUE;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            numeros[i] = validaInt();
            if (numeros[i] > numMax){
                numMax = numeros[i];
            }
            if (numeros[i] < numMin){
                numMin = numeros[i];
            }
        }
        System.out.println("El numero maximo es: " + numMax);
        System.out.println("El numero minimo es: " + numMin);
    }

    public static void ejercicio4() {
        int suma = 0;
        int Snumeros [] = new int[20];
        for (int i = 0; i < Snumeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            Snumeros[i] = validaInt();
            suma += Snumeros[i];
        }
        System.out.println("La suma de los numeros introducidos por teclado es: " +suma);
    }

    public static void ejercicio5() {
        int i=0;
        double suma = 0, media = 0;
        double Snumeros [] = new double[20];
        for ( i=0 ; i < Snumeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            Snumeros[i] = validaInt();
            suma += Snumeros[i];
        }
        media = suma / i;
        System.out.println("La media de los numeros introducidos por teclado es: " + media);
    }

    public static void ejercicio6() {
        int N, M;
        System.out.println("Introduce el numero de valores que tenga el Array:");
        N = sc.nextInt();
        System.out.println("Escriba el valor que quiere que contenga el Array:");
        M = sc.nextInt();
        int Array [] = new int[N];
        Arrays.fill(Array,M);
        System.out.println(Arrays.toString(Array));

    }
    public static void ejercicio7() {
        int P, Q, vIntermedios;
        System.out.println("Introduce el primer valor (El mas pequeño):");
        P = sc.nextInt();
        System.out.println("Introduce el segundo valor (El mas grande):");
        Q = sc.nextInt();
        vIntermedios = Q - P;

        int Array [] = new int[vIntermedios];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = P;
            System.out.print(Array[i] + ", ");
            P = P+1;
        }
        System.out.println(Q);
    }

    public static void ejercicio8() {
        int i, condicion = 0;
        double nrandom = 0, nUsuario, R;

        int Array[] = new int[100];

        System.out.println("Introduzca un numero entre 0 y 1");
        R = validaDouble();

        for (i = 0; i < Array.length; i++) {
            nrandom = (double) (Math.random()*1);
             if (R <= nrandom){
                 condicion = condicion + 1;
             }
        }
        System.out.println("La cantidad de valores mayores que " + R + " son: " + condicion);
    }

    public static void ejercicio9() {
        int i, condicion = 0;
        double nrandom = 0, nUsuario, R;

        int Array[] = new int[100];

        System.out.println("Introduzca un numero entre 0 y 10");
        R = validaInt();
        System.out.print("El numero que has introducido aparece en las posiciones:");
        for (i = 0; i < Array.length; i++) {
            nrandom = (int) (Math.random()*10);
            if (R == nrandom){
                System.out.print(" " + i);
            }
        }
    }

    public static void ejercicio10() {
        int numMax = 3, numMin = Integer.MAX_VALUE;
        double alturaMax;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzaca el valor " + (i+1));
            numeros[i] = validaInt();
            if (numeros[i] > numMax){
                numMax = numeros[i];
            }
            if (numeros[i] < numMin){
                numMin = numeros[i];
            }
        }
        System.out.println("El numero maximo es: " + numMax);
        System.out.println("El numero minimo es: " + numMin);
    }

    public static void ejercicio11() {

    }

    public static void ejercicio12() {

    }

    public static void ejercicio13() {

    }

    public static void ejercicio14() {

    }

    public static void ejercicio15() {

    }

    public static void ejercicio16() {

    }

    public static void ejercicio17() {

    }

    public static void ejercicio18() {

    }

    public static void ejercicio19() {

    }

    public static void ejercicio20() {

    }

    public static double validaDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Esto no es un numero, introduzca un numero valido: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static int validaInt() {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Esto no es un numero, introduzca un numero valido: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static int validaPositivo() {
        int numero;
        do {
            numero = validaInt();
            if (numero < 0) {
                System.out.println("El valor introducido no es un numero positivo, introduce un numero positivo: ");
                sc.nextLine();
            }
        } while (numero < 0);
        return numero;
    }
}

