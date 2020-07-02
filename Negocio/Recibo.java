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
public class Recibo {

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
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
private Cliente cliente;
private Servicos servicos;
private Produto produto;



}

