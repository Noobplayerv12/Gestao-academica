package application;

import java.util.*;

import entities.*;

public class Program {
	static ArrayList<Setor_Universidade> setores = new ArrayList<Setor_Universidade>();
	static Scanner sc = new Scanner(System.in);
	static Pessoa pessoa = new Pessoa();

	public static void main(String[] args) {

		//criação dos setores
		Setor_Universidade setor1 = new Setor_Universidade(1, "Financeiro");
		Setor_Universidade setor2 = new Setor_Universidade(2, "Recursos Humanos");
		Setor_Universidade setor3 = new Setor_Universidade(3, "Secretaria Acadêmica");
		Setor_Universidade setor4 = new Setor_Universidade(4, "Serviços Gerais");
		
		setores.add(setor1);
		setores.add(setor2);
		setores.add(setor3);
		setores.add(setor4);

		Integer codigo = -1;
		while (codigo != 3) {
			//menu
			System.out.println("O que você é? (1 - aluno ou 2 - Funcionário 3 - Cancelar)");
			codigo = sc.nextInt();
			sc.nextLine();
			if(codigo == 1){
				codigo = -1;
				//criação de alunos
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o cpf do aluno: ");
				String cpf = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o email do aluno: ");
				String email = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o telefone do aluno: ");
				String telefone = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite a matricula do aluno: ");
				String matricula = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o curso do aluno: ");
				String curso = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				Alunos aluno = new Alunos(nome, cpf, email, telefone, matricula, curso);
				System.out.println("Aluno cadastrado com sucesso!");
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("CPF: "+aluno.getCpf());
				System.out.println("Email: "+aluno.getEmail());
				System.out.println("Telefone: "+aluno.getTelefone());
				System.out.println("Matricula: "+aluno.getMatricula());
				System.out.println("Curso: "+aluno.getCurso());
	
				pessoa = aluno;
			} else if(codigo == 2){	
				//criação de funcionários
				codigo = -1;	
				System.out.println("Digite o nome do funcionario: ");
				String nomeFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o cpf do funcionario: ");
				String cpfFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o email do funcionario: ");
				String emailFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o telefone do funcionario: ");
				String telefoneFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o Numero de registro do funcionario: ");
				String numeroRegistroFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("Digite o cargo do funcionario: ");
				String cargoFuncionario = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				System.out.print("Escolha o setor do funcionário:\n0 - Cadastrar novo setor\n");
				for (Setor_Universidade setor : setores) {
					System.out.println(setor.getIdSetor() + " - " + setor.getNomeSetor());
				}
				Integer setor = 0;
				do {
					setor = sc.nextInt();
					sc.nextLine();

					//criação de um novo setor para o funcionário
					if(setor != 0){
						for (Setor_Universidade setor_Universidade : setores) {
							if(setor == setor_Universidade.getIdSetor()){
								Funcionarios funcionario = new Funcionarios(nomeFuncionario, cpfFuncionario, emailFuncionario, telefoneFuncionario, numeroRegistroFuncionario, cargoFuncionario, setor_Universidade);
								System.out.println("Funcionario cadastrado com sucesso!");
								System.out.println("Nome: "+funcionario.getNome());
								System.out.println("CPF: "+funcionario.getCpf());
								System.out.println("Email: "+funcionario.getEmail());
								System.out.println("Telefone: "+funcionario.getTelefone());
								System.out.println("Numero de registro: "+funcionario.getNumeroRegistro());
								System.out.println("Cargo: "+funcionario.getCargo());
								System.out.println("Setor: "+funcionario.getSetor().getNomeSetor());
								pessoa = funcionario;
								System.out.println("O que você deseja fazer? (1 - Cadastrar novo Setor 2 - Cadastrar novo Processo 3 - Cancelar)");
								codigo = sc.nextInt();
								sc.nextLine();
								oQueFazer(codigo);
							}
						}
					} else if (setor > setores.size() || setor < 0) {
						System.out.print("\nSetor não cadastrado!\n");
						setor = 0;
					} 
					else {
						System.out.println("Digite o nome do novo setor: ");
						String nomeSetor = sc.nextLine();
						System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
						Setor_Universidade setorUniversidade = new Setor_Universidade(setores.size()+1,nomeSetor);
						setores.add(setorUniversidade);
						Funcionarios funcionario = new Funcionarios(nomeFuncionario, cpfFuncionario, emailFuncionario, telefoneFuncionario, numeroRegistroFuncionario, cargoFuncionario, setorUniversidade);
						System.out.println("Funcionario cadastrado com sucesso!");
						System.out.println("Nome: "+funcionario.getNome());
						System.out.println("CPF: "+funcionario.getCpf());
						System.out.println("Email: "+funcionario.getEmail());
						System.out.println("Telefone: "+funcionario.getTelefone());
						System.out.println("Numero de registro: "+funcionario.getNumeroRegistro());
						System.out.println("Cargo: "+funcionario.getCargo());
						System.out.println("Setor: "+funcionario.getSetor().getNomeSetor());
						pessoa = funcionario;
						System.out.println("O que você deseja fazer? (1 - Cadastrar novo Setor 2 - Cadastrar novo Processo 3 - Cancelar)");
						codigo = sc.nextInt();
						sc.nextLine();
						oQueFazer(codigo);
					}
				}
				while (setor > setores.size() || setor < 0);

			} else if (codigo == 3){
				System.out.println("Obrigado por utilizar o sistema!");
				System.exit(0);
			} else {
				System.out.println("Opção inválida!\nInforme novamente.");
			}
		}

		sc.close();
	}

	public static void oQueFazer(int codigo){
		while (codigo != 3) {
			if(codigo == 1){
				System.out.println("Digite o nome do novo setor: ");
				String nomeSetor = sc.nextLine();
				System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
				Setor_Universidade setorNovo = new Setor_Universidade(setores.size()+1, nomeSetor);
				setores.add(setorNovo);
				System.out.println("Setor cadastrado com sucesso!");
				System.out.println("Nome: "+setorNovo.getNomeSetor());
				
			} else if(codigo == 2){

				System.out.println("Digite o número do Processo:");
				int numero = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite a finalidade:");
				String finalidade= sc.nextLine();
				System.out.println("Digite a descrição:");
				String descricao = sc.nextLine();

				Date dataEntrada = new Date();

				Processos processo = new Processos(numero, finalidade, descricao, dataEntrada, pessoa);
				while (codigo != 0) {
					codigo = -1;
					System.out.print("Escolha o setor de destino:\n");
					for (Setor_Universidade setor_Universidade : setores) {
						System.out.println(setor_Universidade.getIdSetor()+" - "+setor_Universidade.getNomeSetor());
					}
					System.out.print("0 - Cancelar\n");
					Integer idSetor = sc.nextInt();
					sc.nextLine();
					if(idSetor == 0){
						System.out.println("Processo cancelado!");
						break;
					} else {
						var verificaSetor = false;
						for (Setor_Universidade setor_Universidade : setores) {
							if(idSetor == setor_Universidade.getIdSetor()){
								processo.setSetor(setor_Universidade);
								System.out.println("Processo cadastrado com sucesso!");
								System.out.println("Número: "+processo.getNumero());
								System.out.println("Finalidade: "+processo.getFinalidade());
								System.out.println("Descrição: "+processo.getDescricao());
								System.out.println("Data de entrada: "+processo.getDataEntrada());
								System.out.println("Setor: "+processo.getSetor().getNomeSetor());
								verificaSetor = true;
							}
						}
						if ( !verificaSetor ) {
							System.out.println("Setor não encontrado!");
						} else {
							break;
						}
					}
				}
			}
			else if(codigo == 3){
				System.out.println("Cancelado!");
				break;
			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

}
