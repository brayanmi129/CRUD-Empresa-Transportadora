package Modelo.Bulto;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class Actualizar {
    public void actualizarBulto(int ID_Bulto, String remitente, String destinatario, String valora, String valorf){
        //Crear conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable sql
        String sql = "";
        //Instruccion Sql
        sql = "UPDATE Bulto SET Remitente = ?, Destinatario = ?, Valor_asegurado = ?, Precio_pagado_por_traslado = ? WHERE ID_Bulto = ?";
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, remitente);
            pst.setString(2, destinatario);
            pst.setString(3, valora);
            pst.setString(4, valorf);
            pst.setInt(5, ID_Bulto);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no se pudo actualizar el registro" + e.getMessage());
        }
    }
}
