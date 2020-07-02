/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Servicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Victor
 */
public class ServicosDAO implements IServicosDAO{

    
    private Connection connection;
    
    
    public ServicosDAO(){
        this.connection=new ConFactory().getConnection();
        
    }
    
    @Override
    public void adiciona(Servicos servicos) {
     String sql ="insert into produto"+"servicos,idservicos,observacoes"+"values(?,?,?now())";
     try{
         PreparedStatement stmt = connection.prepareStatement(sql);
         stmt.setString(1,servicos.getServicos());
         stmt.setInt(2,servicos.getIdservicos());
         stmt.setString(3,servicos.getObservacoes());
         
         
         
         
         stmt.execute();
         stmt.close();
     }catch(SQLException e){
         throw new RuntimeException(e);
     }
    }

    @Override
    public void altera(Servicos servicos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String servicos) {
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
