package Modelo.Viaje;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Actualizar{
   public void Actualizar(int ID_Viaje, String CC, String Placa, String Lugar_destino, String Lugar_salida, String Fecha_salida, String Fecha_llegada, String ID_Bulto){
       Conexion conexion = new Conexion();
       String sql="";
       sql = "UPDATE Viaje SET ID_Viaje = ?, CC = ?, Placa = ?, Lugar_destino = ?, Lugar_salida = ?, Fecha_salida = ?, Fecha_llegada = ?, ID_Bulto = ? WHERE ID_Viaje = ?";
       try{
           PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
           pst.setInt(1, ID_Viaje);
           pst.setString(2, CC);
           pst.setString(3, Placa);
           pst.setString(4, Lugar_destino);
           pst.setString(5, Lugar_salida);
           pst.setString(6, Fecha_salida);
           pst.setString(7, Fecha_llegada);
           pst.setString(8, ID_Bulto);
           pst.setInt(9, ID_Viaje);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente.");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: No se pudo realizar la actualización. Info: "+e.getMessage());
       }
   } 
}