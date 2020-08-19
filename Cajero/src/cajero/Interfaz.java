package cajero;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    
    CuentaBancaria cuentas[] = new CuentaBancaria[10];
    DefaultListModel modelo = new DefaultListModel();
    int numCliente = -1;

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lClientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tDepositos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tRetiros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tSaldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tCliente = new javax.swing.JTextField();
        tDeposito = new javax.swing.JTextField();
        bCliente = new javax.swing.JButton();
        tCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cOpcion = new javax.swing.JComboBox<>();
        bMovimiento = new javax.swing.JButton();
        bTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lClientesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lClientes);

        jLabel1.setText("Clientes");

        jLabel2.setText("Depositos");

        tDepositos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tDepositos.setText("0.00");

        jLabel3.setText("Retiros");

        tRetiros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tRetiros.setText("0.00");
        tRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRetirosActionPerformed(evt);
            }
        });

        jLabel4.setText("Saldo actual");

        tSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tSaldo.setText("0.00");

        jLabel5.setText("Nuevo cliente");

        jLabel6.setText("Deposito inicial");

        tDeposito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tDeposito.setText("0.00");
        tDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDepositoActionPerformed(evt);
            }
        });

        bCliente.setLabel("Registrarcliente");
        bCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClienteActionPerformed(evt);
            }
        });

        tCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tCantidad.setText("0.00");
        tCantidad.setEnabled(false);
        tCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCantidadActionPerformed(evt);
            }
        });

        jLabel7.setText("Movimientos");

        cOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro", "Retiro" }));
        cOpcion.setEnabled(false);
        cOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cOpcionActionPerformed(evt);
            }
        });

        bMovimiento.setEnabled(false);
        bMovimiento.setLabel("Registrar movimiento");
        bMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMovimientoActionPerformed(evt);
            }
        });

        bTerminar.setLabel("Terminar");
        bTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bMovimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(bTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tDeposito))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMovimiento)
                    .addComponent(bTerminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCantidadActionPerformed

    private void cOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cOpcionActionPerformed

    private void tDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDepositoActionPerformed

    private void bMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMovimientoActionPerformed
        if(cOpcion.getSelectedItem() == "Retiro")
        {
            double cantidadAccionRe = Double.parseDouble(tCantidad.getText());
            
            if( cantidadAccionRe > 0 )
            {
                int numClienteR = lClientes.getSelectedIndex();
                int respuestaRetiro = cuentas[numClienteR].retirar(cantidadAccionRe);
                if(respuestaRetiro == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "retiro exitoso por: " + cantidadAccionRe);
                    tSaldo.setText(String.valueOf(cuentas[numClienteR].getSaldo()));
                    tRetiros.setText(String.valueOf(cuentas[numClienteR].getRetiros()));
                    tCantidad.setText("0.00");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "tu saldo actual es de: " + String.valueOf(cuentas[numClienteR].getSaldo()) + " no puedes retirar: " + cantidadAccionRe);
                }
                
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane, "Necesitas retirar mas de 0.00", "",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            double cantidadAccionDe = Double.parseDouble(tCantidad.getText());
            
            if(cantidadAccionDe > 0)
            {
                
                int numClienteD = lClientes.getSelectedIndex();
                cuentas[numClienteD].depositar(cantidadAccionDe);
                
                JOptionPane.showMessageDialog(rootPane, "deposito exitoso por: " + cantidadAccionDe);
                tSaldo.setText(String.valueOf(cuentas[numClienteD].getSaldo()));
                tDepositos.setText(String.valueOf(cuentas[numClienteD].getDepositos()));
                tCantidad.setText("0.00");
            }
        }
    }//GEN-LAST:event_bMovimientoActionPerformed

    private void bTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTerminarActionPerformed
        dispose();
    }//GEN-LAST:event_bTerminarActionPerformed

    private void tRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRetirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRetirosActionPerformed

    private void bClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClienteActionPerformed
        if(numCliente == 9){
            JOptionPane.showMessageDialog(rootPane,"No se puede agragar mas clientes", "Lista de clientes llena", JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {
            
            String nombreCliente = tCliente.getText();
            double depositoInicial = Double.parseDouble(tDeposito.getText());
           
            if(nombreCliente.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del cliente", "No existe el nombre del cliente", JOptionPane.ERROR_MESSAGE);
            } 
            else if(depositoInicial <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Debes especificar el deposito inicial", "No existe deposito inicial", JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                
                numCliente++;
                cuentas[numCliente] = new CuentaBancaria(nombreCliente, depositoInicial);
                modelo.addElement(cuentas [numCliente].getNombre());
                lClientes.setModel(modelo);
                tCliente.setText("");
                tDeposito.setText("0.00");
            }
        }
    }//GEN-LAST:event_bClienteActionPerformed

    private void lClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lClientesValueChanged
        int numClienteV = lClientes.getSelectedIndex();
        tDepositos.setText(String.valueOf(cuentas[numClienteV].getDepositos()));
        tRetiros.setText(String.valueOf(cuentas[numClienteV].getRetiros()));
        tSaldo.setText(String.valueOf(cuentas[numClienteV].getSaldo()));
        tCantidad.setEnabled(true);
        cOpcion.setEnabled(true);
        bMovimiento.setEnabled(true);
        
    }//GEN-LAST:event_lClientesValueChanged

    private void lClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lClientesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lClientesAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCliente;
    private javax.swing.JButton bMovimiento;
    private javax.swing.JButton bTerminar;
    private javax.swing.JComboBox<String> cOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lClientes;
    private javax.swing.JTextField tCantidad;
    private javax.swing.JTextField tCliente;
    private javax.swing.JTextField tDeposito;
    private javax.swing.JTextField tDepositos;
    private javax.swing.JTextField tRetiros;
    private javax.swing.JTextField tSaldo;
    // End of variables declaration//GEN-END:variables
}
