package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cruds {
	public void insertcliente(int a, String b, String c) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;
        
        try {
            
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO cliente (cod_cidade,nome_cliente,tel_cliente) " + "VALUES (?,?,?);");
            stmt.setInt(1, a);
            stmt.setString(2, b);
            stmt.setString(3, c);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void insertcidade(String a, String b) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;
        
        try {
            
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO cidade (sigla_uf,nome_cidade) " + "VALUES (?,?);");
            stmt.setString(1, a);
            stmt.setString(2, b);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void insertfuncionario(int a, String b, String c) {
        
        Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;
        
        try {
            
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO funcionario (cod_cidade,nome_funcionario,salario) " + "VALUES (?,?,?);");
            stmt.setInt(1, a);
            stmt.setString(2, b);
            stmt.setString(3, c);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void insertgrupo(String a) {
        
        Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;
        
        try {
            
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO grupo (nome_grupo) " + "VALUES (?);");
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void insertproduto(int a,String b, String c) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;
        
        try {
            
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO produto (cod_grupo,nome_produto,valor_compra) " + "VALUES (?,?,?);");
            stmt.setInt(1, a);
            stmt.setString(2, b);
            stmt.setString(3, c);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void deletecliente(String a) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;

        try {
        	
            PreparedStatement stmt = conn.prepareStatement("delete from cliente where nome_cliente = ?");    
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void deletecidade(String a) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;

        try {
        	
            PreparedStatement stmt = conn.prepareStatement("delete from cidade where sigla_uf = ?");    
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void deletefuncionario(String a) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;

        try {
        	
            PreparedStatement stmt = conn.prepareStatement("delete from funcionario where nome_funcionario = ?");    
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void deletegrupo(String a) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;

        try {
        	
            PreparedStatement stmt = conn.prepareStatement("delete from grupo where nome_grupo = ?");    
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
	
	public void deleteproduto(String a) {
        
	Db bd = new Db();
        Connection conn = bd.conectar();
        @SuppressWarnings("unused")
		ResultSet resultado;

        try {
        	
            PreparedStatement stmt = conn.prepareStatement("delete from produto where nome_produto = ?");    
            stmt.setString(1, a);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

	public void updatecliente(String a, String b){
		
		Db bd = new Db();
		Connection conn = bd.conectar();
		@SuppressWarnings("unused")
		ResultSet resultado;
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement("update cliente set tel_cliente = ? where nome_cliente = ?");
			stmt.setString(1, a);
			stmt.setString(2, b);
			stmt.executeUpdate();
			
		}catch (SQLException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
	
public void updatecidade(String a, String b){
		
		Db bd = new Db();
		Connection conn = bd.conectar();
		@SuppressWarnings("unused")
		ResultSet resultado;
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement("update cidade set nome_cidade = ? where sigla_uf = ?");
			stmt.setString(1, a);
			stmt.setString(2, b);
			stmt.executeUpdate();
			
		}catch (SQLException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}

public void updatefuncionario(String a, String b){
	
	Db bd = new Db();
	Connection conn = bd.conectar();
	@SuppressWarnings("unused")
	ResultSet resultado;
	
	try {
		
		PreparedStatement stmt = conn.prepareStatement("update funcionario set salario = ? where nome_funcionario = ?");
		stmt.setString(1, a);
		stmt.setString(2, b);
		stmt.executeUpdate();
		
	}catch (SQLException ex) {
		System.out.println("Erro: " + ex.getMessage());
	}
}

public void updategrupo(String a, int b){
	
	Db bd = new Db();
	Connection conn = bd.conectar();
	@SuppressWarnings("unused")
	ResultSet resultado;
	
	try {
		
		PreparedStatement stmt = conn.prepareStatement("update grupo set nome_grupo = ? where cod_grupo = ?");
		stmt.setString(1, a);
		stmt.setInt(2, b);
		stmt.executeUpdate();
		
	}catch (SQLException ex) {
		System.out.println("Erro: " + ex.getMessage());
	}
}

public void updateproduto(String a, String b){
	
	Db bd = new Db();
	Connection conn = bd.conectar();
	@SuppressWarnings("unused")
	ResultSet resultado;
	
	try {
		
		PreparedStatement stmt = conn.prepareStatement("update produto set valor_compra = ? where nome_produto = ?");
		stmt.setString(1, a);
		stmt.setString(2, b);
		stmt.executeUpdate();
		
	}catch (SQLException ex) {
		System.out.println("Erro: " + ex.getMessage());
	}
}
		
    public ArrayList<String> ListarCidades() throws SQLException {
        
    	Db bd = new Db();
        Connection conn = bd.conectar();
        ResultSet resultado;

        PreparedStatement stmt = conn.prepareStatement("select nome_cidade from cidade;");
        resultado = stmt.executeQuery();
        //preenche arraylist com nomes  
        ArrayList<String> cidades = new ArrayList<String>();
        while(resultado.next()){
            cidades.add(resultado.getString(1));
        }
       //System.out.println(cidades);
        return cidades;
    }
    
    public ArrayList<String> ListarClientes() throws SQLException {
        
    	Db bd = new Db();
        Connection conn = bd.conectar();
        ResultSet resultado;

        PreparedStatement stmt = conn.prepareStatement("select nome_cliente from cliente;");
        resultado = stmt.executeQuery();
        //preenche arraylist com nomes  
        ArrayList<String> cliente = new ArrayList<String>();
        while(resultado.next()){
            cliente.add(resultado.getString(1));
        }
       //System.out.println(cidades);
        return cliente;
    }
    
    public ArrayList<String> ListarFuncionario() throws SQLException {
        
    	Db bd = new Db();
        Connection conn = bd.conectar();
        ResultSet resultado;

        PreparedStatement stmt = conn.prepareStatement("select nome_funcionario,salario from funcionario;");
        resultado = stmt.executeQuery();
        //preenche arraylist com nomes  
        ArrayList<String> funcionario = new ArrayList<String>();
        while(resultado.next()){
            funcionario.add(resultado.getString(1));
        }
       //System.out.println(cidades);
        return funcionario;
    }
    
    public ArrayList<String> ListarGrupo() throws SQLException {
        
    	Db bd = new Db();
        Connection conn = bd.conectar();
        ResultSet resultado;

        PreparedStatement stmt = conn.prepareStatement("select nome_grupo from grupo;");
        resultado = stmt.executeQuery();
        //preenche arraylist com nomes  
        ArrayList<String> grupo = new ArrayList<String>();
        while(resultado.next()){
            grupo.add(resultado.getString(1));
        }
       //System.out.println(cidades);
        return grupo;
    }
    
    public ArrayList<String> ListarProduto() throws SQLException {
        
    	Db bd = new Db();
        Connection conn = bd.conectar();
        ResultSet resultado;

        PreparedStatement stmt = conn.prepareStatement("select nome_produto, valor_compra from produto;");
        resultado = stmt.executeQuery();
        //preenche arraylist com nomes  
        ArrayList<String> produto = new ArrayList<String>();
        while(resultado.next()){
            produto.add(resultado.getString(1));
        }
       //System.out.println(cidades);
        return produto;
    }
    /*public static void main(String args[]) throws SQLException{
    	Cruds n = new Cruds();
    	n.ListarCidades();*/
}