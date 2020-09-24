package modelo;

import java.io.Serializable;

/**
 *
 * @author Kevin Sandoval
 */
public class Producto implements Serializable {

    public Producto(String AtrNombre, String AtrCodigo, int AtrCantidad, double AtrPrecio, 
            double AtrPrecioVenta, String AtrDescripcion, String AtrGrupo, String AtrFabricante) {
        this.AtrNombre = AtrNombre;
        this.AtrCodigo = AtrCodigo;
        this.AtrCantidad = AtrCantidad;
        this.AtrPrecio = AtrPrecio;
        this.AtrPrecioVenta = AtrPrecioVenta;
        this.AtrDescripcion = AtrDescripcion;
        this.AtrGrupo = AtrGrupo;
        this.AtrFabricante = AtrFabricante;
    }

    public String getAtrNombre() {
        return AtrNombre;
    }

    public String getAtrCodigo() {
        return AtrCodigo;
    }

    public int getAtrCantidad() {
        return AtrCantidad;
    }

    public double getAtrPrecio() {
        return AtrPrecio;
    }

    public double getAtrPrecioVenta() {
        return AtrPrecioVenta;
    }

    public String getAtrDescripcion() {
        return AtrDescripcion;
    }

    public String getAtrGrupo() {
        return AtrGrupo;
    }

    public String getAtrFabricante() {
        return AtrFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "AtrNombre=" + AtrNombre + ", AtrCodigo=" + AtrCodigo + 
                ", AtrCantidad=" + AtrCantidad + ", AtrPrecio=" + AtrPrecio + 
                ", AtrPrecioVenta=" + AtrPrecioVenta + ", AtrDescripcion=" + AtrDescripcion + 
                ", AtrGrupo=" + AtrGrupo + ", AtrFabricante=" + AtrFabricante + '}';
    }

    private String AtrNombre;
    private String AtrCodigo;
    private int AtrCantidad;
    private double AtrPrecio;
    private double AtrPrecioVenta;
    private String AtrDescripcion;
    private String AtrGrupo;
    private String AtrFabricante;
}
