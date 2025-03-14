package Modelo.Conductor;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

//@author Cristopher Soto Viloria
public class Insertar {
    public void adicionarConductor(String nombre, String apellidos, String sueldo, String antiguedad){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Instruccion sql
        String sql = "INSERT INTO Conductor (Nombre, Apellidos, Sueldo ,Antiguedad) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, sueldo);
            pst.setString(4, antiguedad);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se adicionó correctamente.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: Hubo un problema con el registro. Info: " + e.getMessage());
        }
    }
}
