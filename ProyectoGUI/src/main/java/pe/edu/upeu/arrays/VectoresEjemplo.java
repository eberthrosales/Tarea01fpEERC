package pe.edu.upeu.arrays;

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


    public static void main(String[] args) {
        VectoresEjemplo objx=new VectoresEjemplo();objx.vectoresx();
        new VectoresEjemplo().vectoresx();
        
    }
}