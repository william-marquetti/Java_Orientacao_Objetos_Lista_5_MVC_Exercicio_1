package br.com.william.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.william.animais.model.Cachorro;

public class CachorroDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> cachorros = new ArrayList<>();

		String sql = "select * from animais where tipo ='Cachorro'";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String cor = rs.getString("cor");
					String tipo = rs.getString("tipo");
					int qtPatas = rs.getInt("qtpatas");
					Cachorro cachorro = new Cachorro(id, nome, cor, qtPatas);
					cachorros.add(cachorro);
				}
			}
		}

		return cachorros;

	}
	
}