/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Conductor;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class Eliminar {
    public void eliminarConductor(int cc){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable sql
        String sql = "";
        //Instruccion sql
        sql = "DELETE FROM Conductor WHERE CC = ?";
        try{
            //Preparar la instruccion
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            //Asignar variable a la interrogante
            pst.setInt(1, cc);
            //Ejecutar instruccion sql
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"El registro fue eliminado exitosamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error No se pudo eliminar el registro" + e.getMessage());
        }
    }
}
