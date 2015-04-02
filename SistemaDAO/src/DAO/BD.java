
package DAO;

import java.sql.*;
public class BD 
{
    public Connection connection = null;
    private final String DRIVER  = "org.postgresql.Driver"; 
    private final String DBNAME  = "semana6";
    private final String URL     = "jdbc:postgresql://localhost:5432/"+DBNAME;
    private final String LOGIN   = "postgres";
    private final String SENHA   = "1";
    public boolean getConnection()
    {
        try
        {
            //abre a coneccao com o banco de dados.;
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,LOGIN,SENHA);
            System.out.println("Conectou");
            return true;
        }    
        catch (ClassNotFoundException erro)
        {
            System.out.println("Driver nao Encontrado: "+erro.toString());
            return false;
        }    
        catch (SQLException erro)
        {
            System.out.println("Falha ao Conectar: "+erro.toString());
            return false;
        }    
    }  
    public void close()
    {   
        try            
        {
            connection.close();
            System.out.println("Desconectou");
        }
        catch (SQLException erro)
        {            
        }        
    }
}

