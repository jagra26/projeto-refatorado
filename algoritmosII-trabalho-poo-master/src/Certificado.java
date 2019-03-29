
public class Certificado extends Participantes {
	
		protected int posicao;
		

	public void emitirCertificado(){
	
		try{
			
			System.out.println("\nInforme sua participação no evento: \n1)Participante \n2)Organizador \n3)Palestrante");
			this.posicao = ler.nextInt();
			
			if(this.posicao==1){
				
				System.out.println("\nInforme seu nome:");
				this.nomeParticipante = ler.next();
				super.setNomeParticipante(nomeParticipante);
				System.out.println("\nCertifico que " +this.getNomeParticipante() + " participou do " +this.getNomeEvento());
			 
			}
			
			if(this.posicao==2){
				
				System.out.println("\nInforme seu nome:");
				this.nomeOrganizador = ler.next();
				super.setNomeOrganizador(nomeOrganizador);
		
				System.out.println("\nCertifico que " +this.getNomeOrganizador()+ " foi organizador do " +this.getNomeEvento());
			}
			
			if(this.posicao==3){
				
				System.out.println("\nInforme seu nome:");
				this.nomePalestrante = ler.next();
				super.setNomePalestrante(nomePalestrante);

				System.out.println("\nCertifico que " +this.getNomePalestrante()+ " palestrou no " +this.getNomeEvento());
			}

			
			
		}catch(Exception erro){
			
			System.out.println("\nNão foi possível emitir o seu certificado.");
			
		}
	}

}
