package com.example.pessoaapi.entity;

import java.time.LocalDate;

public class Contato {
    public Integer idPessoa;
    public Integer idContato;
    public String numero;
    public String tipo;
    public String descricao;
    //REPRESENTACAO DE TABELA


    public Contato(Integer idPessoa, Integer idContato, String numero, String tipo, String descricao) {
        this.idPessoa = idPessoa;
        this.idContato = idContato;
        this.numero = numero;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer getIdContato() {
        return idContato;
    }

    public void setIdContato(Integer idContato) {
        this.idContato = idContato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "idContato=" + idContato +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
