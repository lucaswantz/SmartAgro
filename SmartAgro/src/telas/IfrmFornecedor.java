/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import org.apache.log4j.Logger;
import apoio.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dao.CidadeDAO;
import dao.GenericDAO;
import entidade.Cidade;
import entidade.Fornecedor;
import entidade.Endereco;
import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeEvent;
import smartagro.VerificaPermissao;

/**
 *
 * @author Morgana
 */
public class IfrmFornecedor extends javax.swing.JInternalFrame {

    private Fornecedor fornecedor;
    private Endereco endereco;
    private GenericDAO<Fornecedor> dao;
    private ArrayList<Fornecedor> fornecedores;
    private DlgCidades dlgCidades;
    private VerificaPermissao permissoes;
    private boolean editando = false;

    private static final Logger logger = Logger.getLogger(IfrmFornecedor.class);

    /**
     * Creates new form IfrmUnidadeMedida
     */
    public IfrmFornecedor(int aba) {
        initComponents();

        // Abre na aba passada por parametro
        tabAbas.setSelectedIndex(aba);

        // Ajusta os botões conforme as permissões
        permissoes = new VerificaPermissao(this.getClass().getSimpleName(), this.getContentPane());
        tabAbasStateChanged(new ChangeEvent(tabAbas));

        // Preenche a tabela de consulta com as colunas corretas
        fornecedores = new ArrayList();
        tblFornecedores.setModel(new jtmFornecedor(fornecedores));

        // Janela cidades
        dlgCidades = new DlgCidades(null, true);

        //Deixar o focus no campo de descrição
        focus();
    }

    private void focus() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Seta a aba de cadastro como a selecionada
                tabAbas.setSelectedIndex(0);
                tabAbasStateChanged(new ChangeEvent(tabAbas));
                rbtJuridica.requestFocusInWindow();
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

        btgPessoa = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tabAbas = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        rbtFisica = new javax.swing.JRadioButton();
        rbtJuridica = new javax.swing.JRadioButton();
        pnlGeral = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        tfdRazaoSocial = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        ffdCNPJ = new javax.swing.JFormattedTextField();
        pnlEndereco = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfdLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfdNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfdBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfdCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfdComplemento = new javax.swing.JTextField();
        btnZoom = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ffdCEP = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfdCriterio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Fornecedores");

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

        btgPessoa.add(rbtFisica);
        rbtFisica.setText("Pessoa Física");
        rbtFisica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtFisicaItemStateChanged(evt);
            }
        });

        btgPessoa.add(rbtJuridica);
        rbtJuridica.setText("Pessoa Jurídica");
        rbtJuridica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtJuridicaItemStateChanged(evt);
            }
        });

        pnlGeral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados gerais", 0, 0, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblNome.setText("Nome *");

        jLabel2.setText("Razão social");

        jLabel25.setText("Código");

        tfdCodigo.setEditable(false);
        tfdCodigo.setFocusable(false);

        lblNome1.setText("CPF/CNPJ");

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(jLabel2)
                    .addComponent(jLabel25)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdNome)
                    .addComponent(tfdRazaoSocial)
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ffdCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(ffdCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", 0, 0, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel10.setText("Logradouro *");

        jLabel11.setText("Número");

        jLabel12.setText("Bairro *");

        jLabel13.setText("Cidade *");

        tfdCidade.setEditable(false);

        jLabel14.setText("Complemento");

        btnZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btnZoom.setToolTipText("Pesquisar");
        btnZoom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomActionPerformed(evt);
            }
        });

        jLabel15.setText("CEP *");

        try {
            ffdCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffdCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ffdCEPFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(46, 46, 46)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdLogradouro))
                .addGap(21, 21, 21))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ffdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfdLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfdComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(btnZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setText("Tipo *");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtJuridica)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFisica)
                    .addComponent(rbtJuridica)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabAbas.addTab("Cadastro", pnlCadastro);

        pnlConsulta.setName("pnlConsulta"); // NOI18N

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblFornecedores);

        jLabel1.setText("Nome:");

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCriterio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
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
                .addComponent(tabAbas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 0).toString());
        this.fornecedor = dao.consultarPorId(id, "Fornecedor");

        LimpaCampos.limparCampos(pnlGeral);
        LimpaCampos.limparCampos(pnlEndereco);

        // Pega os dados se existir objeto
        if (this.fornecedor != null) {
            this.endereco = this.fornecedor.getEndereco();

            if (this.fornecedor.getCnpj() != null) {
                rbtJuridica.setSelected(true);
                ffdCNPJ.setText(this.fornecedor.getCnpj());
            } else {
                rbtFisica.setSelected(true);
                ffdCNPJ.setText(this.fornecedor.getCpf());
            }
            tfdCodigo.setText(String.valueOf(this.fornecedor.getId()));
            tfdNome.setText(this.fornecedor.getNome());
            tfdRazaoSocial.setText(this.fornecedor.getRazaosocial());
            tfdLogradouro.setText(this.fornecedor.getEndereco().getRua());
            tfdNumero.setText(this.fornecedor.getEndereco().getNumero());
            tfdBairro.setText(this.fornecedor.getEndereco().getBairro());
            tfdComplemento.setText(this.fornecedor.getEndereco().getComplemento());
            tfdCidade.setText(this.fornecedor.getEndereco().getCidade().getNome() + " - " + this.fornecedor.getEndereco().getCidade().getEstado().getSigla());
            ffdCEP.setText(this.fornecedor.getEndereco().getCep());
            tabAbas.setSelectedIndex(0);
            setEditando(true);
            focus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private boolean validaCampos() {
        ArrayList<JComponent> components = new ArrayList();

        // Verifica se um radio foi selecionado, se não foi valida os dois
        if (btgPessoa.getSelection() == null) {
            components.add(rbtFisica);
            components.add(rbtJuridica);
        } else {
            ColoreCampos.pintarCampo(rbtFisica, false);
            ColoreCampos.pintarCampo(rbtJuridica, false);
        }

        components.add(tfdNome);
        components.add(tfdLogradouro);
        components.add(tfdBairro);
        components.add(tfdCidade);
        components.add(ffdCEP);

        JComponent[] simpleArray = new JComponent[components.size()];
        components.toArray(simpleArray);
        VerificadorCampos verifier = new VerificadorCampos(simpleArray);

        if (!verifier.validaCampos()) {
            return false;
        }

        if (rbtFisica.isSelected()) {
            if (!Validacao.validarCPF(Formatacao.removerFormatacao(ffdCNPJ.getText()))) {
                Mensagem.mostraAletra("Atenção", "CPF inválido");
                ffdCNPJ.requestFocus();
                return false;
            }
        } else {
            if (!Validacao.validarCNPJ(Formatacao.removerFormatacao(ffdCNPJ.getText()))) {
                Mensagem.mostraAletra("Atenção", "CNPJ inválido");
                ffdCNPJ.requestFocus();
                return false;
            }
        }

        return true;
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (!validaCampos()) {
            return;
        }

        this.dao = new GenericDAO();

        if (!editando) {
            fornecedor = new Fornecedor();
            endereco = new Endereco();
        }

        endereco.setRua(tfdLogradouro.getText());
        endereco.setNumero(tfdNumero.getText());
        endereco.setBairro(tfdBairro.getText());
        endereco.setComplemento(tfdComplemento.getText());
        endereco.setCep(ffdCEP.getText());

        if (dlgCidades.getCidade() != null) {
            endereco.setCidade(dlgCidades.getCidade());
        }

        fornecedor.setEndereco(endereco);
        fornecedor.setNome(tfdNome.getText());
        fornecedor.setRazaosocial(tfdRazaoSocial.getText());

        if (rbtFisica.isSelected()) {
            fornecedor.setCpf(ffdCNPJ.getText());
        } else {
            fornecedor.setCnpj(ffdCNPJ.getText());
        }

        if (editando) {
            try {
                if (!new GenericDAO<>().atualizar(endereco)) {
                    throw new Exception("Erro ao atualizar endereco - fornecedor");
                }

                if (!dao.atualizar(fornecedor)) {
                    throw new Exception("Erro ao atualizar fornecedor");
                }

                Mensagem.mostraInformacao("Sucesso", "Fornecedor " + fornecedor.getNome() + " atualizado com sucesso");

                LimpaCampos.limparCampos(pnlGeral);
                LimpaCampos.limparCampos(pnlEndereco);
                btgPessoa.clearSelection();

                btgPessoa.clearSelection();
            } catch (Exception e) {
                Mensagem.mostraErro("Problema", "Problema ao atualizar fornecedor");
                logger.error("Erro ao atualizar tabelas", e);
            }

            setEditando(false);

        } else {

            try {
                if (!new GenericDAO<>().salvar(endereco)) {
                    throw new Exception("Erro ao salvar endereco - fornecedor");
                }

                if (!dao.salvar(fornecedor)) {
                    throw new Exception("Erro ao salvar fornecedor");
                }

                Mensagem.mostraInformacao("Sucesso", "Fornecedor " + fornecedor.getNome() + " inserido com sucesso");

                LimpaCampos.limparCampos(pnlGeral);
                LimpaCampos.limparCampos(pnlEndereco);
                btgPessoa.clearSelection();

            } catch (Exception e) {
                Mensagem.mostraErro("Problema", "Problema para inserir fornecedor");
                logger.error("Erro ao salvar tabelas", e);
            }
        }

        focus();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 0).toString());

        this.fornecedor = dao.consultarPorId(id, "Fornecedor");
        this.endereco = this.fornecedor.getEndereco();

        //Abre uma mensagem pedindo se o usuário realmente quer excluír o registro
        boolean resposta = Mensagem.confirmaMensagem("Atenção", "Deseja realmente excluir o fornecedor: " + this.fornecedor.getNome() + "?");

        if (resposta) {
            // Exclui o registro
            if (dao.deletar(fornecedor)) {
                Mensagem.mostraInformacao("Confirmação de exclusão", "Fornecedor excluído");

                this.fornecedores = dao.consultarComCriterio("Fornecedor", "nome", tfdCriterio.getText());
                this.tblFornecedores.setModel(new jtmFornecedor(this.fornecedores));
            } else {
                Mensagem.mostraErro("Problema", "Problema para excluir fornecedor. Verifique se ele não está vinculado a uma compra.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.dao = new GenericDAO<>();
        this.fornecedores = new ArrayList();

        this.fornecedores = dao.consultarComCriterio("Fornecedor", "nome", tfdCriterio.getText());
        tblFornecedores.setModel(new jtmFornecedor(fornecedores));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomActionPerformed
        dlgCidades.setVisible(true);
        if (dlgCidades.seleciou() && dlgCidades.getCidade() != null) {
            String cidade = dlgCidades.getCidade().getNome() + " - " + dlgCidades.getCidade().getEstado().getSigla();
            tfdCidade.setText(cidade);
        }
    }//GEN-LAST:event_btnZoomActionPerformed

    private void rbtFisicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtFisicaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (rbtFisica.isSelected()) {
                Formatacao.reformatarCpf(ffdCNPJ);
            }
        }
    }//GEN-LAST:event_rbtFisicaItemStateChanged

    private void rbtJuridicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtJuridicaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (rbtJuridica.isSelected()) {
                Formatacao.reformatarCnpj(ffdCNPJ);
            }
        }
    }//GEN-LAST:event_rbtJuridicaItemStateChanged

    private void tabAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabAbasStateChanged
        HabilitaCampos.controlaBotoes(evt.getSource(), permissoes, btnSalvar, btnEditar, btnExcluir);
    }//GEN-LAST:event_tabAbasStateChanged

    private void tabAbasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabAbasFocusLost
        HabilitaCampos.controlaPainelCadastro(evt, editando);
    }//GEN-LAST:event_tabAbasFocusLost

    private void ffdCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ffdCEPFocusLost
        if (!ffdCEP.getText().trim().isEmpty() || ffdCEP.getText() != null) {

            ClientCepWS clientCep = new ClientCepWS(ffdCEP.getText());

            try {
                String json = clientCep.get();

                if (!json.contains("{  \"erro\": true}")) { //verifica se web-service não retornou erro, ou seja: CEP inválido
                    Gson g = new Gson();

                    EnderecoWebService enderecoWEB = new EnderecoWebService();

                    java.lang.reflect.Type endType = new TypeToken<EnderecoWebService>() {
                    }.getType();

                    enderecoWEB = g.fromJson(json, endType);

                    tfdBairro.setText(enderecoWEB.getBairro());
                    tfdComplemento.setText(enderecoWEB.getComplemento());
                    tfdCidade.setText(enderecoWEB.getLocalidade() + " - " + enderecoWEB.getUf());
                    tfdLogradouro.setText(enderecoWEB.getLogradouro());

                    Cidade cid = new CidadeDAO().consultarPorCidadeUF(enderecoWEB.getLocalidade(), enderecoWEB.getUf());

                    if (cid == null) {
                        Mensagem.mostraErro("Ops!", "Não foi possível selecionar a cidade do cliente, tente novamente por favor.");
                    } else {
                        dlgCidades.setCidadeSelecionada(cid);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_ffdCEPFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgPessoa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnZoom;
    private javax.swing.JFormattedTextField ffdCEP;
    private javax.swing.JFormattedTextField ffdCNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JRadioButton rbtFisica;
    private javax.swing.JRadioButton rbtJuridica;
    private javax.swing.JTabbedPane tabAbas;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField tfdBairro;
    private javax.swing.JTextField tfdCidade;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdComplemento;
    private javax.swing.JTextField tfdCriterio;
    private javax.swing.JTextField tfdLogradouro;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdNumero;
    private javax.swing.JTextField tfdRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
