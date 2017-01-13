package G;

import java.util.List;
import java.util.ArrayList;

public class ColecaoDeMedico {
	// atributos

	private List<Medico> col;

	// construtor
	/*
	 * incializa a colecao de medico
	 */

	public ColecaoDeMedico() {
		col = new ArrayList<Medico>();

	}

	// metodos
	// a -adicionar
	/**
	 * este metodo responsavel paa adicionar medico
	 * 
	 * @param m
	 *            medico
	 */

	public void adicionaMédico(Medico m) {

		col.add(m);

	}

	// b -Pesquisa pelo CRM
	/**
	 * este metodo resonsavel por pesqisar crm
	 * 
	 * @param CRM1
	 */
	public String pesquisaPeloCRM(String CRM1) {
		for (Medico m : col) {
			if (m.getCRM().equals(CRM1)) {

				return m.toString();
			}

		}

		return "Medico Nao encontrado";
	}

	// C- pesquisa por parte do nome
	/**
	 * este metodo responsavel por pesqisar medico por parte do nome
	 * 
	 * @param nome
	 */
	public List<Medico> pesquisaMedicoPorParteDoNome(String nome) {
		List<Medico> col1;
		col1 = new ArrayList<Medico>();

		for (Medico m : col) {
			if (m.getNome().contains(nome)) {

				col1.add(m);
			}
		}
		return col1;

	}

	// D pesquisaPorNome
	/**
	 * este metodo responsavel por pesusar o nome completo do medico
	 * 
	 * @param nome
	 */
	public Medico pesquisarPorNome(String nome) {
		for (Medico m : col) {
			if (m.getNome().equals(nome)) {
				return m;
			}
		}
		return null;
	}
}

// *ColeçãoMédicos, com os seguintes métodos:
// A adicionaMédico,
// B pesquisaPeloCRM,
// C pesquisaMédicoPorParteDoNome.
// D pesquisaPorNome
