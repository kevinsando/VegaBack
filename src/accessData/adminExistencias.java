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

    public List<Producto> listarProductos() {//Busca en la bd los productos
        List<Producto> productos = new ArrayList<>();
        // Producto(String atrNombre, String atrCodigo, int atrCantidad, double atrPrecio, 
        //double atrPrecioVenta, String atrDescripcion, String atrGrupo, String atrFabricante)

        productos.add(new Producto("Taladro a bateria", "5343839", 58, 92000,
                108000, "Taladro baterias 1.1 kg 38nm", "Taladros", "Neo next"));

        productos.add(new Producto("Taladro cable", "4953478", 33, 35130,
                55900, "Taladro cableado 1 kg 30nm", "Taladros", "Gladiator"));

        productos.add(new Producto("Sierra circular", "1451093", 25, 35050,
                50500, " '7-1/4' 1400 w tc-cs 1401", "Sierras", "Stanley"));

        productos.add(new Producto("Trozadora", "8966945", 17, 95200,
                109900, "14/ 2300 w", "Sierras", "Dewalt"));

        productos.add(new Producto("Alicate", "2693589", 71, 5300,
                7590, "6 pulgadas de corte diagonal", "Herramientas manuales", "Stanley"));

        productos.add(new Producto("Desarmador plano", "8673269", 56, 1000,
                1595, "punta cabinet de 1/8 x 4 pulgadas", "Herramientas manuales", "Best Value"));

        productos.add(new Producto("Pulidora y lijadora", "8775342", 21, 159000,
                179000, "7 y 9 pulgadas 700 w", "Electricos", "Dewalt"));

        productos.add(new Producto("Generador a gasolina", "5366644", 15, 133500,
                149950, "2500w", "Generadores", "Forest & Garden"));

        productos.add(new Producto("Esmeril", "4368893", 33, 78400,
                89950, "angular de 9/ 2200 w", "Sierras", "Stanley"));

        productos.add(new Producto("Soldador", "6448798", 12, 75900,
                85000, "inverter 225 amperios 120/220 v", "Soldadura", "DEWALT"));

        productos.add(new Producto("Soldadura", "9375265", 124, 11500,
                14950, "6013 1/8 5 kg", "Soldadura", "Lincoln"));

        return productos;
    }

    public Producto getCantidad(String nomCod) {
        List<Producto> productos = this.listarProductos();
        Producto prod = null;
        System.out.println(nomCod.toString());
        for (int i = 0; i < productos.size(); i++) {
            if (nomCod.equals(productos.get(i).getAtrCodigo()) || nomCod.equals(productos.get(i).getAtrNombre())) {
                prod = productos.get(i);
            }
        }
        return prod;
    }

    private static adminExistencias instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";

}//END CLASS
