package Modelo.Bulto;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class cInsertar {
    //Metodo para adicionar datos
    public void adicionarBulto(String remitentef, String destinatariof, String valoraf, String valortf){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable SQL
        String sql = "";
        //Instruccion sql
        sql = "INSERT INTO Bulto(Remitente, Destinatario, Valor_Asegurado, Precio_pagado_por_traslado) VALUES (?,?,?,?)";
        try{
            //Preparar instruccion para llevarla a la BD
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            //Asignar variables a cada interrogacion
            pst.setString(1, remitentef);
            pst.setString(2, destinatariof);
            pst.setString(3, valoraf);
            pst.setString(4, valortf);
            //Ejecutat instruccion sql
            pst.execute();
            JOptionPane.showMessageDialog(null, "El registro se adiciono correctamente.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error!! El registro NO se adiciono " + e.getMessage());
        }
    }
}
