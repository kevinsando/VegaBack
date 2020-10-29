package modelo;

/**
 *
 * @author Kevin Sandoval
 */
public class Vendido {

    public Vendido(String atrFecha, String atrNombre, String atrCodigo, int atrCantidad) {
        this.atrFecha = atrFecha;
        this.atrNombre = atrNombre;
        this.atrCodigo = atrCodigo;
        this.atrCantidad = atrCantidad;
    }

    public Vendido() {
    }

    public String getAtrFecha() {
        return atrFecha;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public String getAtrCodigo() {
        return atrCodigo;
    }

    public void setAtrFecha(String atrFecha) {
        this.atrFecha = atrFecha;
    }

    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }

    public void setAtrCodigo(String atrCodigo) {
        this.atrCodigo = atrCodigo;
    }

    public int getAtrCantidad() {
        return atrCantidad;
    }

    public void setAtrCantidad(int atrCantidad) {
        this.atrCantidad = atrCantidad;
    }

    @Override
    public String toString() {
        return "Vendido{" + "atrFecha=" + atrFecha + ", atrNombre=" + atrNombre + ", atrCodigo=" + atrCodigo + ", atrCantidad=" + atrCantidad + '}';
    }
    

    private String atrFecha;
    private String atrNombre;
    private String atrCodigo;
    private int atrCantidad;
}
