package application;

import java.util.Scanner;

import entities.*;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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
		Funcionarios funcionarios = new Funcionarios(nomeFuncionario, cpfFuncionario, emailFuncionario, telefoneFuncionario, numeroRegistroFuncionario, cargoFuncionario);
		sc.close();
		System.out.println("Funcionario cadastrado com sucesso!");
		System.out.println("Nome: "+funcionarios.getNome());
		System.out.println("CPF: "+funcionarios.getCpf());
		System.out.println("Email: "+funcionarios.getEmail());
		System.out.println("Telefone: "+funcionarios.getTelefone());
		System.out.println("Nº Registro: "+funcionarios.getNumeroRegistro());
		System.out.println("Cargo: "+funcionarios.getCargo());
	}

}
