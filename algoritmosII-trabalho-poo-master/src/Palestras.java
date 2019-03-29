
public class Palestras extends Evento {
	
	protected int salaPalestra;
	protected String horarioPalestra;
	protected String resumoPalestra;
	protected String tituloPalestra;
	protected String pesquisa;
	
	public void criaPalestra(){
		
		System.out.println("\nInforme o evento para vincular a nova palestra:");
		this.pesquisa = ler.next();
	
		try{
		
			if (pesquisa.equalsIgnoreCase(nomeEvento)){
			
				System.out.println("\nInforme o nome da nova palestra:");
				this.tituloPalestra = ler.next();
				this.setTituloPalestra(tituloPalestra);
				
				System.out.println("\nInforme o horário da Palestra:");
				this.horarioPalestra = ler.next();
				this.setHorarioPalestra(horarioPalestra);
				
				this.setSalaPalestra(100);
				
				System.out.println("\nInforme um breve resumo sobre a palestra:");
				this.resumoPalestra = ler.next();
				this.setResumoPalestra(resumoPalestra);
			
			}else{
				System.out.println("\nEvento não encontrado.");
			}
		
		}catch(Exception erro){
			System.out.println("\nPalestra não encontrada...");
		}
		
	}
	
	public void mostraResumo(){
		
		try{
			
			System.out.println("\nInforme o título da palestra para ver o resumo:");
			this.pesquisa = ler.next();
			
			if(this.pesquisa.equalsIgnoreCase(this.tituloPalestra)){
				
				System.out.println("\nINFORMAÇÕES DA PALESTRA:\nTítulo da Palestra: " + this.getTituloPalestra() + "\nHorário da Palestra: "
				+ this.getHorarioPalestra() + "\nResumo: " + this.getResumoPalestra() + "\nSala da Palestra:" + this.getSalaPalestra());
			}
			
		}catch(Exception erro){
			System.out.println("Resumo não encontrado...");
		}

	}

	public int getSalaPalestra() {
		return salaPalestra;
	}

	public void setSalaPalestra(int salaPalestra) {
		this.salaPalestra = salaPalestra;
	}

	public String getHorarioPalestra() {
		return horarioPalestra;
	}
	
	public void setHorarioPalestra(String horarioPalestra) {
		this.horarioPalestra = horarioPalestra;
	}

	public String getResumoPalestra() {
		return resumoPalestra;
	}

	public void setResumoPalestra(String resumoPalestra) {
		this.resumoPalestra = resumoPalestra;
	}
	
	public String getTituloPalestra() {
		return tituloPalestra;
	}

	public void setTituloPalestra(String tituloPalestra) {
		this.tituloPalestra = tituloPalestra;
	}
}

