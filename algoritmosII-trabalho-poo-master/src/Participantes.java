
public class Participantes extends Organizador {
	
	protected String nomeParticipante;
	protected String emailParticipante;
	
	
	public void cadastroParticipante(){
		
		System.out.println("Informe seu nome:");
		this.nomeParticipante = ler.next();
		
		System.out.println("Informe seu e-mail:");
		this.emailParticipante = ler.next();
	}

	@Override
	public String toString() {
		return "Participantes [nomeParticipante=" + nomeParticipante + ", emailParticipante=" + emailParticipante + "]";
	}
	public String getNomeParticipante() {
		return nomeParticipante;
	}
	public void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}
	public String getEmailParticipante() {
		return emailParticipante;
	}
	public void setEmailParticipante(String emailParticipante) {
		this.emailParticipante = emailParticipante;
	}
	
	
	

}
