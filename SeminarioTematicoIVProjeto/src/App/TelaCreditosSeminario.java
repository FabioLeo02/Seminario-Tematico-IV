/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

/**
 *
 * @author Leandro
 */
public class TelaCreditosSeminario extends javax.swing.JFrame {

    /**
     * Creates new form TelaSobre
     */
    public TelaCreditosSeminario() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Women Academy - Creditos");
        setMinimumSize(new java.awt.Dimension(764, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Antonio Luciano e Georges Paiva");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 160, 250, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Projeto Seminario Tematico IV");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 390, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Women's Academy - Plataforma de Ensino para Mulheres");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 720, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desenvolvido Por: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 140, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fabio Leandro, Karla Georgina,");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 230, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jefferson Alves, Yan Breno");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 140, 210, 30);

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(20, 330, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GPLv3Logo.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 230, 110, 90);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ApacheNetBeansLogo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 230, 110, 100);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mysqllogoicon.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 240, 110, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4a3e5620-1379-4f00-8af7-c73e85adda5b.jpg"))); // NOI18N
        jLabel6.setMinimumSize(new java.awt.Dimension(780, 520));
        jLabel6.setPreferredSize(new java.awt.Dimension(780, 520));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -90, 1750, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
       TelaPrincipalSeminario principal = new TelaPrincipalSeminario();
       principal.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCreditosSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCreditosSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCreditosSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCreditosSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCreditosSeminario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbVoltar;
    // End of variables declaration//GEN-END:variables
}