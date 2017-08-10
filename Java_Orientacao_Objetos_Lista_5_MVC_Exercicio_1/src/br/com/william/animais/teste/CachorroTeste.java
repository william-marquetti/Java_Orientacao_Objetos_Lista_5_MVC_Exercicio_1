package br.com.william.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.william.animais.model.Cachorro;
import br.com.william.animais.service.CachorroService;


public class CachorroTeste {

	public static void main(String[] args) throws SQLException {
		List<Cachorro> lCachorros = new CachorroService().listarCachorros();
		for(Cachorro cachorro : lCachorros) {
            System.out.println("\nNome: " + cachorro.getNome() + "\nTipo: "+ cachorro.getTipo());
        }
	}

}
