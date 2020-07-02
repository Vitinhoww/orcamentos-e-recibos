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
import Apresentação.Recibo;

/**
 *
 * @author Victor
 */
public class ReciboDAO implements IReciboDAO{

    private Connection connection;
    
    
    
    public ReciboDAO(){
        this.connection=new ConFactory().getConnection();
    }
    @Override
    public void adiciona(Recibo recibo) {
    String sql = "insert into recibo"+ "(cliente,produto,servicos)"+"values(?,?,?,now())";
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, (String) recibo.getCliente());
        stmt.setString(2, (String) recibo.getProduto());
        stmt.setString(3,recibo.getServicos());
        
        
        stmt.execute();
        stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Recibo recibo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String recibo) {
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
