/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Leandro
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexão com o banco de dados
    // Connection - framework que vem junto da biblioteca 
    // conector - nome do metodo
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver importado
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbseminario";
        String user = "root";
        String password = "01Evangelho.";
        // estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            System.out.println("e");
            return null;
        }
        
    }
}
