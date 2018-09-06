/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rlkist
 */
@Entity
@Table(name = "itemcompra")
@NamedQueries({
    @NamedQuery(name = "Itemcompra.findAll", query = "SELECT i FROM Itemcompra i")})
public class Itemcompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemcompraPK itemcompraPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private BigDecimal quantidade;
    @Basic(optional = false)
    @Column(name = "valortotal")
    private BigDecimal valortotal;
    @Basic(optional = false)
    @Column(name = "produto")
    private int produto1;
    @JoinColumn(name = "compra", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra1;

    public Itemcompra() {
    }

    public Itemcompra(ItemcompraPK itemcompraPK) {
        this.itemcompraPK = itemcompraPK;
    }

    public Itemcompra(ItemcompraPK itemcompraPK, BigDecimal valor, BigDecimal quantidade, BigDecimal valortotal, int produto1) {
        this.itemcompraPK = itemcompraPK;
        this.valor = valor;
        this.quantidade = quantidade;
        this.valortotal = valortotal;
        this.produto1 = produto1;
    }

    public Itemcompra(int produto, int compra) {
        this.itemcompraPK = new ItemcompraPK(produto, compra);
    }

    public ItemcompraPK getItemcompraPK() {
        return itemcompraPK;
    }

    public void setItemcompraPK(ItemcompraPK itemcompraPK) {
        this.itemcompraPK = itemcompraPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    public int getProduto1() {
        return produto1;
    }

    public void setProduto1(int produto1) {
        this.produto1 = produto1;
    }

    public Compra getCompra1() {
        return compra1;
    }

    public void setCompra1(Compra compra1) {
        this.compra1 = compra1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemcompraPK != null ? itemcompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemcompra)) {
            return false;
        }
        Itemcompra other = (Itemcompra) object;
        if ((this.itemcompraPK == null && other.itemcompraPK != null) || (this.itemcompraPK != null && !this.itemcompraPK.equals(other.itemcompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Itemcompra[ itemcompraPK=" + itemcompraPK + " ]";
    }
    
}
