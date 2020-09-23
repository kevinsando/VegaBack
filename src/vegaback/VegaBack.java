package vegaback;

import accessData.adminExistencias;
import accessData.adminExsProds;

/**
 *
 * @author Kevin Sandoval
 */
public class VegaBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       adminExsProds a = new adminExsProds();
  
       a.listarProductos();
    }
    
}
