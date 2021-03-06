/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.*;
import dao.GenericDAO;
import entidade.Unidademedida;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import smartagro.VerificaPermissao;

/**
 *
 * @author Morgana
 */
public class IfrmUnidadeMedida extends javax.swing.JInternalFrame {

    private Unidademedida unidade;
    private GenericDAO<Unidademedida> dao;
    private ArrayList<Unidademedida> unidades;
    private VerificaPermissao permissoes;
    private boolean editando = false;

    /**
     * Creates new form IfrmUnidadeMedida
     */
    public IfrmUnidadeMedida() {
        initComponents();
        
        // Ajusta os botões conforme as permissões
        permissoes = new VerificaPermissao(this.getClass().getSimpleName(), this.getContentPane());
        tabAbasStateChanged(new ChangeEvent(tabAbas));

        // Preenche a tabela de consulta com as colunas corretas
        unidades = new ArrayList();
        tblUnidades.setModel(new jtmUnidadeMedida(unidades));

        //Deixar o focus no campo de descrição
        focus();
    }

    private void focus() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Seta a aba de cadastro como a selecionada
                tabAbas.setSelectedIndex(0);
                tabAbasStateChanged(new ChangeEvent(tabAbas));
                tfdUnidade.requestFocusInWindow();
            }
        });
    }
    
    private void setEditando(boolean editando) {
        this.editando = editando;

        HabilitaCampos.controlaBotaoSalvar(editando, btnSalvar, permissoes);
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
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tabAbas = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        tfdUnidade = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        tfdDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUnidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfdCriterio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Unidades de Medida");

        btnEditar.setText("Editar");
        btnEditar.setName("btnEditar"); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabAbas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabAbasStateChanged(evt);
            }
        });
        tabAbas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabAbasFocusLost(evt);
            }
        });

        pnlCadastro.setName("pnlCadastro"); // NOI18N

        lblUnidade.setText("Unidade *");

        lblDescricao.setText("Descrição *");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidade)
                    .addComponent(tfdUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabAbas.addTab("Cadastro", pnlCadastro);

        pnlConsulta.setName("pnlConsulta"); // NOI18N

        tblUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblUnidades);

        jLabel1.setText("Descrição:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setName("btnPesquisar"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCriterio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(14, 14, 14))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );

        tabAbas.addTab("Consulta", pnlConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap())
            .addComponent(tabAbas)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tabAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblUnidades.getValueAt(tblUnidades.getSelectedRow(), 0).toString());

        unidade = dao.consultarPorId(id, "Unidademedida");

        LimpaCampos.limparCampos(pnlCadastro);

        //Se o objeto buscado no método do ServidoDao for diferente de null
        if (unidade != null) {
            tfdUnidade.setText(unidade.getUnidade());
            tfdDescricao.setText(unidade.getDescricao());
            tabAbas.setSelectedIndex(0);
            setEditando(true);
            focus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Aplica o validador
        JComponent[] components = new JComponent[]{tfdUnidade, tfdDescricao};
        VerificadorCampos verifier = new VerificadorCampos(components);
        if (!verifier.validaCampos()) {
            return;
        }

        this.dao = new GenericDAO();

        if (editando) {
            unidade.setDescricao(tfdDescricao.getText());
            unidade.setUnidade(tfdUnidade.getText());
            if (dao.atualizar(unidade)) {
                Mensagem.mostraInformacao("Sucesso", "Unidade de medida " + unidade.getDescricao() + " atualizada com sucesso");
                LimpaCampos.limparCampos(pnlCadastro);
            } else {
                Mensagem.mostraErro("Problema", "Problema ao atualizar unidade de medida");
            }
            
            setEditando(false);
            
        } else {
            unidade = new Unidademedida();
            unidade.setUnidade(tfdUnidade.getText());
            unidade.setDescricao(tfdDescricao.getText());

            if (dao.salvar(unidade)) {
                Mensagem.mostraInformacao("Sucesso", "Unidade de medida " + unidade.getDescricao() + " inserida com sucesso");
                LimpaCampos.limparCampos(pnlCadastro);
            } else {
                Mensagem.mostraErro("Problema", "Problema para inserir unidade de medida");
            }
        }

        focus();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblUnidades.getValueAt(tblUnidades.getSelectedRow(), 0).toString());
        unidade = dao.consultarPorId(id, "Unidademedida");
        //Abre uma mensagem pedindo se o usuário realmente quer excluír o registro
        boolean resposta = Mensagem.confirmaMensagem("Atenção", "Deseja realmente excluir a unidade de medida: " + unidade.getUnidade() + "?");
        if (resposta) {
            // Exclui o registro
            if (dao.deletar(unidade)) {
                Mensagem.mostraInformacao("Confirmação de exclusão", "Unidade excluída");
                this.unidades = dao.consultarComCriterio("Unidademedida", "descricao", tfdCriterio.getText());
                this.tblUnidades.setModel(new jtmUnidadeMedida(unidades));
            } else {
                Mensagem.mostraErro("Problema", "Problema para excluir unidade de medida. Verifique se ela não está vinculada a algum produto");
            }

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.dao = new GenericDAO<>();
        this.unidades = new ArrayList();
        this.unidades = dao.consultarComCriterio("Unidademedida", "descricao", tfdCriterio.getText());
        tblUnidades.setModel(new jtmUnidadeMedida(unidades));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabAbasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabAbasFocusLost
        HabilitaCampos.controlaPainelCadastro(evt, editando);
    }//GEN-LAST:event_tabAbasFocusLost

    private void tabAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabAbasStateChanged
        HabilitaCampos.controlaBotoes(evt.getSource(), permissoes, btnSalvar, btnEditar, btnExcluir);
    }//GEN-LAST:event_tabAbasStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JTabbedPane tabAbas;
    private javax.swing.JTable tblUnidades;
    private javax.swing.JTextField tfdCriterio;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JTextField tfdUnidade;
    // End of variables declaration//GEN-END:variables
}
