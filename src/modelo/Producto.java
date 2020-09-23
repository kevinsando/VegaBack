package modelo;

/**
 *
 * @author Kevin Sandoval
 */
public class Producto {

    public Producto(String AtrNombre, String AtrCodigo, int AtrCantidad, double AtrPrecio, double AtrPrecioVenta) {
        this.AtrNombre = AtrNombre;
        this.AtrCodigo = AtrCodigo;
        this.AtrCantidad = AtrCantidad;
        this.AtrPrecio = AtrPrecio;
        this.AtrPrecioVenta = AtrPrecioVenta;
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

    
    
   

    private final String AtrNombre;
    private final String AtrCodigo;
    private final int AtrCantidad;
    private final double AtrPrecio;
    private final double AtrPrecioVenta;
}
