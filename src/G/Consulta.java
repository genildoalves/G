package G;

public class Consulta {
    //ATRIBUTOS
	private Paciente paciente;
	private Medico medico;
	private String data,hora;
	
	
	/*OS SETS EXISTEM PARA FAZER A NECESSIDADE DE INSERIR 
	 * VALORES OU MUDAR DENTRO DOS ATRIBUTOS
	 */

	public Paciente getPaciente() {
		return this.paciente;
	}

	public Medico getMedico() {
		return this.medico;
	}
	public String getData() {
		return this.data;
	}	
	public String getHora() {
		return this.hora;
	}
	/*
	 * OS SETS EXISTEM PARA FAZER A NECESSIDADE DE INSERIR VALORES OU MUDAR
	 * DENTRO DOS ATRIBUTOS
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setData(String data) {
		this.data = data;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	//construtor
	/**
	 * Fazer o cadasstro de uma  consulta e necessario 
	 * este construtor e passar os parametros 
	 * @param paciente
	 * @param medico
	 * @param data
	 * @param hora
	 */
	public Consulta(Paciente paciente,Medico medico,String data,String hora ){
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
				
	}
	/**
	 * Fazer o cadasstro de uma  consulta e necessario 
	 * este construtor e passar os parametros 
	 * @param paciente
	 * @param medico
	 */
	public Consulta(Paciente paciente,Medico medico){
		this.paciente = paciente;
		this.medico = medico;
		this.hora= null;
		this.data = null;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * Este metodo existe para identificar se são nulos ou nao
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Este metodo existe para testar se os atributos são iguias ou nao
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Consulta)) {
			return false;
		}
		Consulta other = (Consulta) obj;
		if (paciente == null) {
			if (other.paciente != null) {
				return false;
			}
		} else if (!paciente.equals(other.paciente)) {
			return false;
		}
		if (data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!data.equals(other.data)) {
			return false;
		}
		if (hora == null) {
			if (other.hora != null) {
				return false;
			}
		} else if (!hora.equals(other.hora)) {
			return false;
		}
		if (medico == null) {
			if (other.medico != null) {
				return false;
			}
		} else if (!medico.equals(other.medico)) {
			return false;
		}
		return true;
	}	

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 * há necessidade deste metodo para exibir o resultado dos metodos 
		 */
		@Override
	public String toString() {
		return "Consulta \n" + (paciente != null ? "Paciente: " + paciente + " " : "")
				+ (medico != null ? "\n-----Medico---\n " + medico + " " : "") + (data != null ? "Data: " + data + "" : "")
				+ (hora != null ? " Hora: " + hora : "");
	}

  
 
}
