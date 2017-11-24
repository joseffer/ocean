/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Funcionario;
import modelDAO.FuncionarioDAO;
import javax.swing.JPanel;

/**
 *
 * @author j155993
 */
public class TCadastro extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TfSenha;
    private javax.swing.JLabel TfUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcCargo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfInss;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form CadastroFuncionario
     */
    public TCadastro() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tfRg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tfInss = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TfUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        TfSenha = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        tfCpf.setBackground(new java.awt.Color(36, 47, 65));
        tfCpf.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfCpf.setForeground(new java.awt.Color(255, 255, 255));
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });
        jPanel1.add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 150, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tfNome.setBackground(new java.awt.Color(36, 47, 65));
        tfNome.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 450, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, -1));

        tfRg.setBackground(new java.awt.Color(36, 47, 65));
        tfRg.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfRg.setForeground(new java.awt.Color(255, 255, 255));
        tfRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRgActionPerformed(evt);
            }
        });
        jPanel1.add(tfRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RG:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Endereço:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        tfEndereco.setBackground(new java.awt.Color(36, 47, 65));
        tfEndereco.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(tfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 430, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        tfSalario.setBackground(new java.awt.Color(36, 47, 65));
        tfSalario.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfSalario.setForeground(new java.awt.Color(255, 255, 255));
        tfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(tfSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 124, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 490, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INSS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        tfInss.setBackground(new java.awt.Color(36, 47, 65));
        tfInss.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfInss.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfInss, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 119, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        TfUsuario.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TfUsuario.setText("Usuario:");
        jPanel1.add(TfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        tfUsuario.setBackground(new java.awt.Color(36, 47, 65));
        tfUsuario.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 124, 30));

        tfSenha.setBackground(new java.awt.Color(36, 47, 65));
        tfSenha.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 30));

        TfSenha.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TfSenha.setForeground(new java.awt.Color(255, 255, 255));
        TfSenha.setText("Senha:");
        jPanel1.add(TfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 11));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 150, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 170, 10));

        jPanel2.setBackground(new java.awt.Color(232, 81, 74));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salvar");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 120, 40));

        jcCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Frentista" }));
        jcCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jcCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
        evt.getClass();
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRgActionPerformed
        // TODO add your handling code here:
         evt.getClass();
    }//GEN-LAST:event_tfRgActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
         evt.getClass();
    }//GEN-LAST:event_tfCpfActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
         evt.getClass();
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
         evt.getClass();
    }//GEN-LAST:event_tfSenhaActionPerformed

    public void limpar(){
        tfNome.setText(null);
        tfEndereco.setText(null);
        tfSalario.setText(null);
        tfRg.setText(null);
        tfCpf.setText(null);
        tfInss.setText(null);
        tfUsuario.setText(null);
        tfSenha.setText(null);
    }
    
    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
        evt.getClass();
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioActionPerformed
        // TODO add your handling code here:
        evt.getClass();
    }//GEN-LAST:event_tfSalarioActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        //Codigo de cadastro aqui
       // JOptionPane.showMessageDialog(null,jcCargo.getItemAt(WIDTH));
        evt.getLocationOnScreen();
        control.Control.addFuncionario(tfNome.getText(),
            tfEndereco.getText(),
            jcCargo.getSelectedItem().toString(),
            Float.parseFloat(tfSalario.getText()),
            tfRg.getText(),
            tfCpf.getText(), 
            (float) Double.parseDouble(tfInss.getText()),
            tfUsuario.getText(),
            tfSenha.getText());

       
        
       
        limpar();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        evt.getLocationOnScreen();
        setColor(jPanel2);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        evt.getLocationOnScreen();
        resetColor(jPanel2);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jcCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCargoActionPerformed

    public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(239, 24, 14));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(232,81,74));
 }
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
            java.util.logging.Logger.getLogger(TCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadastro().setVisible(true);
            }
        });
    }

    
}
