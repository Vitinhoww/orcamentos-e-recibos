/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Victor
 */
public class ProdutoDAO implements IProdutoDAO{
    
    private Connection connection;
    
    
    public ProdutoDAO(){
        this.connection=new ConFactory().getConnection();
        
    }
    

    @Override
    public void adiciona(Produto produto) {
    String sql ="insert into produto"+"(nome,codigo,quantidade,fornecedor,Datadecompra,Notafiscal)"+"values(?,?,?,?,?,?,now())";
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,produto.getNome());
        stmt.setString(2,produto .getCodigo());
        stmt.setString(3,produto.getQuantidade());
        stmt.setString(4,produto.getFornecedor());
        stmt.setString(5,produto.getDatadeCompra());
        stmt.setString(6,produto.getNotaFiscal());
        
        
        stmt.execute();
        stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    
    }

    @Override
    public void altera(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String produto) {
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
