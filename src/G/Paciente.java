
package G;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;



public class Paciente {
	// ATRIBUTOS
	private String CPF, nome, sexo,nascimento;
	private Endereco endereco;

	/*
	 * 1- construtor Cadastrar um paciente passando como parametros CPF, nome,
	 * sexo ,endereço e nascimento
	 * 
	 * @param CPF Número do CPF do paciente.
	 * 
	 * @param nome Nome do paciente.
	 * 
	 * @param sexo Sexo do paciente.
	 * 
	 * @param endereco Endereço do paciente.
	 * 
	 * @param datanascimento data de nascimento do paciente
	 */

	public Paciente(String CPF, String nome, String sexo, Endereco endereco,String nascimento) {
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.nascimento = nascimento;
	}

	// 2- Construtor
	/**
	 * Cadastrar um paciente passando como parametros CPF, nome e sexo.
	 * 
	 * @param CPF
	 *            Número do CPF do paciente.
	 * @param nome
	 *            Nome do paciente.
	 * @param sexo
	 *            Sexo do paciente.
	 * @param e1
	 *            endereco do paciente
	 * @return
	 */
	public Paciente(String CPF, String nome, String sexo, String nascimento) {
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = null;
		this.nascimento= nascimento;

	}
	/*
	 * // OS GETS TEM A NECESSIDADE DE EXISTIR PARA PEGAR OS VALORES QUE EXISTEM
	 * DENTRO DOS ATRIBUTOS
	 */

	public String getCPF() {
		return this.CPF;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public String getNascimento() {
		return this.nascimento;
	}

	/*
	 * OS SETS EXISTEM PARA FAZER A NECESSIDADE DE INSERIR VALORES OU MUDAR
	 * DENTRO DOS ATRIBUTOS
	 */
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	

	/*
	 * O toString retorna os dados do paciente em String
	 * 
	 */

	public String toString() {
		return "\n-----Paciente-----\n cpf: " + this.CPF + "\n Nome: " + this.nome + " Sexo: " + this.sexo + "\n-----Endereco------\n"
				+ this.endereco + "\n[ " + this.nascimento ;
	}

	/*
	 * 1-nome do retorna nome do paciente há necessidade deste método para
	 * tratar o nome do paciente e filtar de forma para atender as necessidades
	 * do exercicio que pede : método de retorna o nome do paciente formatado da
	 * forma último nome, iniciais. Ex: Medeiros, F. P
	 */
	public String nomeDoPaciente() {
		String nomes[] = this.nome.split(""
				+ "");//este item e necessario para separa 
		//os espacos e realizar a delimitacao entre os nomes
		String nomeEditado = null;
		
		// o for verifica o tamanho do nome para percorrer

		for (int i = 0; i < nomes.length; i++) {
		
			//o if compara o nome digitado para procurar com o que ja foi adicionado
			
			if (!nomes[i].equals(nomes[nome.length()])) {

				nomeEditado = " " + nomes[i].charAt(0);
			}

		}
		// mostrar o nome 
		
		
		nomeEditado = "" + nomes [nome.length()] + nomeEditado + ".";
		return nomeEditado;

	}

	/*
	 * Este metodo trata a idade onde recebe o ano de nascimento do paciente e
	 * calcula a idade e mostra a idade do paciente.
	 */
	public int idade(String nascimento) {
		String a [] = nascimento.split(Pattern.quote("."));
		int ano = Integer.parseInt(a[2]); // converter string em inteiro
		Calendar cal = GregorianCalendar.getInstance();// este processo e
		// necessario para
		int anoAtual = cal.get(Calendar.YEAR);// pegar uma data atual
		int idade = (anoAtual - ano);// faz o calculo da idade e retorna em int
		
		return idade;
	}

}
