
package G;


import java.util.Scanner;

public class MainConsultorio {

	private static Scanner sc;

	/*
	 * Sao 3 metodos um menu principal para chamar interagir com os outros
	 * metodos
	 */
	public static String menu() {
		return "-------------MENU-------------\n"
				+ "1 - Menu Paciente \n"
				+ "2 - Menu Médico \n"
				+ "3 - Menu Consulta \n"
				+ "4 - SAIR \n"
				+ "Digite a Opção desejada: ";
	}

	// * metodo para menu Paciente
	public static String menuPaciente() {
		return "-------------MENU DO PACIENTE-------------\n"
				+ "1 - Adicionar paciente \n"
				+ "2 - Pesquisar paciente pelo número do documento \n"
				+ "3 - Remover paciente pelo número do documento \n"
				+ "4 - Listar quantidade de pacientes pelo sexo \n"
				+ "5 - Listar os pacientes com endereço cadastrado \n" 
				+ "6 - Listar pacientes maiores de 60 anos\n"
				+ "7 - Sair do Menu Paciente \n" + "Digite a Opção desejada: ";
	}

	// Metodo Medico
	public static String menuMedico() {
		return "-------------MENU DO MÉDICO-------------\n"
				+ "1 - Adicionar Médico \n"
				+ "2 - Pesquisar médico pelo CRM \n"
				+ "3 - Pesquisar médico por parte do nome \n"
				+ "4 - Sair do Menu Médico \n"
				+ "Digite a Opção desejada: ";
	}

	// Metodo Consulta
	public static String menuConsulta() {
		return "-------------MENU CONSULTA-------------\n" 
	+ "1 - Adicionar Consulta \n"
				+ "2 - Listar a quantidade de consulta pela data \n" 
				+ "3 - Listar todas as consultas \n"
				+ "4 - Listar as consultas de um determinado médico \n"
				+ "5 - Listar as consultas de um determinado paciente \n"
				+ "6 - Sair do Menu Consulta \n"
				+ "Digite a Opção desejada: ";
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int opcao;
		ColecaoConsultas colecaoConsultas = new ColecaoConsultas();
		ColecaoDeMedico colecaoMedicos = new ColecaoDeMedico();
		ColecaoDePacientes colecaoPacientes = new ColecaoDePacientes();

		// MENU
		do {
			System.out.println(menu());
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				do {

					System.out.println(menuPaciente());
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						sc.nextLine();
						System.out.println("****Dados do Paciente***** \n");
						System.out.println("Digite o CPF: \n");
						String cpf1 = sc.nextLine();
						System.out.println("Digite o Nome: \n");
						String nomePac1 = sc.nextLine();
						System.out.println("Digite o sexo:\n");
						String sexo1 = sc.nextLine();
						System.out.println("Digite o CEP da Rua : \n");
						String cep1 = sc.nextLine();
						System.out.println("Digite a Rua : \n");
						String rua1 = sc.nextLine();
						System.out.println("Digite o Bairro: \n");
						String bairro1 = sc.nextLine();
						System.out.println("Digite Complemento: \n");
						String complemento1 = sc.nextLine();
						System.out.println("Digite a Data de nascimento: Ex: XX.XX.XXXX \n");
						String nascimento1 = sc.nextLine();

						Endereco e1 = new Endereco(cep1, rua1, bairro1, complemento1);
						Paciente p1 = new Paciente(cpf1, nomePac1, sexo1, e1, nascimento1);

						colecaoPacientes.adicionarPaciente(p1);
						System.out.println("Paciente adicionado com sucesso!");

						break;

					case 2:
						sc.nextLine();
						System.out.println("Digite o CPF do Paciente: ");
						String cpf = sc.nextLine();
						System.out.println(colecaoPacientes.pesquisaPeloDocumento(cpf));

						break;

					case 3:
						sc.nextLine();
						System.out.println("Digite o CPF do Paciente: ");
						String cpf11 = sc.nextLine();
						boolean teste = colecaoPacientes.removePeloDocumento(cpf11);

						if (teste == true) {
							System.out.println("Removido com sucesso!");
						} else {
							System.out.println("Não pode ser removido ou não existe.");
						}
						break;

					case 4:
						sc.nextLine();
						System.out.println("Digite qual sexo deseja listar: ");
						String sexo = sc.nextLine();
						System.out.println("Quantidade de pacientes: " 
						+ colecaoPacientes.qtdPacientesPorSexo(sexo) + ".");

						break;

					case 5:
						System.out.println(colecaoPacientes.listagemPacientesComEndereço());

						break;
					case 6:
						System.out.println(colecaoPacientes.listagemDePacientesMaioresDe60anos());

						break;
					case 7:
						opcao=7;
						break;

					default:
						System.out.println("Você digitou uma opção Invalida!");
						break;

					}
				} while (opcao != 7);
				break;

			case 2:
				do {
					System.out.println(menuMedico());
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						sc.nextLine();
						System.out.println("Digite o nome do Médico: ");
						String nomeMed1 = sc.nextLine();
						System.out.println("Digite o CRM do Médico: ");
						String crm1 = sc.nextLine();
						System.out.println("Digite a especialidade do Médico: ");
						String especialidade1 = sc.nextLine();

						Medico m1 = new Medico(crm1, nomeMed1, especialidade1);
						colecaoMedicos.adicionaMédico(m1);
						System.out.println("Médico adicionado com sucesso!");

						break;

					case 2:
						sc.nextLine();
						System.out.println("Digite o número do CRM do médico: ");
						String crm = sc.nextLine();
						System.out.println(colecaoMedicos.pesquisaPeloCRM(crm));
						break;

					case 3:
						sc.nextLine();
						System.out.println("Digite parte do nome do médico: ");
						String parteDoNome = sc.nextLine();
						System.out.println(colecaoMedicos.pesquisaMedicoPorParteDoNome(parteDoNome));
						break;

					case 4:
						opcao = 5;
						break;

					default:
						System.out.println("Você digitou uma opção Invalida!");
						break;

					}

				} while (opcao != 5);

				break;
			case 3:
				do {
					System.out.println(menuConsulta());
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						sc.nextLine();
						System.out.println("Digite o CPF do paciente: ");
						String cpf = sc.nextLine();
						System.out.println("Digite o Nome: ");
						String nomePac = sc.nextLine();
						System.out.println("Digite o sexo:");
						String sexo = sc.nextLine();
						System.out.println("Digite o CEP: ");
						String cep = sc.nextLine();
						System.out.println("Digite a Rua: ");
						String rua = sc.nextLine();
						System.out.println("Digite o Bairro: ");
						String bairro = sc.nextLine();
						System.out.println("Digite o Complemento: ");
						String complemento = sc.nextLine();
						System.out.println("Digite a data de nascimento: Ex: XX.XX.XXXX\n");
						String nascimento = sc.nextLine();

						Endereco e = new Endereco(cep, rua, bairro, complemento);
						Paciente p = new Paciente(cpf, nomePac, sexo, e, nascimento);

						colecaoPacientes.adicionarPaciente(p);
						System.out.println("**********Dados do Medico************");
						System.out.println("Digite o nome do Médico: ");
						String nomeMed = sc.nextLine();
						System.out.println("Digite o CRM: ");
						String crm = sc.nextLine();
						System.out.println("Digite a especialidade: ");
						String especialidade = sc.nextLine();

						Medico m = new Medico(crm, nomeMed, especialidade);
						colecaoMedicos.adicionaMédico(m);

						System.out.println("Digite a data: ");
						String data = sc.nextLine();
						System.out.println("Digite a hora: ");
						String hora = sc.nextLine();
						Consulta c = new Consulta(p, m, data, hora);
						colecaoConsultas.adicionaConsulta(c);

						System.out.println("Consulta adicionada com sucesso!");

						break;

					case 2:
						sc.nextLine();
						System.out.println("Digite a data: ");
						String data1 = sc.nextLine();
						System.out.println("Quantidade de consultas: "
						+ colecaoConsultas.qtdConsultasData(data1) + ".");

						break;

					case 3:
						System.out.println(colecaoConsultas.listagemConsultas());
						break;

					case 4:
						sc.nextLine();
						System.out.println("Digite o nome completo do médico: ");
						String nomeMed1 = sc.nextLine();
						Medico m1 = colecaoMedicos.pesquisarPorNome(nomeMed1);
						System.out.println("Quantidade de consulta: "+colecaoConsultas.qtdConsultasPorMedico(m1)+".");

						break;

					case 5:
						sc.nextLine();
						System.out.println("Digite o cpf do paciente: ");
						String cpf1 = sc.nextLine();
						String p1 = colecaoPacientes.pesquisaPeloDocumento(cpf1);
						System.out.println(colecaoConsultas.listaConsultasPorPaciente(p1));

						break;

					case 6:
						break;

					default:
						System.out.println("Você digitou uma opção Invalida!");
						break;

					}
				} while (opcao != 6);
				break;

			case 4:
				opcao=4;
				break;

			default:
				System.out.println("Você digitou uma opção Invalida!");
				break;

			}
		} while (opcao != 4);

	}

}
