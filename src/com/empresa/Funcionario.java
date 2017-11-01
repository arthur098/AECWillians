package com.empresa;

public class Funcionario extends Data {
	private int cpf;
	private int rg;
	private String departamento;
	private String nome;
	private float salario;
	private float bonificacao;
	private static int proximoFuncionario = 0;
	private int identificador = ++proximoFuncionario;

	public Funcionario() {
	}

	public Funcionario(int cpf, int rg, String departamento, String nome, float salario, float bonificacao,
			int identificador, int dia, int mes, int ano) {

		super(dia, mes, ano);
		this.cpf = cpf;
		this.rg = rg;
		this.departamento = departamento;
		this.nome = nome;
		this.salario = salario;
		this.bonificacao = bonificacao;
		this.identificador = ++proximoFuncionario;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public float getCpf() {
		return cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public float getRg() {
		return rg;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setBonificacao(float bonificacao) {
		this.bonificacao = bonificacao;
	}

	public float getBonificacao() {
		return bonificacao;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void recebeAumento(float bonificacao) {
		this.salario += bonificacao;
	}

	public float calculaGanhoAnual() {
		return salario * 12;
	}

	public String toString() {
		return "Funcionario[ Id: " + identificador + "Nome: " + nome + ", CPF: " + cpf + ", RG: " + rg + ", Departamento: " + departamento
				+ " Salário: " + salario + " e" + super.toString();
	}
}
