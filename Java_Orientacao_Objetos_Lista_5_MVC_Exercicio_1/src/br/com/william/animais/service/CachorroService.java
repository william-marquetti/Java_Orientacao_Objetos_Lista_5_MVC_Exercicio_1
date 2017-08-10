package br.com.william.animais.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.william.animais.dao.CachorroDAO;
import br.com.william.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.william.animais.model.Cachorro;

public class CachorroService {

	/*public void inserirBanda(String nomeBanda, Date dataCriacao, Pais pais){
		if(dataCriacao.after(new Date())){
			throw new IllegalArgumentException("A data de criação deve ser menor que a data atual");
		}
		
		Banda banda = new Banda();
		banda.setNome(nome);
		
		BandaDAO dao = new BandaDAO(con);
		dao.inserir(banda);
	}*/
	
	public List<Cachorro> listarCachorros() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CachorroDAO(con).lista();
		}
		
	}
}
