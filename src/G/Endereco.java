package G;

/**
 * @author GENILDO1
 *
 */
public class Endereco {
	// ATRIBUTOS
	
	private String CEP, rua, bairro,complemento;

	//Construtores
	/**
	 * Cadastrar um endereço passando como parametros CEP, rua, bairro e complemento.
	 * 
	 * @param CEP
	 * 				Número do CEP.
	 * @param rua
	 * 				Nome da Rua.
	 * @param bairro
	 * 				Nome do Bairro
	 * @param complemento
	 * 				Complemento do endereço.
	 * */
	
	/*
	 * 1- Construtor 
	 */
	public Endereco (String CEP, String rua, String bairro, String complemento){
		this.CEP = CEP;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	
	/**
	 * Cadastrar um endereço passando como parametros CEP e complemento.
	 * 
	 * @param CEP
	 * 				Número do CEP.
	 * @param complemento
	 * 				Complemento do endereço.
	 * */
	
	//2- Construtor
	public Endereco(String CEP, String complemento){
		this.CEP = CEP;
		this.complemento = complemento;
	}
	// METODOS GETS , NECESSARIO PARA RETORNAR DADOS CEP,RUA,BAIRRO,COMPLEMENTO
	public String getCEP() {
		return CEP;
	}	
	public String getRua() {
		return rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	/* METODOS SET , NECESSARIO PARA INSERIR DADOS OU 
	 * ALTERAR OS DADOS DOS ATRIBUTOS CEP,RUA,BAIRRO,COMPLEMENTO
	 */


	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/* TOSTRING 
	* E NECESSARIO PARA EXIBIR TODOS OS DADOS NA TELA  EM FORMA DE STRING
	*/
	@Override
	public String toString() {
		return
				"  CEP: "+ this.CEP 
				+" Rua: "+ this.rua 
				+" Bairro: "+ this.rua
				+" Complemento: "+ this.complemento 
				+"."
				+"\n------Nascimento------";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * Este metodo existe para identificar se são nulos ou nao
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CEP == null) ? 0 : CEP.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Este metodo existe para validar os objetos
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (CEP != other.CEP)
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
}
