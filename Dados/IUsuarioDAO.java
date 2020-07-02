/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Usuario;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface IUsuarioDAO {
    public void adiciona(Usuario usuario);
    public void altera (Usuario usuario);
    public void remove (String nome);
    public List<Usuario> listarTodos();
    public Usuario getByID(String cpf);
}
