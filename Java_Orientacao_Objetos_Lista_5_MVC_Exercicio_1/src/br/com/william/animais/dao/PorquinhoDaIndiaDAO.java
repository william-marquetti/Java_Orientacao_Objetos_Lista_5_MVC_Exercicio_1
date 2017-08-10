package br.com.william.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.william.animais.model.PorquinhoDaIndia;

public class PorquinhoDaIndiaDAO {

	private final Connection con;

	public PorquinhoDaIndiaDAO(Connection con) {
		this.con = con;
	}

	public List<PorquinhoDaIndia> lista() throws SQLException {
		List<PorquinhoDaIndia> porquinhos = new ArrayList<>();

		String sql = "select * from animais where tipo ='Porquinho Da Índia'";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String cor = rs.getString("cor");
					String tipo = rs.getString("tipo");
					int qtPatas = rs.getInt("qtpatas");
					PorquinhoDaIndia porquinho = new PorquinhoDaIndia(id, nome, cor, qtPatas);
					porquinhos.add(porquinho);
				}
			}
		}

		return porquinhos;

	}
	
}