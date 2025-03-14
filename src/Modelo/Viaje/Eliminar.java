package Modelo.Viaje;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Eliminar {
   public void Eliminar(int ID){
       Conexion conexion = new Conexion();
       String sql = "DELETE FROM Viaje WHERE ID_Viaje = ?";
       try{
           PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
           pst.setInt(1, ID);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "El registro fue eliminado correctamente.");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: No se pudo borrar el registro. Info: "+e.getMessage());
       }     
   } 
}