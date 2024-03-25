package faeterj;

public class Aluno {
	int matricula;
	String nome, email, cpf;
	
	public Aluno(int matricula, String nome, String email, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
