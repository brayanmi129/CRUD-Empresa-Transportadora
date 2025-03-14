package Controlador.Bulto;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristopher Soto Viloria
 */
public class cConsultar {
    //Metodo para traer los datos y crear la tabla
    public void mostrarBultos(JTable tblBultos){
        //Conexion con la base de datos
        Conexion conexion = new Conexion();
        //Objeto para manejar la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Instruccion SQL
        String sql = "";
        //Titulos de la tabla
        modelo.addColumn("ID_Bulto");
        modelo.addColumn("Remitente");
        modelo.addColumn("Destinatario");
        modelo.addColumn("Valor Paquete");
        modelo.addColumn("Valor Envio");
        //Colocar los titulos en la tabla del modelo
        tblBultos.setModel(modelo);
        //Instruccion SQL
        sql = "SELECT * FROM Bulto";
        //Vector para guardar los registros
        String [] datos  = new String[5];
        //Variable Statement
        Statement st;
        try {
            st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                //Adicionar el registro a el modelo
                modelo.addRow(datos);
            }
            tblBultos.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: No se genero el resultado" + e.getMessage());
        }
    }
}
