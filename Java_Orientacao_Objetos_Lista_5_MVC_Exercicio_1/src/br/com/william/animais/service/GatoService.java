package br.com.william.animais.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.william.animais.dao.GatoDAO;
import br.com.william.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.william.animais.model.Gato;

public class GatoService {

	/*public void inserirBanda(String nomeBanda, Date dataCriacao, Pais pais){
		if(dataCriacao.after(new Date())){
			throw new IllegalArgumentException("A data de cria��o deve ser menor que a data atual");
		}
		
		Banda banda = new Banda();
		banda.setNome(nome);
		
		BandaDAO dao = new BandaDAO(con);
		dao.inserir(banda);
	}*/
	
	public List<Gato> listarGatos() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new GatoDAO(con).lista();
		}
		
	}
}
