/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.sql.*;
import br.com.infox.dal.ModuloConexao;

/**
 *
 * @author Leandro
 */
public class TelaPrincipalSeminario extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form TelaHomePageSeminario
     */
    public TelaPrincipalSeminario() {
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

        jDesktopPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCursos = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmCredito = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmLogin = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        JmMeuPainel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Women's Academy - Inicio");
        setMinimumSize(new java.awt.Dimension(770, 510));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/9d26d9df-06b7-4973-be7f-544906cf60d8.jpg"))); // NOI18N

        jDesktopPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 0, 153));

        jmCursos.setText("Cursos");

        jMenuItem2.setText("Meus Cursos");
        jmCursos.add(jMenuItem2);

        jMenuItem1.setText("Fazer Novo Curso");
        jmCursos.add(jMenuItem1);

        jMenuBar1.add(jmCursos);

        jmAjuda.setText("Ajuda");
        jmAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAjudaActionPerformed(evt);
            }
        });

        jmCredito.setText("Creditos");
        jmCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCreditoActionPerformed(evt);
            }
        });
        jmAjuda.add(jmCredito);

        jMenuItem6.setText("Sobre");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmAjuda.add(jMenuItem6);

        jMenuBar1.add(jmAjuda);

        jmNotas.setText("Notas");

        jMenuItem3.setText("Ver Notas");
        jmNotas.add(jMenuItem3);

        jMenuBar1.add(jmNotas);

        jmLogin.setText("Login");
        jmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLoginActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmLogin.add(jMenuItem4);

        jMenuBar1.add(jmLogin);

        JmMeuPainel.setText("Meu Painel");
        jMenuBar1.add(JmMeuPainel);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmLoginActionPerformed

    private void jmAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAjudaActionPerformed
       
    }//GEN-LAST:event_jmAjudaActionPerformed

    private void jmCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCreditoActionPerformed
        // Chamando Tela Creditos
        TelaCreditosSeminario credito = new TelaCreditosSeminario();
        credito.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jmCreditoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //Chamando Tela Sobre
        TelaSobreSeminario sobre = new TelaSobreSeminario();
        sobre.setVisible(true);       
        this.dispose();

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Sair do Usuario
        TeladeLoginSeminario login = new TeladeLoginSeminario();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSeminario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalSeminario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmMeuPainel;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenuItem jmCredito;
    private javax.swing.JMenu jmCursos;
    private javax.swing.JMenu jmLogin;
    private javax.swing.JMenu jmNotas;
    // End of variables declaration//GEN-END:variables
}