package dataBaseReference.View;
import java.math.BigDecimal;
import java.util.Scanner;

import dataBaseReference.System.Controller;
import dataBaseReference.System.DataBaseType;

public class App {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Programa de Acesso a Banco de Dados");
        System.out.println("Versão: 1.0");
        System.out.println("Última Atualização: 5/11/23");
        System.out.println("\nEste programa foi desenvolvido como parte do Projeto II da disciplina SI400 - Programação Orientada a Objetos II, ministrada pelo Prof. André F. de Angelis, no Oferecimento 2S2023.");
        System.out.println("\nObjetivo:");
        System.out.println("O objetivo deste programa é permitir operações de inserção, leitura, atualização e remoção (CRUD) em um banco de dados relacional MariaDB que está sendo executado remotamente em um servidor Linux. Durante a fase de desenvolvimento, estamos utilizando um banco de teste em memória para facilitar testes, garantindo que o servidor principal não seja afetado.");
        System.out.println("\nPor favor, selecione uma das opções abaixo para continuar a execução:");

        Controller controller = new Controller(DataBaseType.MEMORY);
        controller.openConnection();

        Menu.mainMenu();

        System.out.println("Programa finalizado.");
    }

}
