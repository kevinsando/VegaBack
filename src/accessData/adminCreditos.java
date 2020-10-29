package accessData;

import modelo.Credito;

/**
 *
 * @author Kevin Sandoval
 */
public class adminCreditos {
    
    public static adminCreditos getInstance() {
        if (instance == null) {
            instance = new adminCreditos();
        }
        return instance;
    }
    
    
    private static adminCreditos instance = null;
    private static final String LISTAR = "{?=call f_list_products()}";

    public boolean guardarCredito(Credito object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
