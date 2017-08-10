package br.com.william.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.william.animais.model.Gato;

public class GatoDAO {

	private final Connection con;

	public GatoDAO(Connection con) {
		this.con = con;
	}

	public List<Gato> lista() throws SQLException {
		List<Gato> gatos = new ArrayList<>();

		String sql = "select * from animais where tipo ='Gato'";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String cor = rs.getString("cor");
					String tipo = rs.getString("tipo");
					int qtPatas = rs.getInt("qtpatas");
					Gato gato = new Gato(id, nome, cor, qtPatas);
					gatos.add(gato);
				}
			}
		}

		return gatos;

	}
	
}