package modelo;

import java.io.Serializable;

/**
 *
 * @author Kevin Sandoval
 */
public class Producto implements Serializable {

    public Producto() {
        
    }
    
    public Producto(String atrNombre, String atrCodigo, int atrCantidad, double atrPrecio, 
            double atrPrecioVenta, String atrDescripcion, String atrGrupo, String atrFabricante) {
        this.atrNombre = atrNombre;
        this.atrCodigo = atrCodigo;
        this.atrCantidad = atrCantidad;
        this.atrPrecio = atrPrecio;
        this.atrPrecioVenta = atrPrecioVenta;
        this.atrDescripcion = atrDescripcion;
        this.atrGrupo = atrGrupo;
        this.atrFabricante = atrFabricante;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public String getAtrCodigo() {
        return atrCodigo;
    }

    public int getAtrCantidad() {
        return atrCantidad;
    }

    public double getAtrPrecio() {
        return atrPrecio;
    }

    public double getAtrPrecioVenta() {
        return atrPrecioVenta;
    }

    public String getAtrDescripcion() {
        return atrDescripcion;
    }

    public String getAtrGrupo() {
        return atrGrupo;
    }

    public String getAtrFabricante() {
        return atrFabricante;
    }

    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }

    public void setAtrCodigo(String atrCodigo) {
        this.atrCodigo = atrCodigo;
    }

    public void setAtrCantidad(int atrCantidad) {
        this.atrCantidad = atrCantidad;
    }

    public void setAtrPrecio(double atrPrecio) {
        this.atrPrecio = atrPrecio;
    }

    public void setAtrPrecioVenta(double atrPrecioVenta) {
        this.atrPrecioVenta = atrPrecioVenta;
    }

    public void setAtrDescripcion(String atrDescripcion) {
        this.atrDescripcion = atrDescripcion;
    }

    public void setAtrGrupo(String atrGrupo) {
        this.atrGrupo = atrGrupo;
    }

    public void setAtrFabricante(String atrFabricante) {
        this.atrFabricante = atrFabricante;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "atrNombre = " + atrNombre + ", atrCodigo = " + atrCodigo + 
                ", atrCantidad = " + atrCantidad + ", atrPrecio = " + atrPrecio + 
                ", atrPrecioVenta = " + atrPrecioVenta + ", atrDescripcion = " + atrDescripcion + 
                ", atrGrupo = " + atrGrupo + ", atrFabricante = " + atrFabricante + '}';
    }

    private String atrNombre;
    private String atrCodigo;
    private int atrCantidad;
    private double atrPrecio;
    private double atrPrecioVenta;
    private String atrDescripcion;
    private String atrGrupo;
    private String atrFabricante;
}
