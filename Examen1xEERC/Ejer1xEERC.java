

import java.util.Scanner;

/**
 * Examen1xEERC
 */
public class Ejer1xEERC {
    //primer examen Eberth Emmanuel Rosales Castillo

    static Scanner lt=new Scanner(System.in);

    public static void ejer1xEERC() {
        //definir variables
        double EC, EP, TP, promedio;
        String estado;
        //datos de entrada
        System.out.println("Ingrese la nota de el examen de conocimientos: ");
        EC=lt.nextDouble();
        System.out.println("Ingrese la nota de la entrevista persona: ");
        EP=lt.nextDouble();
        System.out.println("Ingrese la nota del test psicologico: ");
        TP=lt.nextDouble();
        //proceso
        promedio=EC*0.4+EP*0.25+TP*0.35;
        if (promedio>=17 && promedio<=20) {
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4";
        }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3";
        }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2";
        }else if(promedio<11){
            estado="\n\nDesaprobo y pierde la vacante \n\tSe encuentra en el nivel 1";
        }else{
            estado="\n\nDesaprobado";
        }
        //datos de salida
        System.out.println(estado);
    }
    public static void ejer1xEERC() {
        //definir variables
        double precio,igv,descuento,total,preFi;
        //datos de entrada
        System.out.println("Ingrese el precio del articulo: ");
        precio=lt.nextDouble();
        //proceso
        if (precio>=2000) {
            descuento=precio*0.10; 
        }else if (precio>=1000 && precio<2000) {
            descuento=precio*0.05;
        }else if (precio>=500 && precio<1000) {
            descuento=precio*0.02;
        }else{
            descuento=precio*0;
        }
        total=precio-descuento;
        igv=total*0.18;
        preFi=total+igv;
        //datos de salida
        System.out.println("El IGV total es: "+igv);
        System.out.println("El descuento total es: "+descuento);
        System.out.println("El total a pagar es: "+preFi);
}
    public static void ejer1xEERC() {
        //definir variables
       double num1,num2,total,signo;
       //datos de entrada
       System.out.println("Ingrese el primer numero: ");
       num1=lt.nextDouble();
       System.out.println("Ingrese el segundo numero: ");
       num2=lt.nextDouble();
       System.out.println(" 1 = (+ = suma) \n2 = (- = resta) \n3 = (/ = divicion) \n4 (* = multiplicacion) \n5 (^ = potencia) \n6 (R = raiz) \n7 (% = modulo de 2) \n Ingrese el signo: ");
       signo=lt.nextDouble();
       //proceso
       if (signo==1) {
        total=num1+num2;
       } else if(signo==2){
        total=num1-num2;
       }else if(signo==3){
        total=num1/num2;
       }else if (signo==4) {
        total=num1*num2;
       }else if (signo==5) {
        total=Math.pow(num1,num2);
       }else if (signo==6) {
        total=Math.pow(num1,0.5);
       }else{
        total=num1%num2;
       }
       //datos de salida
       System.out.println("El resultado es: "+total);
   }
    public static void ejer1xEERC() {
        //definir variable
        double edad;
        String mensaje,genero;
        //datos de entrada
        System.out.println("Ingrese la cantidad de años: ");
        edad=lt.nextDouble();
        System.out.println("Ingrese el genero(masculino o femenino)");
        genero=lt.next();
        //proceso
        if (edad>=70) {
            mensaje=("Su vacuna es de tipo C");
        }else if (edad>=16 && edad<70 && genero=="masculino") {
            mensaje=("Su vacuna es de tipo A");
        }else if (edad>=16 && edad<70 && genero=="femenino") {
            mensaje=("Su vacuna es de tipo B");
        }else{
            mensaje=("Su vacuna es de tipo A");
        }
        //datos de salida
        System.out.println(mensaje);
}
public static void main(String[] args) {
        //definir variable
        int numero;
        System.out.println("Ingrese el numero del ejercicio que quiere ejecutar: ");
        numero=lt.nextInt();
        switch (numero) {
            case 1: ejer1xEERC(); break;
            case 2: ejer1xEERC(); break;
            case 3: ejer1xEERC(); break;
            case 4: ejer1xEERC(); break;
            default: break;
        }
}
}