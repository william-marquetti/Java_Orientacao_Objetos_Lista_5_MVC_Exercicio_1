package br.com.william.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.william.animais.model.PorquinhoDaIndia;
import br.com.william.animais.service.PorquinhoDaIndiaService;


public class PorquinhoDaIndiaTeste {

	public static void main(String[] args) throws SQLException {
		List<PorquinhoDaIndia> lPorquinhos = new PorquinhoDaIndiaService().listarPorquinhos();
		for(PorquinhoDaIndia porquinho : lPorquinhos) {
            System.out.println("\nNome: " + porquinho.getNome() + "\nTipo: "+ porquinho.getTipo());
        }
	}

}
