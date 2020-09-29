package accessData;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Kevin Sandoval
 */
public class adminExistencias {

    private adminExistencias() {
    }

    public static adminExistencias getInstance() {
        if (instance == null) {
            instance = new adminExistencias();
        }
        return instance;
    }

    public List<Producto> listarProductos(){//Busca en la bd los productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "1", 1, 1, 1,"1","1","1"));
        productos.add(new Producto("2", "2", 2, 2, 2,"2","2","2"));
        productos.add(new Producto("3", "3", 3, 3, 3,"3","3","3"));
        productos.add(new Producto("4", "4", 4, 4, 4,"4","4","4"));
        
        return productos;
    }
    
    private static adminExistencias instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";

    
}//END CLASS
