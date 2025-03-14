package Controlador.Conductor;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//@author Cristopher Soto Viloria
public class Consultar {
    //Metodo para traer los datos de la base de datos
    public void mostrarConductor(JTable tblConductor){
        //Objeto de conexion a la base de datos
        Conexion conexion = new Conexion();
        //Onjeto para manejar la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Titulos de la tabla
        modelo.addColumn("CC");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Antiguedad");
        //Llevar los titulos a la tabla
        tblConductor.setModel(modelo);
        //Instruccion SQL
        String sql = "SELECT * FROM Conductor";
        //Vector para los registros}
        String [] datos = new String[5];
        //Variable tipo statement
        Statement st;
        try{
            st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            //Recorrer el paquete de datos y manipularlo registro a registro
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                //Adicionar registro a el modelo
                modelo.addRow(datos);
            }
            tblConductor.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: No se pudo traer la información de la base de datos. Info: " + e.getMessage());
        }
    }
}
