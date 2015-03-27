package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

    private Connection conn;

    public Connection conectar() {
        try {
            this.conn = DriverManager.getConnection("jbdc:postgresql://127.0.0.1/empresa", "postgres", "1");
            System.out.println("Conectado com Sucesso");
            return this.conn;
        } catch (Exception e) {
            System.out.printf("Falha ao Conectar: " + e.getMessage());
            return this.conn;
        }
    }

    public boolean desconectar(Connection conn) {
        try {
            conn.close();
            System.out.println("Desconectado com Sucesso, Volte Sempre");
            return true;
        } catch (Exception e) {
            return false;

        }
    }
}

