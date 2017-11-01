package com.empresa;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		Funcionario funcionario = new Funcionario();
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[5];
//		System.out.println("Digite seu nome: ");
//		funcionario.setNome(teclado.nextLine());
//
//		System.out.println("Digite seu CPF: ");
//		funcionario.setCpf(teclado.nextInt());
//
//		System.out.println("Digite seu RG: ");
//		funcionario.setRg(teclado.nextInt());
//
//		System.out.println("Digite seu Departamento: ");
//		funcionario.setDepartamento(teclado.next());
//
//		System.out.println("Digite seu Salário: ");
//		funcionario.setSalario(teclado.nextFloat());
//
//		System.out.println("Dia: ");
//		funcionario.setDia(teclado.nextInt());
//
//		System.out.println("Mes: ");
//		funcionario.setMes(teclado.nextInt());
//
//		System.out.println("Ano: ");
//		funcionario.setAno(teclado.nextInt());
		System.out.println("Nome da empresa: ");
		empresa.setNome("Arthur Enterprises");
		
		System.out.println("CPNJ da empresa: ");
		empresa.setCnpj((long) 123123123);
		
		for(int i = 0; i <= 4; i++ ){
			Funcionario f1 = new Funcionario();
			if(i == 0){
			f1.setNome("Arthur");
				if(i > 0){
					f1.setNome(teclado.nextLine());
				}
			} else {
				f1.setNome("chapolin"+(i+1));
			}
			f1.setCpf(i+1);
			f1.setRg(i+1);
			f1.setDepartamento("Dept"+(i+1));
			f1.setSalario(500);
			f1.setDia(22);
			f1.setMes(8);
			f1.setAno(1996);
			empresa.adiciona(f1);
			System.out.println(empresa.contem(f1));
		}
		
		empresa.mostraEmpregados();
		empresa.mostraInformacoesEmpregados();
	}
}
