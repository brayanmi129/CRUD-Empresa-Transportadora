package Controlador.Accidente;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//@author braya
public class Consultar {  
    public void mostrarAccidentes(JTable table){
        Conexion conexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        //Titulos de la tabla
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Conductor");
        modelo.addColumn("Vehiculo");
        modelo.addColumn("Costo");
        modelo.addColumn("Descripccion");
        
       //Llevar los titulos a la tabla
       table.setModel(modelo);
       String sql = "SELECT * FROM Accidente";
       //crear un arreglo para guardar 
       String [] datos = new String[7];
       //Crear una variable tipo Statement
       Statement st;
       
       try{
           st = conexion.establecerConexion().createStatement();
           ResultSet rs = st.executeQuery(sql);
           //Recorrer el paquete de datos y manipularlo de registro a registro
           while(rs.next()){
               datos[0] = rs.getString(1);
               datos[1] = rs.getString(2);
               datos[2] = rs.getString(3);
               datos[3] = rs.getString(4);
               datos[4] = rs.getString(5);
               datos[5] = rs.getString(6);
               modelo.addRow(datos);
               
           }
           table.setModel(modelo);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: No se pudo traer la información de la base de datos. Info: " + e.getMessage());
           
       }
    }
    
}
