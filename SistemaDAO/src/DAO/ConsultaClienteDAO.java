
package DAO;

import MODELO.Cliente;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultaClienteDAO 
{
    Cliente cliente;
    public  BD                 bd;
    private ResultSet         resultSet;
    private String            sql, msg; 
    public  ConsultaClienteDAO()
    {
        bd = new BD();       
    } 
    public ResultSet consultar(String codigo, String cidade,String bairro, String nome)
    {
        if(!codigo.trim().equals("")){
            sql = " select * from clientes where codigo = "+codigo+" ";
        }else{
            sql = " select * from clientes where 1=1 ";
        }
        if (!cidade.trim().equals(""))
        {
            sql = sql + " and cidade like '%"+cidade.trim()+"%'";
        }    
        
        if (!bairro.trim().equals(""))
        {
            sql = sql + " and bairro like '%"+bairro.trim()+"%'";
        }  
        
        if (!nome.trim().equals(""))
        {
            sql = sql + " and nome like '%"+nome.trim()+"%'";
        }            
        
        try
        {
            System.out.println(sql);
            Statement statement = bd.connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql); 
            return resultSet;
        }   
        catch (Exception erro)
        {
           System.out.println(erro.getMessage());
            return resultSet;           
        }    
    }    
}
