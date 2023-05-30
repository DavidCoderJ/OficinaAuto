/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficinaautomain;

/**
 *
 * @author Newadas
 */
public class Cliente {
    private final String nome;
    private final Endereco endereco;
    private final String contato;

    public Cliente(String nome, Endereco endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }
}
