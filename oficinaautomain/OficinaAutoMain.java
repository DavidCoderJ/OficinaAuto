/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oficinaautomain;

import java.util.Scanner;

/**
 *
 * @author Newadas
 */
public class OficinaAutoMain {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n----- OFICINA AUTO -----");
            System.out.println("1. Criar Ordem de Serviço");
            System.out.println("2. Atualizar Ordem de Serviço");
            System.out.println("3. Ver Lista de Viaturas");
            System.out.println("4. Consultar Ordem de Serviço");
            System.out.println("5. Remover Ordem de Serviço");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> oficina.criarOrdemServico();
                case 2 -> oficina.atualizarOrdemServico();
                case 3 -> oficina.verListaViaturas();
                case 4 -> oficina.consultarOrdemServico();
                case 5 -> oficina.removerOrdemServico();
                case 6 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Digite novamente.");
            }
        }
    }
}

