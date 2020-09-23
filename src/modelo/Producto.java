package modelo;

import java.io.Serializable;

/**
 *
 * @author Kevin Sandoval
 */
public class Producto implements Serializable {

    public Producto(String AtrNombre, String AtrCodigo, int AtrCantidad, double AtrPrecio, double AtrPrecioVenta) {
        this.AtrNombre = AtrNombre;
        this.AtrCodigo = AtrCodigo;
        this.AtrCantidad = AtrCantidad;
        this.AtrPrecio = AtrPrecio;
        this.AtrPrecioVenta = AtrPrecioVenta;
    }
    
    public Producto() {
        
    }

    @Override
    public String toString() {
        return "Producto{" + "AtrNombre=" + AtrNombre + ", AtrCodigo=" + AtrCodigo + ", AtrCantidad=" + AtrCantidad + ", AtrPrecio=" + AtrPrecio + ", AtrPrecioVenta=" + AtrPrecioVenta + '}';
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

    
    
   

    private String AtrNombre;
    private String AtrCodigo;
    private int AtrCantidad;
    private double AtrPrecio;
    private double AtrPrecioVenta;
}
