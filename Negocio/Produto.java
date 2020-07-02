/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Victor
 */
public class Produto {

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Quantidade
     */
    public String getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the Fornecedor
     */
    public String getFornecedor() {
        return Fornecedor;
    }

    /**
     * @param Fornecedor the Fornecedor to set
     */
    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    /**
     * @return the DatadeCompra
     */
    public String getDatadeCompra() {
        return DatadeCompra;
    }

    /**
     * @param DatadeCompra the DatadeCompra to set
     */
    public void setDatadeCompra(String DatadeCompra) {
        this.DatadeCompra = DatadeCompra;
    }

    /**
     * @return the NotaFiscal
     */
    public String getNotaFiscal() {
        return NotaFiscal;
    }

    /**
     * @param NotaFiscal the NotaFiscal to set
     */
    public void setNotaFiscal(String NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }
    private String Nome;
    private String Codigo;
    private String Quantidade;
    private String Fornecedor;
    private String DatadeCompra;
    private String NotaFiscal;
}
