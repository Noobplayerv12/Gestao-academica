package application;

import java.util.*;

import entities.*;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// #region Cadastrar setores

		Setor_Universidade setor1 = new Setor_Universidade(1, "Financeiro");
		Setor_Universidade setor2 = new Setor_Universidade(2, "Recursos Humanos");
		Setor_Universidade setor3 = new Setor_Universidade(3, "Secretaria Acadêmica");
		Setor_Universidade setor4 = new Setor_Universidade(4, "Servicos Gerais");

		// #endregion

		// #region Cadastrar aluno ou funcionário
		System.out.println("O que você é? (1 - aluno ou 2 - Professor)");
		Integer codigo = sc.nextInt();
		sc.nextLine();

		if (codigo == 1) {

			Alunos aluno1 = new Alunos("Thiago", "4545489945", "thiagodasilvasantos.tss@gmail.com", "65456456456",
					"54445", "sistemas de informaçao");

			System.out.println("Digite o número do Processo:");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite a finalidade:");
			String finalidade = sc.nextLine();
			System.out.println("Digite a descrição:");
			String descricao = sc.nextLine();
			Date dataEntrada = new Date();
			System.out.print(
					"Escolha o setor de destino:\n 1 - Financeiro \n 2 - RH \n 3 - Secretaria Acadêmica \n 4 - Serviços Gerais\n");
			Integer idSetor = sc.nextInt();
			sc.nextLine();

			Processo processo = new Processo(numero, finalidade, descricao, dataEntrada, aluno1, idSetor);
			switch (idSetor) {
				case 1:
					setor1.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor1.getNomeSetor());
					break;
				case 2:
					setor2.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor2.getNomeSetor());
					break;
				case 3:
					setor3.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor3.getNomeSetor());
					break;
				case 4:
					setor4.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor4.getNomeSetor());
					break;
				default:
					System.out.println("Setor não encontrado");
					;
			}
			// Encaminha processo
			setor1.encaminharProcesso(processo, setor2);

			// #endregion
		} else if (codigo == 2) {

			Funcionarios professor = new Funcionarios("Joao", "05511612132", "joao@gmail.com", "7154545646",
					"35332332", "Professor");

			System.out.println("Digite o número do Processo:");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite a finalidade:");
			String finalidade = sc.nextLine();
			System.out.println("Digite a descrição:");
			String descricao = sc.nextLine();
			Date dataEntrada = new Date();
			System.out.print(
					"Escolha o setor de destino:\n 1 - Financeiro \n 2 - RH \n 3 - Secretaria Acadêmica \n 4 - Serviços Gerais\n");
			Integer idSetor = sc.nextInt();
			sc.nextLine();

			Processo processo = new Processo(numero, finalidade, descricao, dataEntrada, professor, idSetor);
			switch (idSetor) {
				case 1:
					setor1.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor1.getNomeSetor());

					break;
				case 2:
					setor2.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor2.getNomeSetor());

					break;
				case 3:
					setor3.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor3.getNomeSetor());

					break;
				case 4:
					setor4.addProcesso(processo);
					System.out.println("Processo encaminhado para o setor: " + setor4.getNomeSetor());

					break;
				default:
					System.out.println("Setor não encontrado");
					;
			}

			setor1.encaminharProcesso(processo, setor2);

			sc.close();
		}

	}

}
