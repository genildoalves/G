package G;

import java.util.ArrayList;
import java.util.List;

public class ColecaoConsultas {

	// Atributo
	private List<Consulta> col;

	// Construtor
	/**
	 * INICIA COLECAO DE CONSULTAS
	 */

	public ColecaoConsultas() {
		col = new ArrayList<Consulta>();
	}
	/*
	 * A-Adiciona consulta
	 */

	public void adicionaConsulta(Consulta c) {
		col.add(c);

	}

	/*
	 * B-Consulta por data
	 */
	public int qtdConsultasData(String Data) {
		int qtd = 0;
		for (Consulta c : col) {
			if (c.getData().equals(Data))
				qtd++;
		}

		return qtd;
	}
	/*
	 * C-Listagem de consultas
	 */
	public List<Consulta> listagemConsultas(){
		List<Consulta>col1;
		col1=new ArrayList<Consulta>();
		for (Consulta c : col){
			if (c.toString()!=null){
				col1.add(c);
			}
		}
		return col1;
	}

	/*
	 * D-Quantidade por medico
	 */
	public String qtdConsultasPorMedico(Medico m) {
		int qtd = 0;
		for (Consulta c : col) {
			if (c.getMedico().equals(m)) {
				qtd++;
			}
		}

		return "Quantidade de consulas do Medico:" + m + "\nNumero(s):" + qtd;
	}

	/*
	 * E-Consulta por paciente
	 */
	public List<Consulta> listaConsultasPorPaciente(String p1) {
		List<Consulta> col1;

		col1 = new ArrayList<Consulta>();

		for (Consulta c : col) {
			if (c.getPaciente().equals(p1)) {
			}

			col1.add(c);
		}
		return col1;
	}
}
// * ColeçãoConsultas
// A-adicionaConsulta,
// B-qtdConsultasData,
// C-listagemConsultas,
// D-qtdConsultasPorMedico,
// E-listaConsultasPorPaciente.

