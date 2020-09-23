/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessData;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Kevin Sandoval
 */
public class adminExistencias {

    public adminExistencias() {
    }

    public static Object getInstance() {
        if (instance == null) {
            instance = new adminExistencias();
        }
        return instance;
    }

    /**
     *
     * @return
     */
    public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "1", 0, 0, 0));
        
        return productos;
    }
    
    private static adminExistencias instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";

    
}
