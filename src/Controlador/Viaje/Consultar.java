package Controlador.Viaje;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consultar {
    public void mostrarViajes(JTable table){
        Conexion conexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID_Viaje");
        modelo.addColumn("CC");
        modelo.addColumn("Placa");
        modelo.addColumn("Lugar_destino");
        modelo.addColumn("Lugar_salida");
        modelo.addColumn("Fecha_salida");
        modelo.addColumn("Fecha_llegada");
        modelo.addColumn("ID_Bulto");
        
        table.setModel(modelo);
        
        String sql = "SELECT * FROM Viaje";
        
        String [] datos = new String[7];
        
        Statement st;
        try{
            st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: No se pudo traer la información de la base de datos. Info: "+e.getMessage());
        }
    }
}