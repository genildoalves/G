package G;

public class Medico {
	//atributos
	private String CRM,nome,especialidade;

	//Construtores
	
		//1- Construtor
		/**
		 * Cadastrar um Médico passando como parametros CRM, nome e especialidade.
		 * 
		 * @param CRM
		 * 				Número do CRM do médico.
		 * @param nome
		 * 				Nome do médico.
		 * @param especialidade
		 * 				Especialidade do médico.
		 * */
		public Medico(String CRM, String nome, String especialidade){
			this.CRM = CRM;
			this.nome = nome;
			this.especialidade = especialidade;
		}
		
		//2- Construtor
		/**
		 * Cadastrar um Médico passando como parametros nome e especialidade.
		 * @param  
		 * 
		 * @param nome
		 * 				Nome do médico.
		 * @param especialidade
		 * 				Especialidade do médico.
		 * */
		public Medico(String nome, String especialidade){
			this.nome = nome;
			this.especialidade = especialidade;
		}
		
		//Métodos GET
		
	
		/**
		 *Retornar o número do CRM do Médico cadastrado.
		 *@param CRM
		 *			CRM do médico.
		 * */
		public String getCRM(){
			return this.CRM;
		}
		
		
		/**
		 *Retornar o nome do Médico cadastrado.
		 *@param nome
		 *			Nome do médico.
		 * */
		public String getNome(){
			return this.nome;
		}
		
		/**
		 *Retornar a especialidade do Médico cadastrado.
		 *@param especialidade
		 *			Especialidade do médico.
		 * */
		public String getEspecialidade(){
			return this.especialidade;
		}
		
		//Métodos SET
		
		/**
		 * Alterar o número do CRM do médico.
		 * */
		public void setCRM(String CRM){
			this.CRM = CRM;
		}
		
		
		/**
		 * Alterar o nome do médico.
		 * */
		public void setNome(String nome){
			this.nome = nome;
		}
		
		
		/**
		 * Alterar a especialidade do médico.
		 * */
		public void setEspecialidade(String especialidade){
			this.especialidade = especialidade;
		}
		
		/**
	     * Transformar os dados do médico em String.
	     * 
	     * @return O String com os dados do médico.
	     * */
		//Método toString
		
		public String toString(){
			return "CRM: "+ this.CRM +"\n Nome: "+ this.nome +", Especialidade: "+ this.especialidade +".";
		}

	}
