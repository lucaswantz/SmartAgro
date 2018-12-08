/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.HabilitaCampos;
import apoio.LimpaCampos;
import apoio.Mensagem;
import apoio.VerificadorCampos;
import dao.GenericDAO;
import entidade.Contapagar;
import entidade.Fornecedor;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import org.apache.log4j.Logger;
import smartagro.VerificaPermissao;

/**
 *
 * @author morganabagatini
 */
public class IfrmContasPagar extends javax.swing.JInternalFrame {

    private GenericDAO<Contapagar> dao;
    private ArrayList<Contapagar> contas;
    private Contapagar conta;
    private VerificaPermissao permissoes;
    private jtmContasPagar modelContas;

    private boolean editando = false;

    private static final Logger logger = Logger.getLogger(IfrmContasPagar.class);

    /**
     * Creates new form IfrmContasPagar
     */
    public IfrmContasPagar(int aba) {
        initComponents();

        // Abre na aba passada por parametro
        tabAbas.setSelectedIndex(aba);

        // Ajusta os botões conforme as permissões
        permissoes = new VerificaPermissao(this.getClass().getSimpleName(), this.getContentPane());
        tabAbasStateChanged(new ChangeEvent(tabAbas));

        // Preenche a tabela de consulta com as colunas corretas
        contas = new ArrayList();
        modelContas = new jtmContasPagar(contas);
        tblContas.setModel(modelContas);
        
        popularComboStatus();

        focus();
    }

    private void focus() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Seta a aba de cadastro como a selecionada
                tabAbas.setSelectedIndex(0);
                tabAbasStateChanged(new ChangeEvent(tabAbas));
                dchVencimento.requestFocusInWindow();
            }
        });
    }
    
    private void popularComboStatus() {
        cmbStatus.removeAllItems();
        cmbStatus.addItem("Selecione");

        for (Object st : new Contapagar().getTodosStatus()) {
            cmbStatus.addItem(st.toString());
        }

        cmbStatus.setSelectedIndex(0);
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
        tfdCompra = new javax.swing.JTextField();
        lblCompra = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        tfdFornecedor = new javax.swing.JTextField();
        lbCliente1 = new javax.swing.JLabel();
        dchVencimento = new com.toedter.calendar.JDateChooser();
        lblParcela = new javax.swing.JLabel();
        lblValorParcela = new javax.swing.JLabel();
        lblValorPago = new javax.swing.JLabel();
        lblDataPagto = new javax.swing.JLabel();
        dchPagto = new com.toedter.calendar.JDateChooser();
        tfdParcela = new javax.swing.JTextField();
        tfdValorPago = new apoio.MoedaFormatada();
        tfdValorParc = new apoio.MoedaFormatada();
        jLabel1 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        pnlConsulta = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jYTableScrollPane1 = new de.javasoft.swing.JYTableScrollPane();
        tblContas = new de.javasoft.swing.JYTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contas a Pagar");

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
        btnExcluir.setEnabled(false);
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

        tfdCompra.setEnabled(false);

        lblCompra.setText("Compra");

        lblFornecedor.setText("Fornecedor");

        tfdFornecedor.setEnabled(false);

        lbCliente1.setText("Data vencimento *");

        dchVencimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendar.png")));
        dchVencimento.setInheritsPopupMenu(true);

        lblParcela.setText("Parcela");

        lblValorParcela.setText("Valor da parcela");

        lblValorPago.setText("Valor pago *");

        lblDataPagto.setText("Data pagamento *");

        dchPagto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendar.png")));
        dchPagto.setInheritsPopupMenu(true);

        tfdParcela.setEnabled(false);

        tfdValorPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tfdValorParc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfdValorParc.setEnabled(false);

        jLabel1.setText("Status *");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorPago)
                    .addComponent(jLabel1)
                    .addComponent(lblValorParcela))
                .addGap(19, 19, 19)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdValorParc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 40, Short.MAX_VALUE)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataPagto)
                            .addComponent(lbCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(555, Short.MAX_VALUE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParcela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdValorParc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorParcela)
                        .addComponent(lbCliente1))
                    .addComponent(dchVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorPago)
                        .addComponent(lblDataPagto)))
                .addGap(248, 248, 248))
        );

        tabAbas.addTab("Cadastro", pnlCadastro);

        pnlConsulta.setName("pnlConsulta"); // NOI18N

        btnPesquisar.setText("Carregar Dados");
        btnPesquisar.setName("btnPesquisar"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jYTableScrollPane1.setViewportView(tblContas);

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addComponent(jYTableScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYTableScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAbas.addTab("Consulta", pnlConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAbas)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tabAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap())
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //Pega o valor da primeira coluna da linha selecionada na tabela de serviços e atribuiu a uma variável do tipo inteiro
        int id = Integer.parseInt(tblContas.getValueAt(tblContas.getSelectedRow(), 0).toString());
        //Busca um servico com o codigo/id pego anteriomente
        conta = dao.consultarPorId(id, "Contapagar");

        LimpaCampos.limparCampos(pnlCadastro);

        if (conta != null) {
            tfdCompra.setText(conta.getCompra().getId().toString());
            tfdFornecedor.setText(Fornecedor.getFornecedorToString(conta.getCompra().getFornecedor()));
            cmbStatus.setSelectedItem(Contapagar.getDescricaoStatus(conta.getStatus()));
            dchVencimento.setDate(conta.getVencimento());
            dchPagto.setDate(conta.getDatapagamento());
            tfdParcela.setText(String.valueOf(conta.getParcela()));
            tfdValorParc.setText(conta.getValordevido().toString());
            tfdValorPago.setText(conta.getValorpago().toString());

            tabAbas.setSelectedIndex(0);
            tfdCompra.requestFocus();
            editando = true;
            focus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Aplica o validador
        JComponent[] components = new JComponent[]{cmbStatus, dchVencimento, tfdValorPago, dchPagto};
        VerificadorCampos verifier = new VerificadorCampos(components);

        if (!verifier.validaCampos()) {
            return;
        }

        if (!editando) {
            Mensagem.mostraAletra("Atenção", "Nenhuma conta foi selecionada para edição");
            return;
        }
        
        if (tfdValorPago.getValue().compareTo(tfdValorParc.getValue()) == 1 || 
                tfdValorPago.getValue().compareTo(BigDecimal.ZERO) == -1) {
            Mensagem.mostraAletra("Atenção", "Valor pago informado é inválido");
            return;
        }

        this.dao = new GenericDAO();
        
        if (cmbStatus.getSelectedItem().toString().equals(Contapagar.STATUS_CANCELADA_DESCRICAO)) {
            conta.setStatus(Contapagar.getStatusPelaDescricao(cmbStatus.getSelectedItem().toString()));
        } else {
            if (tfdValorPago.getValue().compareTo(tfdValorParc.getValue()) == 0) {
                conta.setStatus(Contapagar.STATUS_PAGA);
            }
            
            if (tfdValorPago.getValue().compareTo(tfdValorParc.getValue()) == -1) {
                conta.setStatus(Contapagar.STATUS_PARCIAL);
            }
        }

        conta.setVencimento(dchVencimento.getDate());
        conta.setValorpago(tfdValorPago.getValue().setScale(2));
        conta.setDatapagamento(dchPagto.getDate());

        if (dao.atualizar(conta)) {
            Mensagem.mostraInformacao("Sucesso", "Conta atualizado com sucesso");
            LimpaCampos.limparCampos(pnlCadastro);
        } else {
            Mensagem.mostraErro("Problema", "Problema ao atualizar conta");
        }

        editando = false;

        focus();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Mensagem.mostraInformacao("Atenção", "Não é permitido excluir contas");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabAbasStateChanged
        HabilitaCampos.controlaBotoes(evt.getSource(), permissoes, btnSalvar, btnEditar, btnExcluir);
    }//GEN-LAST:event_tabAbasStateChanged

    private void tabAbasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabAbasFocusLost
        HabilitaCampos.controlaPainelCadastro(evt, editando);
    }//GEN-LAST:event_tabAbasFocusLost

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        dao = new GenericDAO();
        contas = new ArrayList();

        contas = dao.consultarTodos("Contapagar");
        tblContas.setModel(new jtmContasPagar(contas));
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbStatus;
    private com.toedter.calendar.JDateChooser dchPagto;
    private com.toedter.calendar.JDateChooser dchVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private de.javasoft.swing.JYTableScrollPane jYTableScrollPane1;
    private javax.swing.JLabel lbCliente1;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblDataPagto;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblParcela;
    private javax.swing.JLabel lblValorPago;
    private javax.swing.JLabel lblValorParcela;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JTabbedPane tabAbas;
    private de.javasoft.swing.JYTable tblContas;
    private javax.swing.JTextField tfdCompra;
    private javax.swing.JTextField tfdFornecedor;
    private javax.swing.JTextField tfdParcela;
    private apoio.MoedaFormatada tfdValorPago;
    private apoio.MoedaFormatada tfdValorParc;
    // End of variables declaration//GEN-END:variables
}
