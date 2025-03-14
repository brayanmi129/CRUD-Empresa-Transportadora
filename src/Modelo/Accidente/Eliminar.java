package Modelo.Accidente;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

//@author braya
public class Eliminar {  
    public void Eliminar(int ID){   
        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        String sql = "DELETE FROM Accidente WHERE ID_Accidente = ?";
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó el accidente con el ID: " + ID);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el registro. Info: " + ID + e.getMessage());
        }
    }
}