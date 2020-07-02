/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Victor
 */
public class UsuarioDAO implements IUsuarioDAO {

    
    
    
    private Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Usuario usuario) {
 String sql="insert into usuario"+"(Nome,cpf,endereco,telefone,senha,email,login)"+"values(?,?,?,?,?,?,?,now())";
    try{
    
    PreparedStatement stmt=connection.prepareStatement(sql);
    stmt.setString(1,usuario.getNome());
    stmt.setString(2,usuario.getCpf());
    stmt.setString(3,usuario.getLogin());
    stmt.setString(4,usuario.getEndereco());
    stmt.setString(5,usuario.getEmail());
    stmt.setString(6,usuario.getSenha());
    stmt.setString(7,usuario.getTelefone());
    
    
    
    stmt.execute();
    stmt.close();
    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    
    
    }

    @Override
    public void altera(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getByID(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
