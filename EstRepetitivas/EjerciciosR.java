package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosR {

    public static void imprimirWhileN1_20() {
    int numInit=1;
    while (numInit<=20) {
        System.out.println(numInit);
        numInit=numInit+1;
    }
}
public static void imprimirDoWhileN1_20() {
    int numInit=21;
    do {
        System.out.println(numInit);
        numInit++;
    } while (numInit<=20);
}
public static void imprimirForN1_20() {
    for (int numInit =1; numInit <=20; numInit++) {
        System.out.println(numInit);
    }
    
}
public static void nombreinvertido() {
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese su nombre:");
    String nombre=lt.next();
    for (int i = nombre.length()-1; i >=0; i--) {
        System.out.println(nombre.charAt(i));
    } 
        
}

public static void main(String[]args) {
    /*System.out.println("Imprime While:"); imprimirWhileN1_20();
    System.out.println("Imprime Do While:"); imprimirDoWhileN1_20();
    System.out.println("Imprime for"); imprimirForN1_20();*/
    
    nombreinvertido();

    }

}

