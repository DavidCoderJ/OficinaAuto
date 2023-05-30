/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinaautomain;

/**
 *
 * @author Newadas
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Oficina {
    public  ArrayList<Viatura> viaturas;
    private final ArrayList<OrdemServico> ordensServico;
    OrdemServico ordemServico;

    public Oficina() {
        viaturas = new ArrayList<>();
        ordensServico = new ArrayList<>();
    }

    public void criarOrdemServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criando nova Ordem de Serviço...");

        System.out.print("Digite o número da viatura: ");
        String numeroViatura = scanner.nextLine();

        System.out.print("Digite a descrição do serviço: ");
        String descricao = scanner.nextLine();

        ordemServico = new OrdemServico(numeroViatura, descricao);
        ordensServico.add(ordemServico);

        System.out.println("Ordem de Serviço criada com sucesso.");
        
    }

    public void atualizarOrdemServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando Ordem de Serviço...");

        System.out.print("Digite o número da viatura: ");
        String numeroViatura = scanner.nextLine();

        OrdemServico ordemServico = buscarOrdemServico(numeroViatura);
        if (ordemServico == null) {
            System.out.println("Ordem de Serviço não encontrada.");
            return;
        }

        System.out.print("Digite a nova descrição do serviço: ");
        String novaDescricao = scanner.nextLine();

        ordemServico.setDescricao(novaDescricao);

        System.out.println("Ordem de Serviço atualizada com sucesso.");
    }

    public void verListaViaturas() {
        System.out.println("Lista de Viaturas:");
        for (OrdemServico ordemServicos : ordensServico) {
              System.out.println("" + ordemServicos);
            }      
        
    
    }

    public void consultarOrdemServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Consultando Ordem de Serviço...");

        System.out.print("Digite o número da viatura: ");
        String numeroViatura = scanner.nextLine();

        OrdemServico ordemServico = buscarOrdemServico(numeroViatura);
        if (ordemServico == null) {
            System.out.println("Ordem de Serviço não encontrada.");
            return;
        }

        System.out.println(ordemServico);
    }

    public void removerOrdemServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Removendo Ordem de Serviço...");

        System.out.print("Digite o número da viatura: ");
        String numeroViatura = scanner.nextLine();

        OrdemServico ordemServico = buscarOrdemServico(numeroViatura);
        if (ordemServico == null) {
            System.out.println("Ordem de Serviço não encontrada.");
            return;
        }

        ordensServico.remove(ordemServico);

        System.out.println("Ordem de Serviço removida com sucesso.");
    }

    public void registrarViatura(Viatura viatura) {
        viaturas.add(viatura);
        System.out.println("Viatura registrada com sucesso.");
    }

    public int getQuantidadeViaturasRegistradas() {
        return viaturas.size();
    }

    private Viatura buscarViatura(String numeroViatura) {
        for (Viatura viatura : viaturas) {
            if (viatura.getNumero().equals(numeroViatura)) {
                return viatura;
            }
        }
        return null;
    }

    private OrdemServico buscarOrdemServico(String numeroViatura) {
        for (OrdemServico ordemServico : ordensServico) {
            if (ordemServico.getNumeroViatura().equals(numeroViatura)) {
                return ordemServico;
            }
        }
        return null;
    }

    
}

