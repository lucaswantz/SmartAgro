/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.Criptografia;
import apoio.Formatacao;
import apoio.LimitaNroCaracteres;
import dao.ColaboradorDAO;
import entidade.Colaborador;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author rlkist
 */
public class DlgAlterarSenhaPrimeiroAcesso extends javax.swing.JDialog {

    private Colaborador colab;
    private ColaboradorDAO dao;

    public DlgAlterarSenhaPrimeiroAcesso(java.awt.Frame parent, boolean modal, Colaborador colab) {
        super(parent, modal);
        this.colab = colab;
        dao = new ColaboradorDAO();
        
        initComponents();
        
        jpsSenhaConfirmada.setDocument(new LimitaNroCaracteres(15));
        jpfSenha.setDocument(new LimitaNroCaracteres(15));
 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jpsSenhaConfirmada = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jlbMsnConfirma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SmartAgro | Primeiro Acesso");
        setResizable(false);

        jToggleButton1.setText("Salvar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText(" Senha *");

        jpfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfSenhaMouseClicked(evt);
            }
        });

        jLabel2.setText("Confirme a senha *");

        jpsSenhaConfirmada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpsSenhaConfirmadaMouseClicked(evt);
            }
        });

        jLabel3.setText("Primeiro acesso ao sistema, escolha uma senha:");

        jlbMsnConfirma.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jlbMsnConfirma.setForeground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 16));
        jLabel4.setText("* A senha precisa conter no mínimo 6 caracteres e no máximo 15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMsnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jpsSenhaConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpsSenhaConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMsnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if (validaCampos()) {

            if (Arrays.equals(jpfSenha.getPassword(), jpsSenhaConfirmada.getPassword())) {

                String senhaCampo = String.copyValueOf(jpfSenha.getPassword());

                if (senhaCampo.trim().length() < 6) {
                    jlbMsnConfirma.setText("Senha precisa ter mais que 6 caracteres.");

                } else if (dao.consultarSenha(colab.getUsuario(), senhaCampo)) {

                    jlbMsnConfirma.setText("Senha não pode ser igual a anterior.");
                } else {
                    colab.setSenhausuario(Criptografia.criptografar(senhaCampo.trim()));

                    if (dao.atualizar(colab)) {

                        JOptionPane.showMessageDialog(rootPane, "Senha do usuário " + colab.getUsuario() + " atualizada com sucesso.", "Confirmação de edição", JOptionPane.PLAIN_MESSAGE);

                        new FrmPrincipal(colab).setVisible(true);

                        this.dispose();

                    }
                }

            } else {
                jlbMsnConfirma.setText("Senhas não podem ser diferentes.");
            }
        } else {
            jlbMsnConfirma.setText("Preencha os campos.");
        }
        /*if(senhaCampo.equals(colab.getSenhaUsuario())){
             jlbMsnConfirma.setText("Senha não pode ser igual a anterior.");   
             } */


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jpfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfSenhaMouseClicked
        jlbMsnConfirma.setText("");
    }//GEN-LAST:event_jpfSenhaMouseClicked
    public boolean validaCampos() {
        if (jpfSenha.getText().isEmpty() || jpsSenhaConfirmada.getText().isEmpty()) {

            return false;

        }
        return true;
    }
    private void jpsSenhaConfirmadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsSenhaConfirmadaMouseClicked
        jlbMsnConfirma.setText("");
    }//GEN-LAST:event_jpsSenhaConfirmadaMouseClicked

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
            java.util.logging.Logger.getLogger(DlgAlterarSenhaPrimeiroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgAlterarSenhaPrimeiroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgAlterarSenhaPrimeiroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgAlterarSenhaPrimeiroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlbMsnConfirma;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JPasswordField jpsSenhaConfirmada;
    // End of variables declaration//GEN-END:variables
}