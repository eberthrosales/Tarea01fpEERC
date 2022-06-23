package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class ProductoTO {
    public String idProducto, nombreProd;
    public String uniMed, idCat, idMod;
    public double precioUnid, utilidad, stock, cantMayor;
}
