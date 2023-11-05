package databasemenu;

import java.util.Scanner;

public class App {

	private static void start(){
		System.out.println("Boas vindas ao Projeto II da disciplina de Programação orientada a objetos II!\n");
		System.out.println("\nEsse projeto consiste em um programa que realiza operações do tipo CRUD em um banco de dados local\n");
		System.out.println("\nVersão: 1.1\n\nData da última atualização: 05/11/2023\n\n");
	}

	public static void main(String[] args) {
		start();

		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		int opcaoaux;
		
		do{
			System.out.println("1. Clientes");
            System.out.println("2. Pedidos");
            System.out.println("3. Relatórios");
            System.out.println("4. Informações");
            System.out.println("5. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = leitor.nextInt();
            
            switch (opcao) {
            case 1:
            	System.out.println("\n-----------------CLIENTES-----------------\n");
            	System.out.println("1. Inserir clientes");
            	System.out.println("2. Consultar cliente pelo identificador");
            	System.out.println("3. Consultar cliente pelo nome");
            	System.out.println("4. Apagar cliente pelo identificador");
            	System.out.print("Selecione uma opção: ");
            	opcaoaux = leitor.nextInt();
            	
            	switch (opcaoaux) {
            	case 1:
            		//inserirCliente();
            		break;
            	case 2:
            		//consultaCliente1();
            		break;
            	case 3:
            		//consultaCliente2();
            		break;
            	case 4:
            		//apagarCliente();
            		break;
            	}
            	
            	break;
            case 2:
            	System.out.println("\n-----------------PEDIDOS-----------------\n");
            	System.out.println("1. Inserir pedido para um cliente");
            	System.out.println("2. Consultar pedido pelo cliente");
            	System.out.println("3. Apagar pedido pelo numero");
            	System.out.print("Selecione uma opção: ");
            	opcaoaux = leitor.nextInt();
            	
            	switch (opcaoaux) {
            	case 1:
            		//inserirPedido();
            		break;
            	case 2:
            		//consultaPedido();
            		break;
            	case 3:
            		//apagarPedido();
            		break;
            	}
            	
            	break;
            case 3:
            	System.out.println("\n-----------------RELATÓRIOS-----------------\n");
            	System.out.println("1. Clientes ordenados por identificador");
            	System.out.println("2. Clientes ordeados por nome");
            	System.out.println("3. Pedidos ordenados por número");
            	System.out.println("4. Pedidos dos clientes ordenados por nome");
            	System.out.print("Selecione uma opção: ");
            	opcaoaux = leitor.nextInt();
            	
            	switch (opcaoaux) {
            	case 1:
            		//listarClientes1();
            		break;
            	case 2:
            		//listarClientes2();
            		break;
            	case 3:
            		//listarPedidos1();
            		break;
            	case 4:
            		//listarPedidos2();
            		break;
            	}
            	
            	break;
            case 4:
            	System.out.println("\n-----------------INFORMAÇÕES-----------------\n");
            	System.out.println("1. Ajuda");
            	System.out.println("2. Sobre");
            	System.out.print("Selecione uma opção: ");
            	opcaoaux = leitor.nextInt();
            	
            	switch (opcaoaux) {
            	case 1:
            		System.out.println("\n-----------------AJUDA-----------------\n");
					System.out.println("\n\nEsse programa consiste em um projeto para a matéria de Programação Orientada a Objetos II\n\n");
					System.out.println("Ele realiza operações do tipo CRUD em um banco de dados local. Isso é, operações de "
					+ "inserção, leitura, atualização e remoção de dados.\n\n");
            		break;
            	case 2:
            		System.out.println("\n-----------------Sobre-----------------\n");
					System.out.println("Versão: 1.1\n\nDesenvolvido por:\nPedro Henrique - RA: 260871\n\n");
            		break;
            	}
            	
            	break;
            }
            	
		} while(opcao != 5);
		leitor.close();
	}

}
