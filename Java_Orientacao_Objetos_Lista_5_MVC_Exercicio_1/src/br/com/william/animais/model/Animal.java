package br.com.william.animais.model;

public abstract class Animal {
	
	private Integer id;
	private String nome;
	private String cor;
	private int qtPatas;
	private String som;
	private String tipo;
	
	public Animal(Integer id, String nome, String cor, int qtPatas, String som, String tipo ) {
		setId(id);
		setNome(nome);
		setCor(cor);
		setQtPatas(qtPatas);
		setSom(som);
		setTipo(tipo);
	}	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtPatas() {
		return qtPatas;
	}

	public void setQtPatas(int qtPatas) {
		this.qtPatas = qtPatas;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String retornaSom(){
		return getSom();
	}
}
