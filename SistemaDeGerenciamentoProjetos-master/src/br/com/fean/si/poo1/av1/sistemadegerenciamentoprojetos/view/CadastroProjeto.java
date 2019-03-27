package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.view;
import java.util.HashMap;

import javax.swing.JOptionPane;

import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo.Participante;
import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo.Projeto;
//import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.view.SistemaProjetos;

public class CadastroProjeto {
	
	private HashMap<String, Projeto> projetos;
	private HashMap<Integer, Participante> participantes;
	private Integer contadorParticipantes = 0;
	//private SistemaProjetos sistemaProjetos = new SistemaProjetos();
	
	
	public CadastroProjeto (HashMap<Integer, Participante> participantes){
		this.projetos = new HashMap<>();
		this.participantes = participantes;
	}
	
	
	
	public void mostrarMenu(){
		int opcao = 0;
		String opUsuario = null;
		do{
			opUsuario = JOptionPane.showInputDialog("Selecione uma opção:\n"
					+ "1 - Cadastrar Projeto \n"
					+ "2 - Listar Projeto \n"
					+ "3 - Excluir Projeto \n"
					+ "4 - Voltar ao Menu Principal");
			if(opUsuario != null){
				opcao = new Integer (opUsuario);
			};
			switch (opcao){
			case 1:
				cadastrarProjeto();
				break;
			case 2:
				listarProjeto();
				break;
			case 3:
				excluirProjeto();
				break;
	/*		case 4:
				sistemaProjetos.mostrarMenu(); */
				default:
					if (opcao != 4) {
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
			}
		} while (opcao != 4);
	}

	public void cadastrarProjeto (){
		
		Integer idParticipante = null;	
		String dataInicio = JOptionPane.showInputDialog("Insira a data de Inicio do Projeto (dd/mm/aaaa).");
		String dataTermino = JOptionPane.showInputDialog("Insira a data de Termino do Projeto (dd/mm/aaaa).");
		String nome = JOptionPane.showInputDialog("Insira o nome do Projeto.");
		String objetivo = JOptionPane.showInputDialog("Insira o objetivo do Projeto.");
		String custoEstimado = JOptionPane.showInputDialog("Insira o custo do Projeto.");
		HashMap<Integer, Participante> participantesProjeto = new HashMap<>();
		do {
			try {
				idParticipante = null;
				idParticipante = Integer.valueOf(JOptionPane.showInputDialog("Insira o Id do Participante \n Tecle enter para interromper a inclusão de participantes."));				
				
				if(idParticipante != null){
					participantesProjeto.put(idParticipante, participantes.get(idParticipante));
					contadorParticipantes++;
					if(contadorParticipantes == 0){
						JOptionPane.showMessageDialog(null, "Insira ao menos um participante");
					}
				}
				
			} catch (Exception e) {
				//idParticipante = 99;
			}
		
		}while(idParticipante != null);
		
		
		Projeto p = new Projeto.Builder()
				.custoEstimado(custoEstimado)
				.dataInicio(dataInicio)
				.dataTermino(dataTermino)
				.nome(nome)
				.objetivo(objetivo)
				.participantes(participantesProjeto)
				.build();
		
		projetos.put(p.getNome(), p);
		
	}
	
	public void listarProjeto (){
		String dadosProjetos = "---------- Projetos Cadastrados ----------\n ";
		for (Projeto projeto : projetos.values()) {
			dadosProjetos +="Nome: " + projeto.getNome() + " \n Data Inicio: " + projeto.getDataInicio() + " \n Data Termino: " + projeto.getDataTermino()
			+ " \n Objetivo: " + projeto.getObjetivo() + " \n Custo: " + projeto.getCustoEstimado() + " \n " + "Participantes: \n";
			for (Participante pessoa : projeto.getParticipante().values()) {
				dadosProjetos += "- "+pessoa.getNome()+"\n ";
			}
			}
		JOptionPane.showMessageDialog(null, dadosProjetos);
	}
	
	public void excluirProjeto (){
		String nome = JOptionPane.showInputDialog("Insira o nome do Projeto a ser Excluido");
		projetos.remove(nome);
	}



	public HashMap<String, Projeto> getProjetos() {
		// TODO Auto-generated method stub
		return projetos;
	}
	
}
