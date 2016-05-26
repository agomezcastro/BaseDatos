
package basesdedatos;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Datos {
    
    Connection conexion = null;
    
    public Connection conectar() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conexion=(Connection) DriverManager.getConnection("jdbc:mysql://10.0.0.254/agomezcastro", 
                    "agomezcastro", "agomezcastro");
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        return conexion;
    }
}
