package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.view;
import javax.swing.JOptionPane;



public class SistemaProjetos {
	
	private CadastroProjeto cadastroProjeto;
	private CadastroParticipante cadastroParticipante;
	private CadastroParecer cadastroParecer;
	
	public static void main (String[] args){
		
		SistemaProjetos sistemaProjetos = new SistemaProjetos();
		sistemaProjetos.geraClassesCadastro();
		sistemaProjetos.mostrarMenu();
	}
	
	
	private void geraClassesCadastro() {
		cadastroParticipante = new CadastroParticipante();
		cadastroProjeto = new CadastroProjeto(cadastroParticipante.getParticipantes());
		cadastroParecer = new CadastroParecer(cadastroProjeto.getProjetos());
	}


	public void mostrarMenu(){
		
		int opcao = 0;
		String opUsuario = null;
		do{
			opUsuario = JOptionPane.showInputDialog("Selecione uma opção:\n"
					+ "1 - Participantes \n"
					+ "2 - Projetos\n"
					+ "3 - Parecer \n"
					+ "4 - Sair do Sistema");
			if(opUsuario != null){
				opcao = new Integer (opUsuario);
			};
			switch (opcao){
			case 1:
				cadastroParticipante.mostrarMenu();
				break;
			case 2:
				cadastroProjeto.mostrarMenu();
				break;
			case 3:
				cadastroParecer.mostrarMenu();
				break;
			default:
					if (opcao != 4) {
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
			}
		} while (opcao != 4);
	}
}
