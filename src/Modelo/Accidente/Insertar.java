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
public class Insertar {
        public void Adicionar(String fecha,int conductor,String placa,float costo,String descrip){
        Conexion conexion = new Conexion();
        String sql = "";
        sql = "INSERT INTO Accidente (fecha, CC, Placa, Costo_danos, Descripcion) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, fecha);
            pst.setInt(2, conductor);
            pst.setString(3, placa);
            pst.setFloat(4, costo);
            pst.setString(5, descrip);
            pst.execute();
            JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo insertar el accidente. Info: "+e.getMessage());
        }
    }
    
}
