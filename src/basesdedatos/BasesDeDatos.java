package basesdedatos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agomezcastro
 */
public class BasesDeDatos {

    
    public static void main(String[] args) {
        Datos con = new Datos();
        try {
            con.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
