package G;

public class Medico {
	//atributos
	private String CRM,nome,especialidade;

	//Construtores
	
		//1- Construtor
		/**
		 * Cadastrar um M�dico passando como parametros CRM, nome e especialidade.
		 * 
		 * @param CRM
		 * 				N�mero do CRM do m�dico.
		 * @param nome
		 * 				Nome do m�dico.
		 * @param especialidade
		 * 				Especialidade do m�dico.
		 * */
		public Medico(String CRM, String nome, String especialidade){
			this.CRM = CRM;
			this.nome = nome;
			this.especialidade = especialidade;
		}
		
		//2- Construtor
		/**
		 * Cadastrar um M�dico passando como parametros nome e especialidade.
		 * @param  
		 * 
		 * @param nome
		 * 				Nome do m�dico.
		 * @param especialidade
		 * 				Especialidade do m�dico.
		 * */
		public Medico(String nome, String especialidade){
			this.nome = nome;
			this.especialidade = especialidade;
		}
		
		//M�todos GET
		
	
		/**
		 *Retornar o n�mero do CRM do M�dico cadastrado.
		 *@param CRM
		 *			CRM do m�dico.
		 * */
		public String getCRM(){
			return this.CRM;
		}
		
		
		/**
		 *Retornar o nome do M�dico cadastrado.
		 *@param nome
		 *			Nome do m�dico.
		 * */
		public String getNome(){
			return this.nome;
		}
		
		/**
		 *Retornar a especialidade do M�dico cadastrado.
		 *@param especialidade
		 *			Especialidade do m�dico.
		 * */
		public String getEspecialidade(){
			return this.especialidade;
		}
		
		//M�todos SET
		
		/**
		 * Alterar o n�mero do CRM do m�dico.
		 * */
		public void setCRM(String CRM){
			this.CRM = CRM;
		}
		
		
		/**
		 * Alterar o nome do m�dico.
		 * */
		public void setNome(String nome){
			this.nome = nome;
		}
		
		
		/**
		 * Alterar a especialidade do m�dico.
		 * */
		public void setEspecialidade(String especialidade){
			this.especialidade = especialidade;
		}
		
		/**
	     * Transformar os dados do m�dico em String.
	     * 
	     * @return O String com os dados do m�dico.
	     * */
		//M�todo toString
		
		public String toString(){
			return "CRM: "+ this.CRM +"\n Nome: "+ this.nome +", Especialidade: "+ this.especialidade +".";
		}

	}
