package dataBaseReference.View;
import java.math.BigDecimal;
import java.util.Scanner;

import dataBaseReference.System.Controller;
import dataBaseReference.System.DataBaseType;

public class Menu {
    int opcao;
    int opcaoaux;

    public static void mainMenu(){
        Scanner leitor = new Scanner(System.in);

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
                clientMenu();
                    break;
                case 2:
                orderMenu();
                    break;
                case 3:
                reportMenu();
                    break;
                case 4:
                infoMenu();
                    break;
            }

        } while(opcao != 5);
    }

    public void clientMenu(){
                    System.out.println("\n-----------------CLIENTES-----------------\n");
                    System.out.println("1. Inserir clientes");
                    System.out.println("2. Consultar cliente pelo identificador");
                    System.out.println("3. Consultar cliente pelo nome");
                    System.out.println("4. Apagar cliente pelo identificador");
                    System.out.print("Selecione uma opção: ");
                    opcaoaux = leitor.nextInt();

                    switch (opcaoaux) {
                        case 1:
                            leitor.nextLine(); // Limpa a nova linha pendente
                            System.out.println("Insira o nome do cliente");
                            String nomeCliente = leitor.nextLine();
                            System.out.println("Insira a cidade do cliente");
                            String cidadeCliente = leitor.nextLine();
                            System.out.println("Insira o estado do cliente");
                            String estadoCliente = leitor.nextLine();
                            controller.insertCliente(nomeCliente, cidadeCliente, estadoCliente);
                            break;
                        case 2:
                            System.out.println("Insira o id do cliente que deseja consultar");
                            int idCliente = leitor.nextInt();
                            controller.requestCustomerById(idCliente);
                            break;
                        case 3:
                            leitor.nextLine(); // Limpa a nova linha pendente
                            System.out.println("Insira o nome do cliente que deseja consultar");
                            nomeCliente = leitor.nextLine();
                            controller.requestCustomerByName(nomeCliente);
                            break;
                        case 4:
                            System.out.println("Insira o id do cliente que deseja deletar");
                            idCliente = leitor.nextInt();
                            controller.deleteCustomerById(idCliente);
                            break;

                    }

    }

    public void orderMenu(){
                    System.out.println("\n-----------------PEDIDOS-----------------\n");
                    System.out.println("1. Inserir pedido para um cliente");
                    System.out.println("2. Consultar pedido pelo número");
                    System.out.println("3. Apagar pedido pelo numero");
                    System.out.print("Selecione uma opção: ");
                    opcaoaux = leitor.nextInt();

                    switch (opcaoaux) {
                        case 1:
                            System.out.println("Insira o ID do cliente");
                            int idCliente = leitor.nextInt();
                            leitor.nextLine(); // Consuma a nova linha deixada pelo próximoInt
                            System.out.println("Insira a descrição do pedido");
                            String descPedido = leitor.nextLine();
                            System.out.println("Insira o preço do pedido");
                            BigDecimal precoPedido = leitor.nextBigDecimal();
                            controller.insertPedido(idCliente, descPedido, precoPedido);
                            break;
                        case 2:
                            System.out.println("Insira o número do pedido");
                            int numeroPedido = leitor.nextInt();
                            controller.requestOrderByNumber(numeroPedido);
                            break;
                        case 3:
                            System.out.println("Insira o número do pedido");
                            numeroPedido = leitor.nextInt();
                            controller.deleteOrderByNumber(numeroPedido);
                            break;
                    }


                    break;
    }
    
    public void reportMenu(){
                    System.out.println("\n-----------------RELATÓRIOS-----------------\n");
                    System.out.println("1. Clientes ordenados por identificador");
                    System.out.println("2. Clientes ordeados por nome");
                    System.out.println("3. Pedidos ordenados por número");
                    System.out.println("4. Pedidos dos clientes ordenados por nome");
                    System.out.print("Selecione uma opção: ");
                    opcaoaux = leitor.nextInt();

                    switch (opcaoaux) {
                        case 1:
                            controller.requestClientsOrderedByID();
                            break;
                        case 2:
                            controller.requestClientsOrderedByName();
                            break;
                        case 3:
                            controller.requestOrdersOrderedByNumber();
                            break;
                        case 4:
                            controller.requestOrdersOrderedByCustomer();
                            break;
                    }

                    break;
    }

    public void infoMenu(){
                    System.out.println("\n-----------------INFORMAÇÕES-----------------\n");
                    System.out.println("1. Ajuda");
                    System.out.println("2. Sobre");
                    System.out.print("Selecione uma opção: ");
                    opcaoaux = leitor.nextInt();

                    switch (opcaoaux) {
                        case 1:
                            System.out.println("\n-----------------AJUDA-----------------\n");
                            System.out.println("Esse programa consiste em um projeto para a matéria de Programação Orientada a Objetos II");
                            System.out.println("Ele realiza operações do tipo CRUD em um banco de dados local. Isso é, operações de "
                                    + "inserção, leitura, atualização e remoção de dados.");
                            System.out.println("Digite os números apresentados pelo prompt de comando para realizar as ações desejadas\n");
                            break;
                        case 2:
                            System.out.println("\n-----------------Sobre-----------------\n");
                            System.out.println("Versão: 1.0\n\nDesenvolvido por:\nPedro Henrique - RA: 260871\nEric Vitta - RA: 260781\nGino Grippo - RA: 248301\nLucas Kauê - RA: 239794\nNathalia Vitória - RA: 222841\n\n");
                            break;
                    }
                    break;
    }
}
