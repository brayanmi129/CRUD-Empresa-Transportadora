package Vista.Bulto;

import Controlador.Bulto.Consultar;
import Modelo.Bulto.Actualizar;
import Modelo.Bulto.Eliminar;
import Modelo.Bulto.Insertar;
import Vista.Main;
import javax.swing.JOptionPane;

//@author braya
public class Bulto extends javax.swing.JFrame {
    public Bulto() {
        initComponents();
        setLocationRelativeTo(null);
        Consultar consulta = new Consultar();
        consulta.mostrarBultos(tblBulto);
    }
    public void Limpiar(){
        txtID_Bulto.setText("");
        txtRemitente.setText("");
        txtDestinatario.setText("");
        txtValor_Paquete.setText("");
        txtValor_envio.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID_Bulto = new javax.swing.JTextField();
        txtRemitente = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        txtValor_Paquete = new javax.swing.JTextField();
        txtValor_envio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBulto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID_Bulto.setEditable(false);

        jLabel1.setText("ID_Bulto");

        jLabel2.setText("Remitente");

        jLabel3.setText("Destinatario");

        jLabel4.setText("Valor Paquete");

        jLabel5.setText("Valor Envio");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Bultos");

        tblBulto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBulto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBultoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBulto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtValor_Paquete, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(txtDestinatario)
                                    .addComponent(txtRemitente)
                                    .addComponent(txtID_Bulto)
                                    .addComponent(txtValor_envio))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID_Bulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor_Paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver))
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String remitente, destinatario, valora, valort;
        remitente = txtRemitente.getText().toString();
        destinatario = txtDestinatario.getText().toString();
        valora = txtValor_Paquete.getText().toString();
        valort = txtValor_envio.getText().toString();
        
        if (!remitente.isEmpty() && !destinatario.isEmpty() && !valora.isEmpty() && !valort.isEmpty()){
            Insertar insertar = new Insertar();
            insertar.adicionarBulto(remitente, destinatario, valora, valort);
            Consultar consulta = new Consultar();
            consulta.mostrarBultos(tblBulto);
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Todos los campos DEBEN tener informacion.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblBultoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBultoMouseClicked
        // TODO add your handling code here:
        //Definir variable para el manejo de la filade la tabla donde se pulsa el  clic
        int fila = tblBulto.getSelectedRow();
        //Llenar los campos de el formulario con los datos del registro seleccionado.
        txtID_Bulto.setText((String) tblBulto.getValueAt(fila, 0));
        txtRemitente.setText((String) tblBulto.getValueAt(fila, 1));
        txtDestinatario.setText((String) tblBulto.getValueAt(fila, 2));
        txtValor_Paquete.setText((String) tblBulto.getValueAt(fila, 3));
        txtValor_envio.setText((String) tblBulto.getValueAt(fila, 4));
    }//GEN-LAST:event_tblBultoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String ID_Bultof;
        ID_Bultof = txtID_Bulto.getText().toString();
        int ID_bultoint = Integer.parseInt(ID_Bultof);
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desa eliminar este registro?");
        if (respuesta == 0){
            Eliminar eliminar  = new Eliminar();
            eliminar.eliminarBulto(ID_bultoint);
            Consultar consulta = new Consultar();
            consulta.mostrarBultos(tblBulto);
            Limpiar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String ID_Bulto, remitente, destinatario, valora, valorp;
        remitente = txtRemitente.getText().toString();
        destinatario = txtDestinatario.getText().toString();
        valora = txtValor_Paquete.getText().toString();
        valorp = txtValor_envio.getText().toString();
        ID_Bulto = txtID_Bulto.getText().toString();
        int ID_Bultoint = Integer.parseInt(ID_Bulto);
        Actualizar actualizar = new Actualizar();
        actualizar.actualizarBulto(ID_Bultoint, remitente, destinatario, valora, valorp);
        Consultar consulta = new Consultar();
        consulta.mostrarBultos(tblBulto);
        Limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBulto;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtID_Bulto;
    private javax.swing.JTextField txtRemitente;
    private javax.swing.JTextField txtValor_Paquete;
    private javax.swing.JTextField txtValor_envio;
    // End of variables declaration//GEN-END:variables
}
