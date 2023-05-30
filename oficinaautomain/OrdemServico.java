/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinaautomain;

/**
 *
 * @author Newadas
 */
 class OrdemServico {
    public  String numeroViatura;
    private String descricao;

    public OrdemServico(String numeroViatura, String descricao) {
        this.numeroViatura = numeroViatura;
        this.descricao = descricao;
    }

    public String getNumeroViatura() {
        return numeroViatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Ordem de Serviço [Número da Viatura: " + numeroViatura + ", Descrição: " + descricao + "]";
    }
}

