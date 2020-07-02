/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface IClienteDAO {
    public void adiciona(Cliente cliente);
    public void altera (Cliente cliente);
    public void remove (String nome);
    public List<Cliente> listarTodos();
    public Cliente getByID(String cpf);
}

