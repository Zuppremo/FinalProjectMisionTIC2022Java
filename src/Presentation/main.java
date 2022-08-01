/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Logic.Product;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zuppremo
 */
public class main extends javax.swing.JFrame {
    
    public boolean isNumeric(String text){
        try{
            double a = Double.parseDouble(text);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    
    public boolean validate(String comprobationType){
        boolean sucess = false;
        String id = jTextFieldId.getText();
        String name = jTextFieldName.getText();
        String temperature = JTextFieldTemperature.getText();
        String baseValue = jTextFieldBaseValue.getText();
        
        if (comprobationType.equals("TODOSLOSCAMPOS")){
            if(!id.isEmpty() && !name.isEmpty() && isNumeric(temperature) && isNumeric(baseValue)){
                sucess = true;
            }
        }else if(comprobationType.equals("SOLOID")){
            if(!id.isEmpty())
                sucess = true;
        }
        return sucess;
    }
    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelTemperature = new javax.swing.JLabel();
        jLabelBaseValue = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        JTextFieldTemperature = new javax.swing.JTextField();
        jTextFieldBaseValue = new javax.swing.JTextField();
        jAddButton = new javax.swing.JButton();
        jUpdateButton = new javax.swing.JButton();
        jListButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelId.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabelId.setText("ID");

        jLabelName.setFont(jLabelId.getFont());
        jLabelName.setText("Nombre");

        jLabelTemperature.setFont(jLabelName.getFont());
        jLabelTemperature.setText("Temperatura");

        jLabelBaseValue.setFont(jLabelName.getFont());
        jLabelBaseValue.setText("Valor base");

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        JTextFieldTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldTemperatureActionPerformed(evt);
            }
        });

        jAddButton.setText("Agregar");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jUpdateButton.setText("Actualizar");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jListButton.setText("Listar");
        jListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListButtonActionPerformed(evt);
            }
        });

        jDeleteButton.setText("Eliminar");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jProductsTable.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        jProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Temperatura", "Valor Base", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jProductsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTemperature)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextFieldName)
                                    .addComponent(JTextFieldTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBaseValue)
                                .addGap(26, 26, 26)
                                .addComponent(jTextFieldBaseValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jTextFieldId)))
                        .addGap(18, 18, 18)
                        .addComponent(jAddButton)
                        .addGap(18, 18, 18)
                        .addComponent(jUpdateButton)
                        .addGap(22, 22, 22)
                        .addComponent(jListButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDeleteButton)))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jAddButton, jDeleteButton, jListButton, jUpdateButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDeleteButton)
                    .addComponent(jAddButton)
                    .addComponent(jUpdateButton)
                    .addComponent(jListButton)
                    .addComponent(jTextFieldBaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBaseValue))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAddButton, jDeleteButton, jListButton, jUpdateButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        if (validate("TODOSLOSCAMPOS"))
        {
            String id = jTextFieldId.getText();
            String name = jTextFieldName.getText();
            double temperature = Double.parseDouble(JTextFieldTemperature.getText());
            double baseValue = Double.parseDouble(jTextFieldBaseValue.getText());
            Product p = new Product();
            p.setId(id);
            p.setName(name);
            p.setTemperature(temperature);
            p.setBaseValue(baseValue);
            if (p.saveRegister()){
                JOptionPane.showMessageDialog(this, "Registro Guardado");
            }
            else{
                JOptionPane.showMessageDialog(this, "Registro No Guardado");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Revise todos los campos");
        }
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListButtonActionPerformed
        Product p = new Product();
        List<Product> productsList = p.listEverything();
        DefaultTableModel tableModel = new DefaultTableModel();
        Object[] titles = {"ID", "Nombre", "Temperatura", "Valor Base", "Costo"};
        Object[] rows = new Object[5];
        tableModel.setColumnIdentifiers(titles);
        for (Product px : productsList) {
            rows[0] = px.getId();
            rows[1] = px.getName();
            rows[2] = px.getTemperature();
            rows[3] = px.getBaseValue();
            rows[4] = px.calculateCostOfStorage();
            tableModel.addRow(rows);
        }

        jProductsTable.setModel(tableModel);
    }//GEN-LAST:event_jListButtonActionPerformed

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        if(validate("TODOSLOSCAMPOS"))
        {
            String id = jTextFieldId.getText();
            String name = jTextFieldName.getText();
            double temperature = Double.parseDouble(JTextFieldTemperature.getText());
            double baseValue = Double.parseDouble(jTextFieldBaseValue.getText());

            Product p = new Product();
            p.setId(id);
            p.setName(name);
            p.setTemperature(temperature);
            p.setBaseValue(baseValue);

            if (p.updateRegister())
            {
                JOptionPane.showMessageDialog(this, "Registro Actualizado");
            }else
            {
                JOptionPane.showMessageDialog(this, "Registro No Actualizado");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Valide todos los campos");
        }
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void JTextFieldTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldTemperatureActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar", "ELIMINAR", JOptionPane.YES_NO_OPTION);
        if (answer == 0){
            if(validate("SOLOID")){
                String id = jTextFieldId.getText();
                Product p = new Product();
                p.setId(id);

                if (p.deleteRegister())
                {
                    JOptionPane.showMessageDialog(this, "Registro Eliminado");
                }else
                {
                    JOptionPane.showMessageDialog(this, "Registro No Eliminado");
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Validar el campo ID");
        }
    }//GEN-LAST:event_jDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldTemperature;
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jLabelBaseValue;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTemperature;
    private javax.swing.JButton jListButton;
    private javax.swing.JTable jProductsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBaseValue;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JButton jUpdateButton;
    // End of variables declaration//GEN-END:variables
}