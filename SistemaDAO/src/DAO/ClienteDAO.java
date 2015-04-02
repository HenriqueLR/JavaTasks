
package DAO;

import MODELO.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO 
{
    Cliente cliente;
    private PreparedStatement statement;
    public  BD                bd;
    private ResultSet         resultSet;
    private String            sql, msg; 
    public  ClienteDAO()
    {
        bd = new BD();
    }        
    
    public ResultSet localizar(String codigo)
    {
       
        sql = " select * from clientes where codigo = "+codigo;
         System.out.println(sql);
        try
        {   
            statement = bd.connection.prepareStatement(sql); 
            resultSet = statement.executeQuery(); 
            resultSet.next();
            return resultSet; // ocorreu tudo certo..
        }   
        catch (SQLException erro)
        {
            return resultSet; // caso ocorrra um erro retorna false para a funcao de localizar            
        }    
    }
    
    public String gravar(Cliente cliente)
    {
        this.cliente = cliente;
        
        msg = "Operação realizada com sucesso";
        try
        {
            sql = "insert into clientes (codigo, nome, telefone, rua, cidade, bairro, numero) values (?,?,?,?,?,?,?)";
            statement = bd.connection.prepareStatement(sql);
            statement.setInt(1, cliente.getCodigo());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getTelefone());
            statement.setString(4, cliente.getRua());
            statement.setString(5, cliente.getCidade());            
            statement.setString(6, cliente.getBairro());            
            statement.setInt(7, cliente.getNumero());
            if (statement.executeUpdate()==0)
            {
                msg = "Falha na atualização";
            }                
        }  
        catch (SQLException erro)
        {
            msg = "Falha na Operação "+erro.getMessage(); //caso ocorra algum erro..
        }
        return msg;            
        
    }
    public String alterar(Cliente cliente)
    {
        this.cliente = cliente;
        
        //mensagem caso ocorra tudo ok
        msg = "Operação realizada com sucesso";
        try
        { 

            sql = "UPDATE clientes SET nome=?, telefone=?, rua=?, cidade=?, bairro=?, numero=?  WHERE codigo =? ";
            statement = bd.connection.prepareStatement(sql);
            statement.setInt(   7, cliente.getCodigo());
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getTelefone());
            statement.setString(3, cliente.getRua());
            statement.setString(4, cliente.getCidade());            
            statement.setString(5, cliente.getBairro());            
            statement.setInt(   6, cliente.getNumero());  
            if (statement.executeUpdate()==0)
            {
                msg = "Falha na atualização";
            }                
        }  
        catch (SQLException erro)
        {
            msg = "Falha na Operação "+erro.toString(); //caso ocorra algum erro..
        }
        return msg;            
        
    }
             
    
    public String excluir(Cliente cliente)
    {
        this.cliente = cliente;
        
        //mensagem caso ocorra tudo ok
        msg = "Operação realizada com sucesso";
        try
        {
            sql = "delete from clientes where codigo = ?";
            statement = bd.connection.prepareStatement(sql);
            statement.setInt(1, cliente.getCodigo());
            
            if (statement.executeUpdate()==0)
            {
                msg = "Falha na atualização";
            }                
        }  
        catch (SQLException erro)
        {
            msg = "Falha na Operação "+erro.toString();
        }        

        return msg;            
        
    } 

    public int gerar()
    {
        int codigo = 0;
        sql = "select max(codigo) from clientes";
        try
        {   
            statement = bd.connection.prepareStatement(sql); 
            resultSet = statement.executeQuery(); 
            resultSet.next();
            codigo = resultSet.getInt(1);
            codigo++;
            return codigo; // ocorreu tudo certo..
        }   
        catch (SQLException erro)
        {
            return codigo; // caso ocorrra um erro retorna false para a funcao de localizar            
        }    
    }    
    
    
}
