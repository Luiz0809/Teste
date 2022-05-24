/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerLogin;
import controller.ControllerUsuarioMaquina;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelComputadores;

/**
 *
 * @author raylane
 */
public class TelaInicial extends javax.swing.JFrame {

    ControllerUsuarioMaquina usuarioMaquina = new ControllerUsuarioMaquina();

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        URL caminhoImagem = this.getClass().getClassLoader().getResource("logo-rx-monitoramento.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);

        ModelComputadores controllerSistema = new ModelComputadores();

        lblUsuarioLogado.setText(controllerSistema.getUsuario());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        lblSO = new javax.swing.JLabel();
        lblSistemaOperacional = new javax.swing.JLabel();
        lblArq = new javax.swing.JLabel();
        lblArquitetura = new javax.swing.JLabel();
        btnDisco = new javax.swing.JButton();
        btnCPU1 = new javax.swing.JButton();
        btnMemoria1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                bye(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-rx-monitoramento.png"))); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDescricao.setText("DESCRIÇÃO DA MÁQUINA");

        lblUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblUsuario.setText("Usuário logado:");

        lblUsuarioLogado.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogado.setText("...");

        lblSO.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSO.setText("Sistema Operacional:");

        lblSistemaOperacional.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblSistemaOperacional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemaOperacional.setText("...");

        lblArq.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblArq.setText("Arquitetura:");

        lblArquitetura.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblArquitetura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArquitetura.setText("...");

        btnDisco.setText("DISCO");
        btnDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscoActionPerformed(evt);
            }
        });

        btnCPU1.setText("CPU");
        btnCPU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPU1ActionPerformed(evt);
            }
        });

        btnMemoria1.setText("MEMÓRIA");
        btnMemoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoria1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSistemaOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArquitetura, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPU1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(78, 78, 78)
                        .addComponent(btnCPU1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsuarioLogado)
                        .addGap(18, 18, 18)
                        .addComponent(lblSO))
                    .addComponent(btnMemoria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSistemaOperacional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArq)
                    .addComponent(btnDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArquitetura)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(688, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscoActionPerformed
        
      
        dispose();
    }//GEN-LAST:event_btnDiscoActionPerformed

    private void btnCPU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPU1ActionPerformed
       
       
        dispose();
    }//GEN-LAST:event_btnCPU1ActionPerformed

    private void btnMemoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoria1ActionPerformed
        TelaMemoria telaMemoria = new TelaMemoria();
        telaMemoria.setLocationRelativeTo(null);
        telaMemoria.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMemoria1ActionPerformed

    private void bye(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_bye
        ControllerLogin validation = new ControllerLogin();
        try {
            if (validation.validationDataLogout()) {
                usuarioMaquina.insertUsuarioMaquinaLogout();
            }
            System.out.println("byeeeeeee");
        } catch (UnknownHostException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bye

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPU1;
    private javax.swing.JButton btnDisco;
    private javax.swing.JButton btnMemoria1;
    private javax.swing.JLabel lblArq;
    private javax.swing.JLabel lblArquitetura;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSO;
    private javax.swing.JLabel lblSistemaOperacional;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}