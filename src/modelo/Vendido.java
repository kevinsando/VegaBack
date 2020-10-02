package modelo;

/**
 *
 * @author Kevin Sandoval
 */
public class Vendido {

    public Vendido(String atrFecha, String atrNombre, String atrCodigo) {
        this.atrFecha = atrFecha;
        this.atrNombre = atrNombre;
        this.atrCodigo = atrCodigo;
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

    @Override
    public String toString() {
        return "Vendido{" + "atrFecha=" + atrFecha + ", atrNombre=" + atrNombre + ", atrCodigo=" + atrCodigo + '}';
    }
    
    
    
    
    private String atrFecha;
    private String atrNombre;
    private String atrCodigo;
}
