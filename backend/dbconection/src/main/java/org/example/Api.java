package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Api {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Essenza",
                    "postgres",
                    "Lu241106"
            );
            System.out.println("Conectado com sucesso");
            conn.close();
            System.out.println("conexao fechada");
        } catch (SQLException e) {
            System.out.println("erro na conexão");
        }



    }

}
