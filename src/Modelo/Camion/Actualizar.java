package Modelo.Camion;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Actualizar{
   public void Actualizar(String Placa, String Marca, String Modelo, String Valor, String Aseguradora, String km, String Chofer){
       Conexion conexion = new Conexion();
       String sql="";
       sql = "UPDATE Camion SET Marca = ?, Modelo = ?, Valor_de_adquisicion = ?, Compania_aseguradora = ?, Kilometraje_recorrido = ?, Chofer = ? WHERE Placa = ?";
       try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, Marca);
            pst.setString(2, Modelo);
            pst.setString(3, Valor);
            pst.setString(4, Aseguradora);
            pst.setString(5, km);
            pst.setString(6, Chofer);
            pst.setString(7, Placa);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente.");
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo realizar la actualización. Info: "+e.getMessage());
       }
   } 
}