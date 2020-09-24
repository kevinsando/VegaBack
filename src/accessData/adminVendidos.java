package accessData;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Kevin Sandoval
 */
public class adminVendidos {

    public adminVendidos() {
    }
    public static Object getInstance() {
        if (instance == null) {
            instance = new adminVendidos();
        }
        return instance;
    }
    
    public List<Producto> listarProductos(){//Busca en la bd los productos
        List<Producto> productos = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            productos.add(new Producto("1", "1", i, i, i,"","",""));
        }
        return productos;
    }
    
    public List<Producto> listarMasVendidos(List productos){
        List<Producto> vendidos = new ArrayList<>();
        for(int i=0;i<5;i++){
            vendidos.add((Producto) productos.get(i));
        }
        return vendidos;
    }
    
    public List<Producto> listarMenosVendidos(List productos){
        List<Producto> vendidos = new ArrayList<>();
        for(int i=(productos.size()-5);i<productos.size();i++){
            vendidos.add((Producto) productos.get(i));
        }
        return vendidos;
    }
    
    
    private static adminVendidos instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";
}
/*
Para productos más vendidos solo se muestran los primeros n elementos de la lista generada aquí.

Para productos menos vendidos solo se muestran los últimos n elementos de la lista generada aquí.

*/