/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Accidente;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Eliminar {
    
        public void Eliminar(int ID){
        
     Conexion conexion = new Conexion();
     conexion.establecerConexion();
     String sql = "";
     sql = "DELETE FROM Accidente WHERE ID_Accidente = ?";
     try{
         PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
         
        pst.setInt(1, ID);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se elimino el accidente: " + ID);
        
     }catch(Exception e){
         
            JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el accidente: " + ID + e.getMessage());
     }
     
     
             
    }
    
}
