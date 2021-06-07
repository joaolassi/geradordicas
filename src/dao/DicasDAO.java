package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dicas;

public class DicasDAO {
	private Connection conexao;
	private PreparedStatement prepararSQL;
	private ResultSet resultado;
	
	public DicasDAO() throws ClassNotFoundException, SQLException {
		conexao = new Conexao().getConexao();
	}
	
	public boolean inserir(Dicas dicas) throws SQLException {
		String sql = "INSERT INTO noticias(titulo, subtitulo, autor, dica) VALUES (?, ?, ?, ?)";

		prepararSQL = conexao.prepareStatement(sql);
		prepararSQL.setString(1, dicas.getTitulo());
		prepararSQL.setString(2, dicas.getSubTitulo());
		prepararSQL.setString(3, dicas.getAutor());
		prepararSQL.setString(4, dicas.getDica());
		prepararSQL.execute();
		prepararSQL.close();
		
		return prepararSQL.execute();

	}
}
