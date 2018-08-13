package telas;

import apoio.Formatacao;
import apoio.LimpaCampos;
import apoio.Mensagem;
import dao.GenericDAO;
import entidade.Produto;
import entidade.Unidademedida;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class IfrmProduto extends javax.swing.JInternalFrame {

    private Produto p;
    private GenericDAO<Produto> dao;
    private GenericDAO<Unidademedida> udao;
    private ArrayList<Produto> produtos;
    private boolean editando = false;
    private ArrayList<Unidademedida> unidades;
    private Unidademedida unidade;

    public IfrmProduto(int aba) {
        initComponents();

        // Abre na aba passada por parametro
        tabAbas.setSelectedIndex(aba);

        //Definindo como falso a variavel que verifica se um produto está sendo editado
        editando = false;

        //Enchendo combo de unidades de medida
        this.unidades = new ArrayList();
        udao = new GenericDAO<>();
        this.unidades = udao.consultarTodos("Unidademedida");
        jComboUnidadeMedida.setModel(new UnidadesMedidasComboModel(this.unidades));
 
        
        focus();
    }

    private void focus() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                tfdDescricao.requestFocusInWindow();
            }
        });
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
        btnNovo = new javax.swing.JButton();
        tabAbas = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        pnlIdentificacao = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        tfdDescricao = new javax.swing.JTextField();
        lblCodigoBarras = new javax.swing.JLabel();
        tfdCodigoBarras = new javax.swing.JTextField();
        pnlValoresEstoque = new javax.swing.JPanel();
        lblValorCompra = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        lblValorVenda1 = new javax.swing.JLabel();
        tfdQuantidadeEstoque = new javax.swing.JTextField();
        lblUnidadeMedida = new javax.swing.JLabel();
        jComboUnidadeMedida = new javax.swing.JComboBox();
        moedaFormatadaValorCompra = new apoio.MoedaFormatada();
        moedaFormatadaValorVenda = new apoio.MoedaFormatada();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLbDescricaoConsulta = new javax.swing.JLabel();
        tfdCriterio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        pnlIdentificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblDescricao.setText("Descrição *");

        lblCodigoBarras.setText("Código de Barras:");

        javax.swing.GroupLayout pnlIdentificacaoLayout = new javax.swing.GroupLayout(pnlIdentificacao);
        pnlIdentificacao.setLayout(pnlIdentificacaoLayout);
        pnlIdentificacaoLayout.setHorizontalGroup(
            pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificacaoLayout.createSequentialGroup()
                .addGroup(pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 559, Short.MAX_VALUE))
        );
        pnlIdentificacaoLayout.setVerticalGroup(
            pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(18, 18, 18)
                .addGroup(pnlIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoBarras)
                    .addComponent(tfdCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlValoresEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores e Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblValorCompra.setText("Valor compra  *");

        lblValorVenda.setText("Valor venda * ");

        lblValorVenda1.setText("Quantidade estoque *");

        lblUnidadeMedida.setText("Unidade de Medida *");

        // Code adding the component to the parent container - not shown here

        moedaFormatadaValorCompra.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        moedaFormatadaValorVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pnlValoresEstoqueLayout = new javax.swing.GroupLayout(pnlValoresEstoque);
        pnlValoresEstoque.setLayout(pnlValoresEstoqueLayout);
        pnlValoresEstoqueLayout.setHorizontalGroup(
            pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                .addComponent(lblUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblValorVenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                .addGroup(pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                        .addComponent(lblValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moedaFormatadaValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                        .addComponent(lblValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moedaFormatadaValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlValoresEstoqueLayout.setVerticalGroup(
            pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorCompra)
                    .addComponent(moedaFormatadaValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorVenda)
                    .addComponent(moedaFormatadaValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(lblUnidadeMedida)
                        .addGap(59, 59, 59))
                    .addGroup(pnlValoresEstoqueLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlValoresEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorVenda1)
                            .addComponent(tfdQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlValoresEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlValoresEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAbas.addTab("Cadastro", pnlCadastro);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor Compra", "Valor Venda", "Unidade de Medida", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProdutos);

        jLbDescricaoConsulta.setText("Descrição:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(jLbDescricaoConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdCriterio, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)
                        .addContainerGap())))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDescricaoConsulta)
                    .addComponent(tfdCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
        );

        tabAbas.addTab("Consulta", pnlConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tabAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString());

        this.p = dao.consultarPorId(id, "Produto");

        if (p.getAtivo()) {
            //Abre uma mensagem pedindo se o usuário realmente quer excluír o registro
            boolean resposta = Mensagem.confirmaMensagem("Atenção", "Deseja realmente excluir o produto: " + this.p.getDescricao() + "?");

            if (resposta) {
                this.p.setAtivo(false);

                // Exclui o registro
                if (dao.atualizar(p)) {
                    Mensagem.mostraInformacao("Confirmação de exclusão", "Produto excluído");

                    this.produtos = dao.consultarComCriterio("Produto", "descricao", tfdCriterio.getText());
                    this.tblProdutos.setModel(new jtmProduto(this.produtos));
                }
            }
        } else {
            Mensagem.mostraErro("Problema", "Problema para excluir produto");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        this.dao = new GenericDAO<>();
       

        if (editando) {
            
            p.setDescricao(tfdDescricao.getText());
            p.setCodigobarras(tfdCodigoBarras.getText());
            p.setAtivo(true);
            p.setValorcompra(moedaFormatadaValorCompra.getValue());
            p.setValorvenda(moedaFormatadaValorVenda.getValue());
            p.setQuantidadeestoque(new BigDecimal(tfdQuantidadeEstoque.getText()));
            p.setUnidademedida((Unidademedida) jComboUnidadeMedida.getSelectedItem());
            
            if (dao.atualizar(p)) {
                Mensagem.mostraInformacao("Sucesso", "Produto " + this.p.getDescricao() + " atualizado com sucesso");
                 LimpaCampos.limparCampos(pnlIdentificacao);
                LimpaCampos.limparCampos(pnlValoresEstoque);
            } else {
                Mensagem.mostraInformacao("Problema", "Problema ao atualizar produto");
            }
            editando = false;
            
        } else {
            
            this.p = new Produto();
            
            p.setDescricao(tfdDescricao.getText());
            p.setCodigobarras(tfdCodigoBarras.getText());
            p.setAtivo(true);
            p.setValorcompra(moedaFormatadaValorCompra.getValue());
            p.setValorvenda(moedaFormatadaValorVenda.getValue());
            p.setQuantidadeestoque(new BigDecimal(tfdQuantidadeEstoque.getText()));
            p.setUnidademedida((Unidademedida) jComboUnidadeMedida.getSelectedItem());
            
            if (dao.salvar(p)) {
                Mensagem.mostraInformacao("Sucesso", "Produto " + p.getDescricao() + " inserido com sucesso");
                 LimpaCampos.limparCampos(pnlIdentificacao);
                 LimpaCampos.limparCampos(pnlValoresEstoque);
            } else {
                Mensagem.mostraInformacao("Problema", "Problema para inserir produto");
            }
        }

       
        focus();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Pega o código do registro para consultar o objeto
        int id = Integer.parseInt(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString());
        this.p = dao.consultarPorId(id, "Produto");

        //Se o objeto buscado no método do ServidoDao for diferente de null
        if (this.p != null) {
            tfdDescricao.setText(this.p.getDescricao());
            tfdCodigoBarras.setText(this.p.getCodigobarras());
            tfdQuantidadeEstoque.setText(this.p.getQuantidadeestoque() + "");
            moedaFormatadaValorCompra.setText(this.p.getValorcompra() + "");
            moedaFormatadaValorVenda.setText((this.p.getValorvenda() + ""));
            jComboUnidadeMedida.setSelectedItem(this.p.getUnidademedida());
            tabAbas.setSelectedIndex(0);
            editando = true;
            focus();
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.dao = new GenericDAO<>();
        this.unidades = new ArrayList();

        this.produtos = dao.consultarComCriterio("Produto", "descricao", tfdCriterio.getText());
        tblProdutos.setModel(new jtmProduto(produtos));
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox jComboUnidadeMedida;
    private javax.swing.JLabel jLbDescricaoConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigoBarras;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblUnidadeMedida;
    private javax.swing.JLabel lblValorCompra;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JLabel lblValorVenda1;
    private apoio.MoedaFormatada moedaFormatadaValorCompra;
    private apoio.MoedaFormatada moedaFormatadaValorVenda;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlIdentificacao;
    private javax.swing.JPanel pnlValoresEstoque;
    private javax.swing.JTabbedPane tabAbas;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField tfdCodigoBarras;
    private javax.swing.JTextField tfdCriterio;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JTextField tfdQuantidadeEstoque;
    // End of variables declaration//GEN-END:variables
}
