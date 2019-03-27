package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo;

public class Participante {
	
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	private String tipo;

	private Participante(Integer id, String nome, String telefone, String email, String tipo) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.tipo = tipo;
	}

	public static class Builder{
		private Integer id;
		private String nome;
		private String telefone;
		private String email;
		private String tipo;

		public Builder id(Integer id) {
			this.id = id;
			return this;
		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder telefone(String telefone){
			this.telefone = telefone;
			return this;
		}
		public Builder email(String email){
			this.email = email;
			return this;
		}
		public Builder tipo(String tipo){
			this.tipo = tipo;
			return this;
		}
		public Participante build(){
			return new Participante(id, nome, telefone, email, tipo);
		}
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
