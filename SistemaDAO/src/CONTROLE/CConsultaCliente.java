
package CONTROLE;

import DAO.ConsultaClienteDAO;
import MODELO.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CConsultaCliente 
{
     public  ConsultaClienteDAO consultaCliente; 
     public  Cliente      cliente, aux;
     ArrayList <Cliente> clientes;
     private ResultSet   resultSet;
     
     public CConsultaCliente()
     {
         consultaCliente =  new ConsultaClienteDAO(); 
     }  
     
     public ArrayList <Cliente> consultar(String codigo, String cidade,String bairro, String nome) throws SQLException
     {
            
            resultSet = consultaCliente.consultar(codigo, cidade,bairro, nome);               
            clientes =  new ArrayList<>();
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(2));
                aux = new Cliente();
                aux.setCodigo(    resultSet.getInt(1));
                aux.setNome(      resultSet.getString(2));
                aux.setTelefone(  resultSet.getString(3));
                aux.setRua(       resultSet.getString(4));
                aux.setCidade(    resultSet.getString(5));
                aux.setBairro(    resultSet.getString(6));
                aux.setNumero(    resultSet.getInt(7));
                clientes.add(aux);
            }
            return clientes;
     }        
    
}
