/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Produto;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface IProdutoDAO {
    public void adiciona(Produto produto);
    public void altera (Produto produto);
    public void remove (String produto);
    public List<Cliente> listarTodos();
    public Cliente getByID(String cpf);
}
