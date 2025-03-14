package Modelo.Camion;

//@author Sergio Angel

import Controlador.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

 
public class Insertar {
    public void Adicionar(String Placa, String Marca, String Modelo, String Valor, String Aseguradora, String km, String Chofer){
        Conexion conexion = new Conexion();
        String sql = "INSERT INTO Camion (Placa, Marca, Modelo, Valor_de_adquisicion, Compania_aseguradora, Kilometraje_recorrido, Chofer) VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setString(1, Placa);
            pst.setString(2, Marca);
            pst.setString(3, Modelo);
            pst.setString(4, Valor);
            pst.setString(5, Aseguradora);
            pst.setString(6, km);
            pst.setString(7, Chofer);
            pst.execute();
            JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: Hubo un problema al insertar el registro. Info: "+e.getMessage());
        }
    }
}