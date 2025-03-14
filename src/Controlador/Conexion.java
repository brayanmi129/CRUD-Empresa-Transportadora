package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ts3plus
 */
public class Conexion {
    Connection conectar = null;
    //Cadena de conexion a la base de datos
    String cadena_conexion = "jdbc:sqlite:EmpresaTransporte.db";
    
    //Metodo establecer conexion
    public Connection establecerConexion(){
        conectar = null;
        try {
            Class.forName("org.sqlite.JDBC");
            //Abrir conexion
            conectar = DriverManager.getConnection(cadena_conexion);
            System.out.println("Conexión exitosa con la base de datos.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se realizó la conexión. Info: " + e.getMessage());
        }
        return conectar;
    }
}