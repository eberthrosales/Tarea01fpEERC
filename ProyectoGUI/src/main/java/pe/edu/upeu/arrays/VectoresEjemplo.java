package pe.edu.upeu.arrays;

import pe.edu.upeu.modelo.Persona;

/**
 * VectoresEjemplo
 */
public class VectoresEjemplo {

    public void vectoresx() {
        int edades[]=new int[10];
        edades=new int[12];
        edades[0]=20;
        edades[1]=18;
        edades[11]=30;
        System.out.println("edades");
        System.out.println("Indice 0:"+edades[0]);
        System.out.println("Indice 11:"+edades[11]);
        //forma dos
        System.out.println("Forma dos");
        int edadesx[]={20,18,30, 40, 16};
        System.out.println(edadesx.length);
        System.out.println("Indice 0:"+edadesx[0]);
        System.out.println("Indice 4:"+edadesx[4]);
    }

    public void vectorObjetos() {
        Persona[] p=new Persona[27];
        p[0].codigo="202211956";
        p[0].nombres="Eberth Emmanuel Rosales Castillo";
        p[0].asistencia=true;
        Persona[] pp={
        new Persona("202012374", "Alejo Castillo Cristhian Brandolyn ",true)
        new Persona("202212437", "Arce Mayta Efrain Nayder ",true) }
        
    }


    public static void main(String[] args) {
        VectoresEjemplo objx=new VectoresEjemplo();objx.vectoresx();
        new VectoresEjemplo().vectoresx();
        
    }
}