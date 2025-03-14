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
public class cInsertar {
    public void adicionarConductor(String nombre, String apellidos, String sueldo, String antiguedad){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable sql
        String sql = "";
        //Instruccion sql
        sql = "INSERT INTO Conductor (Nombre, Apellidos, Sueldo ,Antiguedad) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, sueldo);
            pst.setString(4, antiguedad);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se adiciono correctamente.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error!!.. El registro NO se adiciono" + e.getMessage());
        }
    }
}
