/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author Dell
 */
public class TEstoque extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQtd;
    private javax.swing.JTextField jtValor;
    private javax.swing.JTextField jtidProd;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form Estoque
     */
    public TEstoque() {
        initComponents();
        carregaTabelaPRod();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtQtd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtidProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProduto.setBackground(new java.awt.Color(36, 47, 65));
        jTableProduto.setForeground(new java.awt.Color(255, 255, 255));
        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "IDProd", "Nome", "Descrição", "Fornecedor", "Quantidade", "valor","DataCompra","Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false ,false , false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 104, 660, 287));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Excluir");
        jButton1.setName("BAtualizar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        jtValor.setName("TfQuantidade"); // NOI18N
        jPanel1.add(jtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 100, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("valor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jtQtd.setName("TfProduto"); // NOI18N
        jPanel1.add(jtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 100, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IdProduto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        jtidProd.setName("TfProduto"); // NOI18N
        jPanel1.add(jtidProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Prod");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, -1));

        jtNome.setName("TfQuantidade"); // NOI18N
        jPanel1.add(jtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 150, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantidade");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jButton2.setText("Atualizar");
        jButton2.setName("BAtualizar"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        evt.getClass();
        
        if(jTableProduto.getSelectedRow() != -1 ){
        
           control.Control.excluirProduto((int)jTableProduto.getValueAt(jTableProduto.getSelectedRow(),0));

             carregaTabelaPRod();       
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyReleased
        // TODO add your handling code here:
        evt.getClass();
                            
        if(jTableProduto.getSelectedRow() != -1 ){
        
        jtidProd.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),0 ).toString());
        jtNome.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),1).toString());
        jtQtd.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),4).toString());
        jtValor.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),5).toString());
        
        }
        
        
        
    }//GEN-LAST:event_jTableProdutoKeyReleased

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        // TODO add your handling code here:
        evt.getClass();
         if(jTableProduto.getSelectedRow() != -1 ){
        
        jtidProd.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),0 ).toString());
        jtNome.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),1).toString());
        jtQtd.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),4).toString());
        jtValor.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(),5).toString());
        
        }
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        evt.getClass();
               if(jTableProduto.getSelectedRow() != -1 ){
                
                  control.Control.updateProduto(
                (int)jTableProduto.getValueAt(jTableProduto.getSelectedRow(),0),
                jtNome.getText(),                
                Float.parseFloat(jtValor.getText()),
                jTableProduto.getValueAt(jTableProduto.getSelectedRow(),2).toString(),
                jTableProduto.getValueAt(jTableProduto.getSelectedRow(),6).toString(),
                jTableProduto.getValueAt(jTableProduto.getSelectedRow(),7).toString(),
                jTableProduto.getValueAt(jTableProduto.getSelectedRow(),3).toString(),
                (float)jTableProduto.getValueAt(jTableProduto.getSelectedRow(),4));
                 carregaTabelaPRod(); 
                 
                     
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public void carregaTabelaPRod(){
        
            DefaultTableModel  model= (DefaultTableModel) jTableProduto.getModel();
            model.setNumRows(0);
            
            
          
         
           
            
            for (Produto p: control.Control.listarProdutos()){
                model.addRow(new Object[]{
                p.getCodigo(),
                p.getNome(),
                p.getDescricao(),
                p.getFornecedor(),
                p.getQntArmazenada(),
                p.getValor(),
                p.getDataCompra(),
                p.getDataValidade()
                
                });
                
            }
    
    
    
    }
    
    
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
            java.util.logging.Logger.getLogger(TEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEstoque().setVisible(true);
                
            }
        });
    }

  
}
