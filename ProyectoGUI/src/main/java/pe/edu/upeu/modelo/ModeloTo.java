package pe.edu.upeu.modelo;

public class ModeloTo {
    public String idModelo;
    public String nombreModelo;
    public String getIdModelo() {
        return idModelo;
    }
    public void setIdModelo(String idModelo) {
        this.idModelo = idModelo;
    }
    public String getNombreModelo() {
        return nombreModelo;
    }
    public ModeloTo(String idModelo, String nombreModelo) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
    }
    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }
    
}
