package vegaback;

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
        adminExistencias a = adminExistencias.getInstance();
        adminVendidos ap = adminVendidos.getInstance();
        
        System.out.println("Existencias:");
        System.out.println(a.listarProductos());
        System.out.println("=================================================");
        System.out.println(ap.listarVendidos());
        System.out.println("=================================================");
        System.out.println("Mas vendidos:");
        System.out.println(ap.listarMasVendidos());
        
        System.out.println("Menos vendidos:");
        System.out.println(ap.listarMenosVendidos());
    }

}
