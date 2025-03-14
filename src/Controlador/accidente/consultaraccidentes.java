/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.accidente;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class consultaraccidentes {
    
    public void mostrarAccidentes( JTable jTable1){
        Conexion conexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        //Titulos de la tabla
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Conductor");
        modelo.addColumn("Vehiculo");
        modelo.addColumn("Costo");
        modelo.addColumn("Descripccion");
        
       //Llevar los titulos a la tabla
       jTable1.setModel(modelo);
       sql = "SELECT A.ID_Accidente, A.Fecha, (C.Nombre || ' ' || C.Apellidos) AS Conductor, \n" +
"       A.Placa, A.Costo_danos, A.Descripcion\n" +
"FROM Accidente A\n" +
"JOIN Chofer C ON A.CC = C.CC";
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
           jTable1.setModel(modelo);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error... No se genero resultado deñ select " + e.getMessage());
           
       }
    }
    
}
