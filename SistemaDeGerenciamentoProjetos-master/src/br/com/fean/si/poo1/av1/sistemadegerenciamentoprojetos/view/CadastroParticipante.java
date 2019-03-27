package br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.view;
import java.util.HashMap;
import javax.swing.JOptionPane;
import br.com.fean.si.poo1.av1.sistemadegerenciamentoprojetos.modelo.Participante;


public class CadastroParticipante {
	//private SistemaProjetos sistemaProjetos = new SistemaProjetos();
	private HashMap<Integer, Participante> participantes;
	Integer contadorParticipantes = 0;
	
	
	public CadastroParticipante (){
		this.participantes = new HashMap<>();
	}
	
	
	public void mostrarMenu(){
		int opcao = 0;
		String opUsuario = null;
		do{
			opUsuario = JOptionPane.showInputDialog("Selecione uma op��o:\n"
					+ "1 - Cadastrar Participante \n"
					+ "2 - Listar Participante \n"
					+ "3 - Excluir Participante \n"
					+ "4 - Voltar ao Menu Principal");
			if(opUsuario != null){
				opcao = new Integer (opUsuario);
			};
			switch (opcao){
			case 1:
				cadastrarParticipante();
				break;
			case 2:
				listarParticipante();
				break;
			case 3:
				excluirParticipante();
				break;
	/*		case 4:
				sistemaProjetos.mostrarMenu();*/
				default:
					if (opcao!=4) {
						JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
					}
			}
		} while (opcao != 4);
	}

	public void cadastrarParticipante (){
			
		String nome = JOptionPane.showInputDialog("Insira o nome do Participante");
		String telefone = JOptionPane.showInputDialog("Insira o telefone do Participante");
		String email = JOptionPane.showInputDialog("Insira o e-mail do Participante.");
		String tipo = JOptionPane.showInputDialog("Insira o tipo do Participante (Professor, Aluno ou Pesquisador).");
		contadorParticipantes++;
		
		Participante p = new Participante.Builder()
				.tipo(tipo)
				.telefone(telefone)
				.email(email)
				.id(contadorParticipantes)
				.nome(nome)
				.build();
		
		participantes.put(p.getId(), p);
		
	}
	
	public void listarParticipante (){
		String dadosParticipantes = "---------- Paricipantes Cadastrados ----------\n ";
		for (Participante participante : participantes.values()) {
			dadosParticipantes +="ID: " + participante.getId() + " \n Nome:" + participante.getNome() + " \n Telefone:" + participante.getTelefone() + 
					" \n E-mail:" + participante.getEmail() + " \n Tipo:" + participante.getTipo() + " \n ";
			}
		JOptionPane.showMessageDialog(null, dadosParticipantes);
	}
	
	public void excluirParticipante (){
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do participante a ser Excluido"));
		participantes.remove(id);
	}


	public HashMap<Integer, Participante> getParticipantes() {
		// TODO Auto-generated method stub
		return participantes;
	}

}
