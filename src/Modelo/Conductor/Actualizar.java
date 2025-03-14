package Modelo.Conductor;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class Actualizar {
    public void actualizarConductor(int cc, String nombre, String apellidos, String sueldo, String antiguedad){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable SQL
        String sql = "";
        //Instruccion SQL
        sql = "UPDATE Conductor SET Nombre = ?, Apellidos = ?, Sueldo = ?, Antiguedad = ? WHERE CC = ?";
        //Preparar ejecucion de la instruccion
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, sueldo);
            pst.setString(4, antiguedad);
            pst.setInt(5, cc);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no se pudo actualizar el registro" + e.getMessage());
        }

    }
}
