/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;

/**
 *
 * @author Victor
 */
public class Orcamento {

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @return the ValidoAte
     */
    public Date getValidoAte() {
        return ValidoAte;
    }

    /**
     * @param ValidoAte the ValidoAte to set
     */
    public void setValidoAte(Date ValidoAte) {
        this.ValidoAte = ValidoAte;
    }

    /**
     * @return the servico
     */
    public String getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

    /**
     * @return the produtos
     */
    public String getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    /**
     * @param Responsavel the Responsavel to set
     */
    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the servicos
     */
    public Servicos getServicos() {
        return servicos;
    }

    /**
     * @param servicos the servicos to set
     */
    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    /**
     * @return the responsavel
     */
    public Cliente getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Cliente responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the validoate
     */
    public String getValidoate() {
        return validoate;
    }

    /**
     * @param validoate the validoate to set
     */
    public void setValidoate(String validoate) {
        this.validoate = validoate;
    }
    private Cliente cliente;
    private Servicos servicos;
    private Cliente responsavel;
    private String data;
    private String validoate;
    private String Cliente;
    private Date Data;
    private Date ValidoAte;
    private String servico;
    private String produtos;
    private String Responsavel;
    
}
