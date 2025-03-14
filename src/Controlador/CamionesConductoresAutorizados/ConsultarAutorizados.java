package Controlador.CamionesConductoresAutorizados;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//@author braya
public class ConsultarAutorizados {
       public void mostrarPlacas(String cc, JTable tblConductor){
        //Objeto de conexion a la base de datos
        Conexion conexion = new Conexion();
        //Onjeto para manejar la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Titulos de la tabla
        modelo.addColumn("ID");
        modelo.addColumn("Placa");
        //Llevar los titulos a la tabla
        tblConductor.setModel(modelo);
        //Instruccion SQL
        String sql = "SELECT ID_Autorizacion , Placa_Vehiculo " + "FROM Camiones_autorizados " + "WHERE CC_conductor = ?";
        //Vector para los registros}
        String [] datos = new String[2];
        //Variable tipo statement

        try{
            PreparedStatement pst = conexion.establecerConexion().prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(cc)); // Convierte la selección a entero
            //Recorrer el paquete de datos y manipularlo registro a registro
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                //Adicionar registro a el modelo
                modelo.addRow(datos);
            }
            tblConductor.setModel(modelo);
            rs.close();
            pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: No se genero el resultado " + e.getMessage());
        }
    }
}
