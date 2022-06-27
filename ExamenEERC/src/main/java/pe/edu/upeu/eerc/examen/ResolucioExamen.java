package pe.edu.upeu.eerc.examen;

import java.util.Scanner;

public class ResolucioExamen {

    // ejercicio 2
    public void impuestoPagoAutomotriz() {
        // variables
        double pagoImpuestosTotal = 0, impuestoVehiculo = 0, pagoImpuestoTotalCategoria = 0;
        // proceso y datos de entrada
        System.out.println("********ejercicio2********");
        System.out.println("Determinar el impuesto de una automotriz");
        for (int categoria = 1; categoria <= 3; categoria++) {
            int cantidadVehiculos = sc.leer(0, "Ingrese la cantidad de Vehiculos de la categoria " + categoria + ":");
            double costoVehiculos = sc.leer(0, "Ingrese el costo de Vehiculos de la categoria " + categoria + ":");
            if (categoria == 1) {
                impuestoVehiculo = costoVehiculos * 0.12;
            }
            if (categoria == 2) {
                impuestoVehiculo = costoVehiculos * 0.08;
            }
            pagoImpuestoTotalCategoria = impuestoVehiculo * cantidadVehiculos;
            pagoImpuestosTotal += pagoImpuestoTotalCategoria;
            // datos de salida
            System.out.println(
                    "El impuesto a pagar por cada vehiculo de la categoria " + categoria + " es: " + impuestoVehiculo);
            System.out.println("El total impuesto de la categoria " + categoria + " es: " + pagoImpuestoTotalCategoria);
            System.out.println();

        }
        System.out.println("El total de impuesto de todos los vehiculos es: " + pagoImpuestosTotal);
        System.out.println();

    }

    // ejercicio 3
    public void multiplicarNumeroEntero() {
        // variables
        int n, multiplicador;
        // datos de entrada
        System.out.println("*******ejercicio 3********");
        System.out.println("Tabla de multiplicar");
        n = sc.leer(0, "\nIngresar el numero entero positivo a multiplicar:");
        multiplicador = sc.leer(0, "Ingresar el limite de tu multiplicador:");
        // proceso
        if (n > 0) {
            for (int i = 1; i <= multiplicador; i++) {
                System.out.println(n + "x" + i + " = " + n * 1);

            }
        } else {
            System.out.println("El numero es incorrecto");
        }
        System.out.println();
    }

    // ejercicio 4
    public void DeterminarNumerosPercfectos() {
        int a, b, suma;
        a = 1;
        // datos de entrada
        System.out.println("*******ejercicio 4********");
        System.out.println("Numeros perfectos entre 1 y 10000:");
        // proceso
        while (a <= 10000) {
            suma = 0;
            for (b = 1; b < a; b++) {
                if (a % b == 0) {
                    suma = suma + b;
                }
            }
            if (a == suma) {

            }
            //datos de salida
            System.out.println(a);

        }
        a++;
    }

    //ejercicio 5
    public void potenciacion() {
        //declarar variables
        int base,exponente;
        //datos de entrada
        System.out.println("*******ejercicio 5******");
        System.out.println("Recursividad de potencia");
        base=sc.leer(0,"Ingrese la base:");
        exponente=sc.leer(0,"Ingres el exponente:");
        //proceso
        System.out.println("El resultado es: "+base+" ^ "+exponente+" = "+Recursividad(base,exponente));
        System.out.println();     
    }
    public double Recursividad(int base, int exponente) {
        if (exponente==0) {
            return 1;          
        }
        else{
            return base*Recursividad(base,exponente-1);
        }
        
    }
}
