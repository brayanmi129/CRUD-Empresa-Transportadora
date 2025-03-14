/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo.autorizacion;

import Modelo.Accidente.*;
import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class EliminarAutorizacion {
    
        public void Eliminar(int ID){
        
     Conexion conexion = new Conexion();
     conexion.establecerConexion();
     String sql = "";
     sql = "DELETE FROM Camiones_autorizados WHERE ID_Autorizacion = ?";
     try{
         PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
         
        pst.setInt(1, ID);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se elimino la autorizacion: " + ID);
        
     }catch(Exception e){
         
            JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el accidente: " + ID + e.getMessage());
     }
     
     
             
    }
    
}
