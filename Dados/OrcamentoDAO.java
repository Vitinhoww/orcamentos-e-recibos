/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Orcamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Victor
 */
public class OrcamentoDAO implements IOrcamentoDAO{
    
        private Connection connection;
        
        public OrcamentoDAO(){
            this.connection= new ConFactory().getConnection();
        }
        
    @Override
    public void adiciona(Orcamento orcamento) {
      String sql="insert into orcamento"+"(cliente,servicos,responsavel,data,validoate)"+"values(?,?,?,?,?,now())";  
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,orcamento.getCliente().toString());
        stmt.setString(2,orcamento.getServicos().toString());
        stmt.setString(3,orcamento.getResponsavel().toString());
        stmt.setString(4,orcamento.getData());
        stmt.setString(5,orcamento.getValidoate());
        
        
        stmt.execute();
        stmt.close();
    }catch(SQLException e){
        throw new RuntimeException(e);
    }
    }

    @Override
    public void altera(Orcamento orcamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String orcamento) {
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
