/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class ClienteDAO implements IClienteDAO {
    
    
    
    private Connection connection;

    public ClienteDAO() {
    this.connection=(Connection) new ConFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){
        String sql="insert into cliente"+"(Nome,cpf,endereco,telefone,celular,email,responsavel)"+"values(?,?,?,?,?,?,?,now())";
    try{
    
    PreparedStatement stmt=connection.prepareStatement(sql);
    stmt.setString(1,cliente.getNome());
    stmt.setString(2,cliente.getCPF());
    stmt.setString(3,cliente.getEndereco());
    stmt.setString(4,cliente.getTelefone());
    stmt.setString(5,cliente.getEmail());
    stmt.setString(6,cliente.getResponsavel());
    
    
    stmt.execute();
    stmt.close();
    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    }
    @Override
    public void altera(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente getByID(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
    
   

