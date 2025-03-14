package Modelo.Camion;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Eliminar {
   public void Eliminar(String Placa){
       Conexion conexion = new Conexion();
       String sql = "DELETE FROM Camion WHERE Placa = ?";
       try{
           PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
           pst.setString(1, Placa);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "El registro fue eliminado correctamente.");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: No se pudo borrar el registro. Info: "+e.getMessage());
       }     
   } 
}