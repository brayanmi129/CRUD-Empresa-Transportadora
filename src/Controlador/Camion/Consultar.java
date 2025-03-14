package Controlador.Camion;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consultar {
    public void mostrarCamiones(JTable table){
        Conexion conexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Valor");
        modelo.addColumn("Aseguradora");
        modelo.addColumn("Kilometraje");
        modelo.addColumn("Chofer");
        
        table.setModel(modelo);
        
        sql = "SELECT * FROM Camion";
        
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
            JOptionPane.showMessageDialog(null, "Error: No se pudieron traer los datos de la base de datos. Info: "+e.getMessage());
        }
    }
}