import java.util.Scanner;

/**
 * Ejercicio1xEERC
 */
public class Ejercicio1xEERC {

    static Scanner leerteclado=new Scanner(System.in);

    public static void Ejercicio1xEERC() {
        //Definir vaariables
        double n1, n2, n3, promedio;
        string estado;
        //Datos de entrada
        System.out.println("Ingrese la nota 1:");
        n1=leerteclado.nextDouble();
        System.out.println("Ingrese la nota 2:");
        n2=leerteclado.nextDouble();
        System.out.println("Ingrese la nota 3:");
        n3=leerteclado.nextDouble();
        //Proceso
        promedio=n1*0.20+n2*0.30+n3*0.50;
        /* >=18 y <=20 aprobo con exelencia; <18 y >15 aprobo con mencion regular <=15 y >=13 aprobo con mencion baja; <13 desaprobo*/
        if (promedio>=18 && promedio<=20) {
            estado="\n\naprobo \n\tcon mension excelente";
        }else if(promedio<18 && promedio>15){
            estado="\n\naprobo \n\tcon mension regular";
        }else if(promedio<=15 && promedio>=13){
            estado="\n\naprobo \n\tcon mension baja";
        }else{
            estado="\n\ndesaprobo";
    }
    //Datos de salida
    System.out.println(estado);

}