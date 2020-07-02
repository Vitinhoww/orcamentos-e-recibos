/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Servicos;
import java.util.List;
import Apresentação.Recibo;

/**
 *
 * @author Victor
 */
public interface IServicosDAO {
     public void adiciona(Servicos servicos);
    public void altera (Servicos servicos);
    public void remove (String servicos);
    public List<Cliente> listarTodos();
    public Cliente getByID(String cpf);
}
