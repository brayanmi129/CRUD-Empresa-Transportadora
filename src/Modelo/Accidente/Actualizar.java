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
public class Actualizar {
    
      //Un metodo para actualizar los datos en la base de datos
    public void Actualizar(int IDf ,String fecha,int conductor,String placa,float costo,String descrip){
     //Crear objeto en la base de datos
     Conexion conexion = new Conexion();
     //Declarar una variable para la conexion SQL
     String sql = "";
     sql = "UPDATE Accidente SET Fecha=?, CC=?,Placa=?,Costo_danos=?,Descripcion=? WHERE ID_Accidente= ?";
     
     try{
         PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
         pst.setString(1, fecha);
         pst.setInt(2, conductor);
         pst.setString(3, placa);
         pst.setFloat(4, costo);
         pst.setString(5, descrip);
         pst.setInt(6, IDf);
        pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "El accidente " + IDf + " Se actualizo correctamente ");
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo Actualizar: "+e.getMessage());
        }
    
    
    
    }
    
}
