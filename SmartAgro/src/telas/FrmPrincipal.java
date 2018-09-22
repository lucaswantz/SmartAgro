/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.Mensagem;
import dao.GenericDAO;
import entidade.Config;

/**
 *
 * @author Morgana
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    
    
    private static Config parametros; 
    private GenericDAO<Config> dao;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        dao = new GenericDAO(); 
        parametros = new Config();
        parametros = dao.consultarPorId(1, "Config");
        /* Abrir a tela maximizada */
        //setExtendedState(MAXIMIZED_BOTH);

        /* Define o icone da aplicação */
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/stack.png")));
    }

    public static Config getParametros() {
        return parametros;
    }

    public static void setParametros(Config parametros) {
        parametros = parametros;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskArea = new javax.swing.JDesktopPane();
        barMenu = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        itmCadastroCliente = new javax.swing.JMenuItem();
        itmConsultaCliente = new javax.swing.JMenuItem();
        itmRelatorioCliente = new javax.swing.JMenuItem();
        mnuProduto = new javax.swing.JMenu();
        itmCadastroProduto = new javax.swing.JMenuItem();
        itmConsultaProduto = new javax.swing.JMenuItem();
        itmRelatorioProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmUnidadeMedida = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenu();
        itmCadastroVenda = new javax.swing.JMenuItem();
        itmConsultaVenda = new javax.swing.JMenuItem();
        itmRelatorioVenda = new javax.swing.JMenuItem();
        mnuFornecedor = new javax.swing.JMenu();
        itmCadastroFornecedor = new javax.swing.JMenuItem();
        itmConsultaFornecedor = new javax.swing.JMenuItem();
        itmRelatorioFornecedor = new javax.swing.JMenuItem();
        mnuCompras = new javax.swing.JMenu();
        itmCadastroCompra = new javax.swing.JMenuItem();
        itmConsultaCompra = new javax.swing.JMenuItem();
        itmRelatorioCompra = new javax.swing.JMenuItem();
        mnuFinanceiro = new javax.swing.JMenu();
        itmContasReceber = new javax.swing.JMenuItem();
        itmContasPagar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmFormasPagamento = new javax.swing.JMenuItem();
        mnuColaborador = new javax.swing.JMenu();
        itmCadastroColaborador = new javax.swing.JMenuItem();
        itmConsultaColaborador = new javax.swing.JMenuItem();
        itmRelatorioColaborador = new javax.swing.JMenuItem();
        mnuSistema = new javax.swing.JMenu();
        itmSair = new javax.swing.JMenuItem();
        itmParametros = new javax.swing.JMenuItem();
        itmPermissoes = new javax.swing.JMenuItem();
        itmSair1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartAgro");
        setSize(new java.awt.Dimension(0, 0));

        dskArea.setPreferredSize(new java.awt.Dimension(900, 900));

        javax.swing.GroupLayout dskAreaLayout = new javax.swing.GroupLayout(dskArea);
        dskArea.setLayout(dskAreaLayout);
        dskAreaLayout.setHorizontalGroup(
            dskAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        dskAreaLayout.setVerticalGroup(
            dskAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        barMenu.setAutoscrolls(true);
        barMenu.setPreferredSize(new java.awt.Dimension(315, 40));

        mnuCliente.setMnemonic('C');
        mnuCliente.setText("Clientes");

        itmCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroCliente.setText("Cadastro");
        itmCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(itmCadastroCliente);

        itmConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaCliente.setText("Consulta");
        itmConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(itmConsultaCliente);

        itmRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioCliente.setText("Relatório");
        itmRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(itmRelatorioCliente);

        barMenu.add(mnuCliente);

        mnuProduto.setMnemonic('P');
        mnuProduto.setText("Produtos");

        itmCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroProduto.setText("Cadastro");
        itmCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(itmCadastroProduto);

        itmConsultaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaProduto.setText("Consulta");
        itmConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(itmConsultaProduto);

        itmRelatorioProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioProduto.setText("Relatório");
        itmRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(itmRelatorioProduto);
        mnuProduto.add(jSeparator1);

        itmUnidadeMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compass.png"))); // NOI18N
        itmUnidadeMedida.setText("Unidades de Medida");
        itmUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUnidadeMedidaActionPerformed(evt);
            }
        });
        mnuProduto.add(itmUnidadeMedida);

        barMenu.add(mnuProduto);

        mnuVendas.setMnemonic('V');
        mnuVendas.setText("Vendas");

        itmCadastroVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroVenda.setText("Cadastro");
        itmCadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroVendaActionPerformed(evt);
            }
        });
        mnuVendas.add(itmCadastroVenda);

        itmConsultaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaVenda.setText("Consulta");
        itmConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaVendaActionPerformed(evt);
            }
        });
        mnuVendas.add(itmConsultaVenda);

        itmRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioVenda.setText("Relatório");
        itmRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioVendaActionPerformed(evt);
            }
        });
        mnuVendas.add(itmRelatorioVenda);

        barMenu.add(mnuVendas);

        mnuFornecedor.setMnemonic('F');
        mnuFornecedor.setText("Fornecedores");

        itmCadastroFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroFornecedor.setText("Cadastro");
        itmCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroFornecedorActionPerformed(evt);
            }
        });
        mnuFornecedor.add(itmCadastroFornecedor);

        itmConsultaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaFornecedor.setText("Consulta");
        itmConsultaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaFornecedorActionPerformed(evt);
            }
        });
        mnuFornecedor.add(itmConsultaFornecedor);

        itmRelatorioFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioFornecedor.setText("Relatório");
        itmRelatorioFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioFornecedorActionPerformed(evt);
            }
        });
        mnuFornecedor.add(itmRelatorioFornecedor);

        barMenu.add(mnuFornecedor);

        mnuCompras.setMnemonic('M');
        mnuCompras.setText("Compras");

        itmCadastroCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroCompra.setText("Cadastro");
        itmCadastroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroCompraActionPerformed(evt);
            }
        });
        mnuCompras.add(itmCadastroCompra);

        itmConsultaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaCompra.setText("Consulta");
        itmConsultaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaCompraActionPerformed(evt);
            }
        });
        mnuCompras.add(itmConsultaCompra);

        itmRelatorioCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioCompra.setText("Relatório");
        itmRelatorioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioCompraActionPerformed(evt);
            }
        });
        mnuCompras.add(itmRelatorioCompra);

        barMenu.add(mnuCompras);

        mnuFinanceiro.setMnemonic('F');
        mnuFinanceiro.setText("Financeiro");

        itmContasReceber.setText("Contas a Receber");
        mnuFinanceiro.add(itmContasReceber);

        itmContasPagar.setText("Contas a Pagar");
        mnuFinanceiro.add(itmContasPagar);
        mnuFinanceiro.add(jSeparator2);

        itmFormasPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        itmFormasPagamento.setText("Formas de Pagamento");
        itmFormasPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFormasPagamentoActionPerformed(evt);
            }
        });
        mnuFinanceiro.add(itmFormasPagamento);

        barMenu.add(mnuFinanceiro);

        mnuColaborador.setText("Colaboradores");

        itmCadastroColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmCadastroColaborador.setText("Cadastro");
        itmCadastroColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroColaboradorActionPerformed(evt);
            }
        });
        mnuColaborador.add(itmCadastroColaborador);

        itmConsultaColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/browser.png"))); // NOI18N
        itmConsultaColaborador.setText("Consulta");
        itmConsultaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaColaboradorActionPerformed(evt);
            }
        });
        mnuColaborador.add(itmConsultaColaborador);

        itmRelatorioColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        itmRelatorioColaborador.setText("Relatório");
        itmRelatorioColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioColaboradorActionPerformed(evt);
            }
        });
        mnuColaborador.add(itmRelatorioColaborador);

        barMenu.add(mnuColaborador);

        mnuSistema.setMnemonic('S');
        mnuSistema.setText("Sistema");

        itmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/register.png"))); // NOI18N
        itmSair.setText("Alterar Senha Usuário");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        mnuSistema.add(itmSair);

        itmParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compass.png"))); // NOI18N
        itmParametros.setText("Parâmetros");
        itmParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmParametrosActionPerformed(evt);
            }
        });
        mnuSistema.add(itmParametros);

        itmPermissoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locked.png"))); // NOI18N
        itmPermissoes.setText("Permissões");
        itmPermissoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPermissoesActionPerformed(evt);
            }
        });
        mnuSistema.add(itmPermissoes);

        itmSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/power.png"))); // NOI18N
        itmSair1.setText("Sair");
        itmSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSair1ActionPerformed(evt);
            }
        });
        mnuSistema.add(itmSair1);

        barMenu.add(mnuSistema);

        setJMenuBar(barMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroClienteActionPerformed
        cadastroCliente(0);
    }//GEN-LAST:event_itmCadastroClienteActionPerformed

    private void itmConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaClienteActionPerformed
        cadastroCliente(1);
    }//GEN-LAST:event_itmConsultaClienteActionPerformed

    private void itmRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioClienteActionPerformed
        cadastroCliente(2);
    }//GEN-LAST:event_itmRelatorioClienteActionPerformed

    private void itmCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroProdutoActionPerformed
        cadastroProduto(0);
    }//GEN-LAST:event_itmCadastroProdutoActionPerformed

    private void itmConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaProdutoActionPerformed
        cadastroProduto(1);
    }//GEN-LAST:event_itmConsultaProdutoActionPerformed

    private void itmRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioProdutoActionPerformed
        cadastroProduto(2);
    }//GEN-LAST:event_itmRelatorioProdutoActionPerformed

    private void itmUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUnidadeMedidaActionPerformed
        cadastroUnidadeMedida();
    }//GEN-LAST:event_itmUnidadeMedidaActionPerformed

    private void itmCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroFornecedorActionPerformed
        cadastroFornecedor(0);
    }//GEN-LAST:event_itmCadastroFornecedorActionPerformed

    private void itmConsultaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaFornecedorActionPerformed
        cadastroFornecedor(1);
    }//GEN-LAST:event_itmConsultaFornecedorActionPerformed

    private void itmRelatorioFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioFornecedorActionPerformed
        cadastroFornecedor(2);
    }//GEN-LAST:event_itmRelatorioFornecedorActionPerformed

    private void itmCadastroColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroColaboradorActionPerformed
        cadastroColaborador(0);
    }//GEN-LAST:event_itmCadastroColaboradorActionPerformed

    private void itmConsultaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaColaboradorActionPerformed
        cadastroColaborador(1);
    }//GEN-LAST:event_itmConsultaColaboradorActionPerformed

    private void itmRelatorioColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioColaboradorActionPerformed

    }//GEN-LAST:event_itmRelatorioColaboradorActionPerformed

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        alterarSenha();
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmFormasPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFormasPagamentoActionPerformed
        cadastroFormaPagamento();
    }//GEN-LAST:event_itmFormasPagamentoActionPerformed

    private void itmCadastroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroCompraActionPerformed
        cadastroCompra(0);
    }//GEN-LAST:event_itmCadastroCompraActionPerformed

    private void itmConsultaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaCompraActionPerformed
        cadastroCompra(1);
    }//GEN-LAST:event_itmConsultaCompraActionPerformed

    private void itmRelatorioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatorioCompraActionPerformed

    private void itmCadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroVendaActionPerformed
        cadastroVenda(0);
    }//GEN-LAST:event_itmCadastroVendaActionPerformed

    private void itmConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaVendaActionPerformed
        cadastroVenda(1);
    }//GEN-LAST:event_itmConsultaVendaActionPerformed

    private void itmRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioVendaActionPerformed
        cadastroVenda(2);
    }//GEN-LAST:event_itmRelatorioVendaActionPerformed

    private void itmSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSair1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_itmSair1ActionPerformed
    
     private void parametros(){
        IfrmParametros ifrmPar = new IfrmParametros(parametros);
        dskArea.add(ifrmPar);
        ifrmPar.setVisible(true);
    }

    private void alterarSenha(){
        DlgAlterarSenha dlgFP = new DlgAlterarSenha(this,true, jfrLogin.getUsuarioLogado());
        dlgFP.setLocationRelativeTo(this);
        dlgFP.setVisible(true);
    }
    
    private void itmPermissoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPermissoesActionPerformed
        cadastroPermissoes();
    }//GEN-LAST:event_itmPermissoesActionPerformed

    private void itmParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmParametrosActionPerformed
        parametros();
    }//GEN-LAST:event_itmParametrosActionPerformed

    private void cadastroVenda(int aba) {
        IfrmVenda janelaVenda = new IfrmVenda(aba);
        dskArea.add(janelaVenda);
        janelaVenda.setVisible(true);
        // Abre a tela de venda maximizada
        try {
            janelaVenda.setMaximum(true);
        } catch (Exception e) {
        }
    }

    private void cadastroColaborador(int aba) {
        IfrmColaborador janelaColab = new IfrmColaborador(aba);
        dskArea.add(janelaColab);
        janelaColab.setVisible(true);
    }

    private void cadastroCliente(int aba) {
        IfrmCliente janelaClientes = new IfrmCliente(aba);
        dskArea.add(janelaClientes);
        janelaClientes.setVisible(true);
    }

    private void cadastroProduto(int aba) {
        IfrmProduto janelaProdutos = new IfrmProduto(aba);
        dskArea.add(janelaProdutos);
        janelaProdutos.setVisible(true);
    }

    private void cadastroUnidadeMedida() {
        IfrmUnidadeMedida janelaUnidadesMedida = new IfrmUnidadeMedida();
        dskArea.add(janelaUnidadesMedida);
        janelaUnidadesMedida.setVisible(true);
    }

    private void cadastroFormaPagamento() {
        IfrmFormaPagamento janelaFormaPagamento = new IfrmFormaPagamento();
        dskArea.add(janelaFormaPagamento);
        janelaFormaPagamento.setVisible(true);
    }

    private void cadastroFornecedor(int aba) {
        IfrmFornecedor janelaFornecedores = new IfrmFornecedor(aba);
        dskArea.add(janelaFornecedores);
        janelaFornecedores.setVisible(true);
    }

    private void cadastroCompra(int aba) {
        IfrmCompra janelaCompra = new IfrmCompra(aba);
        dskArea.add(janelaCompra);
        janelaCompra.setVisible(true);
        // Abre a tela de venda maximizada
        try {
            janelaCompra.setMaximum(true);
        } catch (Exception e) {
        }
    }

    private void cadastroPermissoes() {
        if (jfrLogin.getUsuarioLogado().getTipousuario() != 'a') {
            Mensagem.mostraAletra("Permissão negada", "Você não tem permissão para acessar esta funcionalidade");
            return;
        }

        IfrmPermissoes janelaPermissoes = new IfrmPermissoes();
        dskArea.add(janelaPermissoes);
        janelaPermissoes.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JDesktopPane dskArea;
    private javax.swing.JMenuItem itmCadastroCliente;
    private javax.swing.JMenuItem itmCadastroColaborador;
    private javax.swing.JMenuItem itmCadastroCompra;
    private javax.swing.JMenuItem itmCadastroFornecedor;
    private javax.swing.JMenuItem itmCadastroProduto;
    private javax.swing.JMenuItem itmCadastroVenda;
    private javax.swing.JMenuItem itmConsultaCliente;
    private javax.swing.JMenuItem itmConsultaColaborador;
    private javax.swing.JMenuItem itmConsultaCompra;
    private javax.swing.JMenuItem itmConsultaFornecedor;
    private javax.swing.JMenuItem itmConsultaProduto;
    private javax.swing.JMenuItem itmConsultaVenda;
    private javax.swing.JMenuItem itmContasPagar;
    private javax.swing.JMenuItem itmContasReceber;
    private javax.swing.JMenuItem itmFormasPagamento;
    private javax.swing.JMenuItem itmParametros;
    private javax.swing.JMenuItem itmPermissoes;
    private javax.swing.JMenuItem itmRelatorioCliente;
    private javax.swing.JMenuItem itmRelatorioColaborador;
    private javax.swing.JMenuItem itmRelatorioCompra;
    private javax.swing.JMenuItem itmRelatorioFornecedor;
    private javax.swing.JMenuItem itmRelatorioProduto;
    private javax.swing.JMenuItem itmRelatorioVenda;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSair1;
    private javax.swing.JMenuItem itmUnidadeMedida;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuColaborador;
    private javax.swing.JMenu mnuCompras;
    private javax.swing.JMenu mnuFinanceiro;
    private javax.swing.JMenu mnuFornecedor;
    private javax.swing.JMenu mnuProduto;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JMenu mnuVendas;
    // End of variables declaration//GEN-END:variables
}
