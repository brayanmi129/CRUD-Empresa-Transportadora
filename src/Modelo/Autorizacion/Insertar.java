package Modelo.Autorizacion;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

//@author braya
public class Insertar {
    public void Adicionar(int cc,String placa){
        Conexion conexion = new Conexion();
        String sql = "INSERT INTO Camiones_autorizados (CC_conductor, Placa_Vehiculo) VALUES (?,?)";
 
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setInt(1, cc);
            pst.setString(2, placa);
            pst.execute();
            JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo insertar la autorización. Info: "+e.getMessage());
        }
    }
    
}
