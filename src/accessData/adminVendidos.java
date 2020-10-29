package accessData;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.Vendido;

/**
 *
 * @author Kevin Sandoval
 */
public class adminVendidos {

    private adminVendidos() {
    }

    public static adminVendidos getInstance() {
        if (instance == null) {
            instance = new adminVendidos();
        }
        return instance;
    }

    public List<Vendido> listarVendidos() {//Busca en la bd los productos
        List<Producto> productos = adminExistencias.getInstance().listarProductos();
        List<Vendido> vendidos = new ArrayList<>();
        String codigo = " ";
        String fecha = " ";
        for (int i = 0; i < productos.size(); i++) {
            Producto aux = productos.get(i);
            if (!codigo.equals(aux.getAtrCodigo())) {
                vendidos.add(new Vendido(fecha, aux.getAtrNombre(), aux.getAtrCodigo(), aux.getAtrCantidad()));
            }
        }
        return vendidos;
    }

    public List<Vendido> listarMasVendidos() {
        List<Vendido> productos = this.listarVendidos();
        List<Vendido> vendidos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vendidos.add((Vendido) productos.get(i));
        }
        return vendidos;
    }

    public List<Vendido> listarMenosVendidos() {
        List<Vendido> vendidos = new ArrayList<>();
        List<Vendido> productos = this.listarVendidos();
        for (int i = (productos.size() - 5); i < productos.size(); i++) {
            vendidos.add((Vendido) productos.get(i));
        }
        return vendidos;
    }

    public List<Vendido> listarMes() {
        List<Vendido> vendidos = new ArrayList<>();
        List<Vendido> productos = this.listarVendidos();
        for (int i = (productos.size() - 5); i < productos.size(); i++) {
            vendidos.add((Vendido) productos.get(i));
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
