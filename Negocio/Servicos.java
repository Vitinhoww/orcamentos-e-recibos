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
public class Servicos {

    /**
     * @return the servicos
     */
    public String getServicos() {
        return servicos;
    }

    /**
     * @param servicos the servicos to set
     */
    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    /**
     * @return the idservicos
     */
    public int getIdservicos() {
        return idservicos;
    }

    /**
     * @param idservicos the idservicos to set
     */
    public void setIdservicos(int idservicos) {
        this.idservicos = idservicos;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    private String servicos;
    private int idservicos;
    private String observacoes;
}
