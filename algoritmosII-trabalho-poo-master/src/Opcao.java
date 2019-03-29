
public class Opcao extends Encerra {
	
	protected int opcao=1;
	
	public void menu(){
		
		while(this.opcao==1 ||this.opcao==2 || this.opcao==3 ||this.opcao==4 || this.opcao==5){
			
			System.out.println("\nBem-vindo ao Sistema de Eventos!\nInforme a opção desejada:\n1)Criar Evento \n2)Ver Eventos\n3)Criar Palestras \n4)Ver Resumo das Palestras \n5)Emitir certificado \n6)Sair");
			this.opcao = ler.nextInt();
			
			if(this.opcao==1){
				super.criaEvento();
			}
			
			if(this.opcao==2){
				super.infoEvento();
			}
			
			if(this.opcao==3){
				super.criaPalestra();
			}
			
			if(this.opcao==4){
				super.mostraResumo();
			}
			if(this.opcao==5){
				super.emitirCertificado();
			}
			if(this.opcao==6){
				super.finaliza();
			}
		
		}
	


	}
}