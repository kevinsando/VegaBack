package vegaback;

import accessData.adminExistencias;
import accessData.adminExistencias;
import accessData.adminVendidos;

/**
 *
 * @author Kevin Sandoval
 */
public class VegaBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adminExistencias a = new adminExistencias();
        adminVendidos ap = new adminVendidos();
        
        System.out.println("Existencias:");
        System.out.println(a.listarProductos());
        System.out.println("=================================================");
        System.out.println(ap.listarProductos());
        System.out.println("Mas vendidos:");
        System.out.println(ap.listarMasVendidos(ap.listarProductos()));
        
        System.out.println("Menos vendidos:");
        System.out.println(ap.listarMenosVendidos(ap.listarProductos()));
    }

}
