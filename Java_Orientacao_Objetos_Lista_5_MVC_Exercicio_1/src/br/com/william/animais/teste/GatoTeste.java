package br.com.william.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.william.animais.model.Gato;
import br.com.william.animais.service.GatoService;


public class GatoTeste {

	public static void main(String[] args) throws SQLException {
		List<Gato> lGatos = new GatoService().listarGatos();
		for(Gato gato : lGatos) {
            System.out.println("\nNome: " + gato.getNome() + "\nTipo: "+ gato.getTipo());
        }
	}

}
