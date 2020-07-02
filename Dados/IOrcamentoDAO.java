/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Orcamento;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface IOrcamentoDAO {
    public void adiciona(Orcamento orcamento);
    public void altera (Orcamento orcamento);
    public void remove (String orcamento);
    public List<Cliente> listarTodos();
    public Cliente getByID(String cpf);
}
