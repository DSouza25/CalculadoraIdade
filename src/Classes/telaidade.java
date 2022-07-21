/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Classes;

import javax.swing.ImageIcon;

/**
 *
 * @author dd_da
 */
public class telaidade extends javax.swing.JFrame {

    /**
     * Creates new form telaidade
     */
    public telaidade() {
        initComponents();
        lblImagem.setVisible(true);
        lblFemale.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jsAno = new javax.swing.JSpinner();
        lblAno = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        lblFemale = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jsAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 88, 89, -1));

        lblAno.setText("Ano de nascimento:");
        getContentPane().add(lblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 177, 115, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Idade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 56, 28));

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(255, 51, 0));
        lblIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdade.setText("0");
        getContentPane().add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 217, 55, -1));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 128, -1, -1));

        jLabel3.setText("Sexo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, -1));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/masc.png"))); // NOI18N
        getContentPane().add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 0, 250, 276));

        lblFemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/female.png"))); // NOI18N
        getContentPane().add(lblFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 230, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int anonasc = Integer.parseInt(jsAno.getValue().toString());
        int ano = 2022;
        int idade = ano - anonasc;
        lblIdade.setText(Integer.toString(idade));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
        String genero = cbSexo.getSelectedItem().toString();
        if (genero == "Feminino"){
          ImageIcon iconeF = new ImageIcon("Imagens/female.png");
          lblFemale.setVisible(true);
          lblImagem.setVisible(false);
        } else {
            ImageIcon iconeM = new ImageIcon("..Imagens/masc.png");
            lblFemale.setVisible(false);
            lblImagem.setVisible(true);
        }
        
    }//GEN-LAST:event_cbSexoActionPerformed

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
            java.util.logging.Logger.getLogger(telaidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSpinner jsAno;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblFemale;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
