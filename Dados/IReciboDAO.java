/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Produto;
import java.util.List;
import Apresentação.Recibo;

/**
 *
 * @author Victor
 */
public interface IReciboDAO {
    public void adiciona(Recibo recibo);
    public void altera (Recibo recibo);
    public void remove (String recibo);
    public List<Cliente> listarTodos();
    public Cliente getByID(String cpf);
}
