import java.util.Scanner;

public class Ejercicios {
    public void Ejercicios1() {
        int[][] matriz={{41, 4, 8,},{12, 16, 20,},{4, 10, 6,}};
        int[][] matriz2={{40, 2, 4,},{6, 8, 10,},{2, 5, 3,}};
        int[][] resultado=new int[matriz.length][matriz[0].length];
        for (int f = 0; f < resultado.length; f++) {
            for (int i = 0; i < resultado[0].length; i++) {
                resultado[f][i] = matriz[f][i]-matriz2[f][i];
                System.out.print(resultado[f][i]+" ");
                
            }
            System.out.println(" ");
            
        }
        
    }


    public void Ejercicios2() {
        Scanner lt = new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }


    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(m[f][c] + "\t");
                }
            }
            System.out.println("");
        }
    }





    public void Ejercicios3() {
        double resultado;
        for (int i = 0; i <=10 ; i++) {
            resultado=81*i;
            System.out.println("81*"+i+"="+resultado);
        }
        
    }

    public void prueba4() {
        System.out.println("Ingrese numero a multiplicar:");
        Scanner scanner = new Scanner(System.in);
        int valor=scanner.nextInt();
        double resultado;
        for (int i = 0; i <=10 ; i++) {
            resultado=valor*i;
            System.out.println(valor+"*"+i+"="+resultado);
        }
        
    }


    public static void main(String[] args) {
        //new Ejercicios().Ejercicios1();
        //new Ejercicios().Ejercicios2();
        new Ejercicios().Ejercicios3();
        //new Ejercicios().prueba4();
    }
}
