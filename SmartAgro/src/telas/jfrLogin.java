/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.Criptografia;
import apoio.RSAcriptografia;
import dao.ColaboradorDAO;
import entidade.Colaborador;
import static java.awt.Color.white;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author renan
 */
public class jfrLogin extends javax.swing.JFrame {

    private static Colaborador colab;

    // Função para retornar o usuário logado
    public static Colaborador getUsuarioLogado() {
        return colab;
    }

    public static void setUsuarioLogado(Colaborador c) {
        colab = c;
    }

    /**
     * Creates new form jfrLogin
     */
    public jfrLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        getContentPane().setBackground(white);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfLogin = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jlbMsgAutenticacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartAgro | Acessar");
        setBackground(new java.awt.Color(192, 187, 182));

        jtfLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLogin.setToolTipText("Digite seu usuário");
        jtfLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfLoginMouseClicked(evt);
            }
        });

        jpfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpfSenha.setToolTipText("Digite sua senha");
        jpfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfSenhaMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbMsgAutenticacao.setForeground(java.awt.Color.red);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profle.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key.png"))); // NOI18N

        jLabel3.setText("Usuário");

        jLabel4.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMsgAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addComponent(jpfSenha)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMsgAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ColaboradorDAO dao = new ColaboradorDAO();

        colab = dao.autenticarColaborador(jtfLogin.getText(), Criptografia.criptografar(jpfSenha.getText()));

        if (colab != null) {

            if (colab.getSenhausuario().equals(Criptografia.criptografar("12345"))) {

                /* Set the Synthetica Plain look and feel */
                try {
                    javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                DlgAlterarSenhaPrimeiroAcesso dlgFP = new DlgAlterarSenhaPrimeiroAcesso(this, true, colab);
                dlgFP.setLocationRelativeTo(this);
                dlgFP.setVisible(true);
                this.dispose();

            } else {
                /* Set the Synthetica Plain look and feel */
                try {
                    javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                String verificaLicenca = RSAcriptografia.verificaLicenca();

                if (!verificaLicenca.equals("")) {
                    DlgLicenca telaLicenca = new DlgLicenca(null, true);
                    if (verificaLicenca.contains("Erro") || verificaLicenca.contains("expirada") || verificaLicenca.contains("Falha")) {
                        telaLicenca.getJlTitulobMensagem().setText("Licença expirada!");
                        telaLicenca.getJlbMensagem().setText("Selecione uma nova ou solicite outra a nossa equipe, pelo e-mail: licenca@smartagro.com");
                        telaLicenca.setVisible(true);

                    } else if (verificaLicenca.contains("Resta(m)") || verificaLicenca.contains("Último")) {
                        telaLicenca.getJlTitulobMensagem().setText("Último dia de licença!");
                        telaLicenca.getJlbMensagem().setText("Selecione uma nova ou solicite outra a nossa equipe, pelo e-mail: licenca@smartagro.com");
                        telaLicenca.setVisible(true);
                        new FrmPrincipal().setVisible(true);
                        this.dispose();
                    }

                } else {
                    new FrmPrincipal().setVisible(true);
                    this.dispose();
                }

            }
        } else {
            jlbMsgAutenticacao.setText("Usuário ou senha inválidos.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfLoginMouseClicked
        jlbMsgAutenticacao.setText("");
    }//GEN-LAST:event_jtfLoginMouseClicked

    private void jpfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfSenhaMouseClicked
        jlbMsgAutenticacao.setText("");
    }//GEN-LAST:event_jpfSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(jfrLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlbMsgAutenticacao;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
