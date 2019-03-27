package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo;

import java.util.HashMap;


public class Projeto {
	
	private String dataInicio;
	private String dataTermino;
	private String nome;
	private String objetivo;
	private String custoEstimado;
	private HashMap<Integer, Participante> participantes = new HashMap<>();
	private HashMap<Integer, Parecer> pareceres = new HashMap<>();
	

	public static class Builder{
		private String dataInicio;
		private String dataTermino;
		private String nome;
		private String objetivo;
		private String custoEstimado;
		private HashMap<Integer, Participante> participantes = new HashMap<>();
		private HashMap<Integer, Parecer> pareceres = new HashMap<>();
		public Builder dataInicio(String dataInicio){
			this.dataInicio = dataInicio;
			return this;
		}
		public Builder dataTermino(String dataTermino){
			this.dataTermino = dataTermino;
			return this;
		}
		public Builder nome(String nome){
			this.nome = nome;
			return this;
		}
		public Builder objetivo(String objetivo){
			this.objetivo = objetivo;
			return this;
		}
		public Builder custoEstimado(String custoEstimado){
			this.custoEstimado = custoEstimado;
			return this;
		}
		public Builder participantes(HashMap<Integer, Participante> participantes){
			this.participantes = participantes;
			return this;
		}
		public Builder pareceres(HashMap<Integer, Parecer> pareceres){
			this.pareceres = pareceres;
			return this;
		}
		public Projeto build(){
			return new Projeto(dataInicio, dataTermino, nome, objetivo, custoEstimado, participantes);
		}
	}
	private Projeto(String dataInicio, String dataTermino, String nome, String objetivo,
			String custoEstimado,HashMap<Integer, Participante> participantes) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.nome = nome;
		this.objetivo = objetivo;
		this.custoEstimado = custoEstimado;
		this.participantes = participantes;
	}

	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getCustoEstimado() {
		return custoEstimado;
	}
	public void setCustoEstimado(String custoEstimado) {
		this.custoEstimado = custoEstimado;
	}
	
	public HashMap<Integer, Participante> getParticipante(){
		return participantes;
	}
	
	public HashMap<Integer, Parecer> getParecer(){
		return pareceres;
	}
	

}
