package application;

import java.util.*;

import entities.*;

public class Program {

	public static void main(String[] args) {

		//criação dos setores

		Setor_Universidade setor1 = new Setor_Universidade(1, "Financeiro");
		Setor_Universidade setor2 = new Setor_Universidade(2, "Recursos Humanos");
		Setor_Universidade setor3 = new Setor_Universidade(3, "Secretaria Acadêmica");
		Setor_Universidade setor4 = new Setor_Universidade(4, "Serviós Gerais");
		Pessoa pessoa = new Pessoa();

		Scanner sc = new Scanner(System.in);
		System.out.println("O que você é? (1 - aluno ou 2 - Professor)");
		Integer codigo = sc.nextInt();
		sc.nextLine();

		if(codigo == 1){
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
			Funcionarios funcionario = new Funcionarios(nomeFuncionario, cpfFuncionario, emailFuncionario, telefoneFuncionario, numeroRegistroFuncionario, cargoFuncionario);
			
			System.out.println("Funcionario cadastrado com sucesso!");
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println("CPF: "+funcionario.getCpf());
			System.out.println("Email: "+funcionario.getEmail());
			System.out.println("Telefone: "+funcionario.getTelefone());
			System.out.println("Nº Registro: "+funcionario.getNumeroRegistro());
			System.out.println("Cargo: "+funcionario.getCargo());

			pessoa = funcionario;
		} else{
			System.out.println("Código invalido");
		}

		System.out.print("Escolha o setor de destino:\n 1 - Financeiro \n 2 - RH \n 3 - Secretaria Acadêmica \n 4 - Serviços Gerais\n");
		Integer idSetor = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o número do Processo:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a finalidade:");
    	String finalidade= sc.nextLine();
		System.out.println("Digite a descrição:");
    	String descricao = sc.nextLine();

    	Date dataEntrada = new Date();

		Processos processo = new Processos(numero, finalidade, descricao, dataEntrada, pessoa);
		
		switch(idSetor){
			case 1: 
				setor1.adcionarProcesso(processo);
				System.out.println("Processo adicionado com sucesso!");
				System.out.println("Número do processo: "+processo.getNumero());
				System.out.println("Finalidade: "+processo.getFinalidade());
				System.out.println("Descrição: "+processo.getDescricao());
				System.out.println("Data de entrada: "+processo.getDataEntrada());
				System.out.println("Setor: "+processo.getSetor().getNomeSetor());
				
				break;
			case 2: 
				setor2.adcionarProcesso(processo);
				setor2.returnProcessos();
				break;
			case 3: 
				setor3.adcionarProcesso(processo);
				setor3.returnProcessos();
				break;
			case 4: 
				setor4.adcionarProcesso(processo);
				setor4.returnProcessos();
				break;
			default:
				System.out.println("Setor não encontrado");
			;
		}



		sc.close();
	}

}
