package Modelo.Conductor;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

//@author Cristopher Soto Viloria
public class Eliminar {
    public void eliminarConductor(int cc){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Instruccion sql
        String sql = "DELETE FROM Conductor WHERE CC = ?";
        try{
            //Preparar la instruccion
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            //Asignar variable a la interrogante
            pst.setInt(1, cc);
            //Ejecutar instruccion sql
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"El registro fue eliminado exitosamente.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: No se pudo eliminar el registro. Info: " + e.getMessage());
        }
    }
}
