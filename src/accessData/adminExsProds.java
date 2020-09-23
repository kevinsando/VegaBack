package accessData;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Kevin Sandoval
 */
public class adminExsProds {

    public adminExsProds() {
    }
    
     public static Object getInstance() {
        if (instance == null) {
            instance = new adminExsProds();
        }
        return instance;
    }
    
    private static adminExsProds instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";
    
    public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "1", 0, 0, 0));
        
        return productos;
    }
}
