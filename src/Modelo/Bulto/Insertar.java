package Modelo.Bulto;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

//@author Cristopher Soto Viloria
public class Insertar {
    //Metodo para adicionar datos
    public void adicionarBulto(String remitentef, String destinatariof, String valoraf, String valortf){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Instruccion sql
        String sql = "INSERT INTO Bulto(Remitente, Destinatario, Valor_Asegurado, Precio_pagado_por_traslado) VALUES (?,?,?,?)";
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
            JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: Hubo un problema al insertar el registro. Info: " + e.getMessage());
        }
    }
}
