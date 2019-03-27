package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.view;

import java.util.HashMap;

import javax.swing.JOptionPane;
import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo.Parecer;
import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo.Projeto;

public class CadastroParecer {
	//private SistemaProjetos sistemaProjetos = new SistemaProjetos();
	private HashMap<Integer, Parecer> pareceres;
	private HashMap<String, Projeto> projetos;
    Integer contadorPareceres = 0;
		
	public CadastroParecer (HashMap<String, Projeto> projetos){
		this.pareceres = new HashMap<>();
		this.projetos = projetos;
	}
	
	public void mostrarMenu(){
		int opcao = 0;
		String opUsuario = null;
		do{
			opUsuario = JOptionPane.showInputDialog("Selecione uma opção:\n"
					+ "1 - Cadastrar Parecer \n"
					+ "2 - Listar Parecer \n"
					+ "3 - Excluir Parecer \n"
					+ "4 - Voltar ao Menu Principal");
			if(opUsuario != null){
				opcao = new Integer (opUsuario);
			};
			switch (opcao){
			case 1:
				cadastrarParecer();
				break;
			case 2:
				listarParecer();
				break;
			case 3:
				excluirParecer();
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

	public void cadastrarParecer (){
			
		String nomeProjeto = JOptionPane.showInputDialog("Insira o nome do projeto que deseja fazer o parecer");
		String data = JOptionPane.showInputDialog("Insira a data de hoje (dd/mm/aaaa).");
		String nomeResponsavel = JOptionPane.showInputDialog("Insira o nome do responsável por esse parecer");
		String consideracoes = JOptionPane.showInputDialog("Insira o parecer.");
		
		projetos.get(nomeProjeto);
		contadorPareceres++;
		
		Parecer p = new Parecer.Builder()
				.id(contadorPareceres)
				.consideracoes(consideracoes)
				.data(data)
				.nomeResponsavel(nomeResponsavel)
				.build();
		
		pareceres.put(p.getId(), p);
		
	}
	
	public void listarParecer (){
		String dadosParecer = "---------- Pareceres Cadastrados ----------\n ";
		for (Parecer parecer : pareceres.values()) {
			dadosParecer += "ID: " + parecer.getId() + " \n Data: " + parecer.getData() + " \n Responsável: " + parecer.getNomeResponsavel() + 
					" \n Considerações: " + parecer.getConsideracoes() + " \n Projeto: ";
			for (Projeto projeto :  parecer.getProjeto().values()) {
				dadosParecer += projeto.getNome();
				
			}
			}
		JOptionPane.showMessageDialog(null, dadosParecer);
	}
	
	public void excluirParecer (){
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do participante a ser Excluido"));
		pareceres.remove(id);
	}

	public HashMap<Integer, Parecer> getPareceres() {
		// TODO Auto-generated method stub
		return pareceres;
	}
	

}
