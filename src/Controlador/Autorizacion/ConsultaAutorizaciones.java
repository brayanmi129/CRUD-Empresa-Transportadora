/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Autorizacion;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class ConsultaAutorizaciones {
    
        public void llenarComboBoxConductores(JComboBox<String> combox) {
        
        
        Conexion conexion = new Conexion();
         String sql = "SELECT CC, (Nombre || ' ' || Apellidos) AS NombreCompleto FROM Chofer";
         Statement st;
         try{
              st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            combox.removeAllItems();
            while (rs.next()) {
                int conductor = rs.getInt("CC");
                combox.addItem(String.valueOf(conductor));
            }
             
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: No se genero el resultado " + e.getMessage());
        }
    
    }
    
}
