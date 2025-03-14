package Modelo.Viaje;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

 
public class Insertar {
    public void Adicionar(String CC, String Placa, String LugarDestino, String LugarSalida, String FechaSalida, String FechaLlegada, String ID_Bulto){
        Conexion conexion = new Conexion();
        String sql = "INSERT INTO Viaje (CC, Placa, Lugar_destino, Lugar_salida, Fecha_salida, Fecha_llegada, ID_Bulto) VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, CC);
            pst.setString(2, Placa);
            pst.setString(3, LugarDestino);
            pst.setString(4, LugarSalida);
            pst.setString(5, FechaSalida);
            pst.setString(6, FechaLlegada);
            pst.setString(7, ID_Bulto);
            pst.execute();
            JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo realizar el registro. Info: "+e.getMessage());
        }
    }
}