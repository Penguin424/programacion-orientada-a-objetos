package dialogos;

import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rOpcion1 = new javax.swing.JCheckBox();
        rOpcion2 = new javax.swing.JCheckBox();
        rOpcion3 = new javax.swing.JCheckBox();
        rOpcion4 = new javax.swing.JCheckBox();
        rOpcion5 = new javax.swing.JCheckBox();
        rOpcion6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Cuadros de diálogo con JOptionPane");

        buttonGroup1.add(rOpcion1);
        rOpcion1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion1.setText("Ícono y mensaje por omisión");
        rOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOpcion1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rOpcion2);
        rOpcion2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion2.setText("Mensaje sin ícono ");

        buttonGroup1.add(rOpcion3);
        rOpcion3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion3.setText("Ícono de warning");
        rOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOpcion3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rOpcion4);
        rOpcion4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion4.setText("Ícono de error");
        rOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOpcion4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rOpcion5);
        rOpcion5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion5.setText("Ícono de información");

        buttonGroup1.add(rOpcion6);
        rOpcion6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        rOpcion6.setText("Ícono de pregunta");

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rOpcion5)
                    .addComponent(rOpcion4)
                    .addComponent(rOpcion3)
                    .addComponent(rOpcion2)
                    .addComponent(rOpcion1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rOpcion6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton1)))
                        .addGap(10, 10, 10)
                        .addComponent(jButton2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rOpcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rOpcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rOpcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rOpcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rOpcion5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rOpcion6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOpcion1ActionPerformed
        
    }//GEN-LAST:event_rOpcion1ActionPerformed

    private void rOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOpcion3ActionPerformed
        
    }//GEN-LAST:event_rOpcion3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOpcion4ActionPerformed
        
    }//GEN-LAST:event_rOpcion4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rOpcion1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo con el ícono por omision", "Opcion1", JOptionPane.DEFAULT_OPTION);
        }
        if(rOpcion2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo con un mensaje sin ícono", "Opcion2", JOptionPane.PLAIN_MESSAGE);
        }
        if(rOpcion3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo con el ícono de advertencia", "Opcion3", JOptionPane.WARNING_MESSAGE);
        }
        if(rOpcion4.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo con el ícoono de error", "Opcion4", JOptionPane.ERROR_MESSAGE);
        }
        if(rOpcion5.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo que muestra el ícono de informción ", "Opcion5", JOptionPane.INFORMATION_MESSAGE);            
        }
        if(rOpcion6.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Este es un cuadro de dialogo que muestra el icono de pregunta ", "Opcion6", JOptionPane.QUESTION_MESSAGE);            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox rOpcion1;
    private javax.swing.JCheckBox rOpcion2;
    private javax.swing.JCheckBox rOpcion3;
    private javax.swing.JCheckBox rOpcion4;
    private javax.swing.JCheckBox rOpcion5;
    private javax.swing.JCheckBox rOpcion6;
    // End of variables declaration//GEN-END:variables
}
