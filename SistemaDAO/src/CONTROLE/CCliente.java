
package CONTROLE;

import DAO.ClienteDAO;
import MODELO.Cliente;
import java.sql.ResultSet;

public class CCliente 
{
    public  Cliente     cliente;
    public  ClienteDAO  daoCliente;
    private ResultSet   resultSet;
    
    public CCliente()
    {
        cliente   = new Cliente();
        daoCliente = new ClienteDAO();
    }    
    
    public boolean localizar(Cliente cliente)
    {
        try
        { 
            System.out.println(String.valueOf(cliente.getCodigo()));
            resultSet = daoCliente.localizar(String.valueOf(cliente.getCodigo()));   
            cliente.setCodigo(    resultSet.getInt(1));
            cliente.setNome(      resultSet.getString(2));
            cliente.setTelefone(  resultSet.getString(3));
            cliente.setRua(       resultSet.getString(4));
            cliente.setCidade(    resultSet.getString(5));
            cliente.setBairro(    resultSet.getString(6));
            cliente.setNumero(    resultSet.getInt(7));
            System.out.println(resultSet.getString(2));
            return true; // ocorreu tudo certo..
        }   
        catch (Exception erro)
        {
            System.out.println(erro.getMessage());
            return false; // caso ocorrra um erro retorna false para a funcao de localizar            
        }
    }  
    public String gravar(Cliente cliente)
    {
        return daoCliente.gravar(cliente); 
    }

    public String alterar(Cliente cliente)
    {
        return daoCliente.alterar(cliente); 
    }    
    
    public String excluir(Cliente cliente)
    {
        return daoCliente.excluir(cliente); 
    }

    public Integer gerar(){
       return daoCliente.gerar();
    }
}
