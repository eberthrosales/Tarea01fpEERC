package pe.edu.upeu.eerc;

import pe.edu.upeu.eerc.examen.ResolucioExamen;

/**
 * Hello world!
 *
 */
public class App {
    public static ResolucioExamen re;
    static Scanner sc = new Scanner(System.in);
    static LeerTeclado br = new LeerTeclado();

    static void menudeOpciones() {
        re = new ResolucioExamen();
        int opcion = 0;
        String msg = "********** ¿Que ejercicio desea probar? **********\n1 = ejercicio 2\n2 = ejercicio 3\n3 = ejercicio 4\n4 = ejercicio 5\n0 = Salir del menú";
        opcion = br.leer(0, msg);
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    re.impuestoPagoAutomotriz();
                    break;
                case 2:
                    re.multiplicarNumeroEntero();
                    break;
                case 3:
                    re.DeterminarNumerosPercfectos();
                    break;
                case 4:
                    re.potenciacion();
                    break;

                default:
                    System.out.println("La opcion no existe!");
            }
            opcion=br.leer(0,msg);

        }

    }

    public static void main(String[] args) {
        menudeOpciones();
        //System.out.println("Hello World!");
    }
}
