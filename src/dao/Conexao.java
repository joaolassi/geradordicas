package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String usuario = "root";
	private String senha = "root";
	private String servidor = "localhost";
	private String porta = "3306";
	private String banco = "gerador";
	private Connection conexao;
	private String url = "jdbc:mysql://"+ servidor +"/"+banco+"?serverTimezone=UTC&useSSL=False&allowPublicKeyRetrieval=true";

	public Connection getConexao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conexao = DriverManager.getConnection(url,"root","root");
		return conexao;
	}
}
