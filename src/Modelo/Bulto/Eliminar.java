package Modelo.Bulto;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class Eliminar {
    public void eliminarBulto(int ID_Bulto){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Variable sql
        String sql = "";
        //Instruccion sql
        sql = "DELETE FROM Bulto WHERE ID_Bulto = ?";
        try{
            //
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setInt(1, ID_Bulto);
            //Ejecutar instruccion sql
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"El registro fue eliminado exitosamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error No se pudo eliminar el registro" + e.getMessage());
        }
    }
}
