package com.empresa;

public class Empresa {

	private String nome;
	private Long cnpj;
	Funcionario[] empregados;
	int livre = 0;

	public Empresa() {
	}

	public Empresa(String nome, Long cnpj, Funcionario[] empregados) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public Funcionario getEmpregados(int posicao) {
		return this.empregados[posicao];
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void adiciona(Funcionario f) {
		this.empregados[this.livre] = f;
		livre++;
	}

	public void mostraEmpregados() {
		for (int i = 0; i <= empregados.length - 1; i++) {
			System.out.println("Nome do funcionário: " + this.empregados[i].getNome() + "\n\n");
		}
	}

	public void mostraInformacoesEmpregados() {
		for (int i = 0; i <= empregados.length - 1; i++) {
			System.out.println("ID: " + this.empregados[i].getIdentificador());
			System.out.println("Nome do funcionário: " + this.empregados[i].getNome());
			System.out.println("Digite seu CPF: " + this.empregados[i].getCpf());
			System.out.println("Digite seu RG: " + this.empregados[i].getRg());
			System.out.println("Digite seu Departamento: " + this.empregados[i].getDepartamento());
			System.out.println("Digite seu Salário: " + this.empregados[i].getSalario());
			System.out.println("Dia: " + this.empregados[i].getDia());
			System.out.println("Mes: " + this.empregados[i].getMes());
			System.out.println("Ano: " + this.empregados[i].getAno() + "\n\n");
		}
	}

	public boolean contem(Funcionario f) {
		boolean valido = false;
		for (int i = 0; i <= this.empregados.length - 1;) {
			if (f == empregados[i]) {
				return valido = true;
			} else {
				return valido = false;
			}
		}
		return valido;
	}

	@Override
	public String toString() {
		return "Nome da empresa: " + nome + ", CNPJ: " + cnpj;
	}
}