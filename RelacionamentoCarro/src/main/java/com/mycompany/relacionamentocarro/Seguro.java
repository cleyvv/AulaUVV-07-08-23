/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamentocarro;

/**
 *
 * @author alunodev08
 */
public class Seguro {
    private Carro carro; // Referência para a classe Carro
    private Cliente cliente; // Referência para a classe Cliente
    private double valor;
    private String vigencia;

    // Construtor da classe Seguro
    public Seguro(Carro carro, Cliente cliente, double valor, String vigencia) {
        this.carro = carro; // Atribuição do carro e cliente recebidos como parâmetros
        this.cliente = cliente;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
}
