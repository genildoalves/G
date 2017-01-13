package G;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDePacientes {

	// Atributo
	private List<Paciente> col;

	/**
	 * Iniciar coleção de Pacientes.
	 * @return 
	 **/
	// Construtor
	public ColecaoDePacientes() {
		col = new ArrayList<Paciente>();
	}
		
		
	
	// Métodos
	
	/**
	 * A- Método para adicionar paciente.
	 * 
	 * @param p
	 *            Paciente.
	 */
	
	public void adicionarPaciente(Paciente p) {
		col.add(p);
	}
	/**
	 * B-metodo para pequisa pelo documento
	 * @param cpf
	 */
	public String pesquisaPeloDocumento(String cpf) {
		for (Paciente p : col) {
			if (p.getCPF().equals(cpf)) {
				return p.toString();
			}

		}

		return "Nao existe";
	}
	/**
	 * C-metodo para remover pelo documento
	 * @param cpf
	 */
	public boolean removePeloDocumento(String cpf) {
		for (Paciente p : col) {
			if (p.getCPF().equals(cpf)) {
				col.remove(p);
				return true;
				
			}
		}
		return false;
	}

	/**
	 * D-Método exibe a quantidade de pacientes com sexo referido
	 * @param sexo
	 * @return qtd <- para fazer um contador
	 */
	public String qtdPacientesPorSexo(String sexo) {
		int qtd = 0;
		for (Paciente p : col) {
			if (p.getSexo().equals(sexo)) {
				qtd++;
			}
		}
		return "\n sexo: " +sexo+"\n Quantidade(s): "+qtd;
	}

	/**
	 * E- Método exibe a quantidade de pacientes endereco referido
	 * @return col1 <- para listar pacientes com enderecos
	 */
	public List<Paciente> listagemPacientesComEndereço() {

		List<Paciente> col1;
		col1 = new ArrayList<Paciente>();
		for (Paciente p : col) {

			if (p.getEndereco() != null) {
				col1.add(p);
			}
			
		}
		return col1;
	}
		
	/**
	 * F- Metodo para exibir pacientes maiores de 60 anos
	 * @return
	 */

	public  List<Paciente> listagemDePacientesMaioresDe60anos() {
		List <Paciente>col2;
		
		
		col2 = new ArrayList<Paciente>();
		int cont=0;
		
		
		for(Paciente p : col){
					
			int idade = p.idade(p.getNascimento());
			if (idade >= 60){
				col2.add(p);
			cont++;
			System.out.println("Cadastro numero: "+cont+" idade: "+idade);
			}
		
	   }
		return col2;
	}
  
}

// *colecao de pacientes
// *A adicionarPaciente
// *B pesquisaPeloDocumento
// *C removePeloDocumento
// *D qtdPacientesPorSexo
// *E listagemPacientesComEndereço 
// *F listagemDePacientesMaioresDe60anos.