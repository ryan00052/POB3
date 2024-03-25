package faeterj;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		int matricula = 0;
		String nome = "", email = "", cpf = "";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno.");
		System.out.print(">> ");
		nome = sc.next();
		
		System.out.println("Digite o email do aluno.");
		System.out.print(">> ");
		email = sc.next();
		
		System.out.println("Digite o nome do cpf.");
		System.out.print(">> ");
		cpf = sc.next();
		
		System.out.println("Digite a matrícula do aluno.");
		System.out.print(">> ");
		matricula = sc.nextInt();
		
		sc.close();
		Aluno aluno = new Aluno(matricula, nome, email, cpf);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Email: " + aluno.getEmail());
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Aluno: " + aluno.toString());
	}

}
