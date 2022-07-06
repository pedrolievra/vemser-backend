package com.example.pessoaapi.repository;

import com.example.pessoaapi.entity.Contato;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ContatoRepository {
    private static List<Contato> listaContatos = new ArrayList<>();
    private AtomicInteger COUNTER = new AtomicInteger();

    public ContatoRepository() {
        listaContatos.add(new Contato(COUNTER.incrementAndGet() /*1*/, COUNTER.incrementAndGet() /*1*/, "92 99292929292", "Residencial", "Line"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet() /*2*/, COUNTER.incrementAndGet() /*2*/, "92 9939393939", "Comercial", "Whatsapp"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet() /*3*/, COUNTER.incrementAndGet() /*3*/, "92 99191919191", "Residencial", "Viber"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet() /*4*/, COUNTER.incrementAndGet() /*4*/, "92 99494949494", "Comercial", "Telegram"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet() /*5*/, COUNTER.incrementAndGet() /*5*/, "92 99595959595", "Residencial", "Gb Whatsapp"));
    }

    public Contato create(Contato contato) {
        contato.setIdContato(COUNTER.incrementAndGet());
        listaContatos.add(contato);
        return contato;
    }

    public List<Contato> list() {
        return listaContatos;
    }

    public Contato update(Integer id,
                          Contato contatoAtualizar) throws Exception {
        Contato contatoRecuperado = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        contatoRecuperado.setIdContato(contatoAtualizar.getIdContato());
        contatoRecuperado.setDescricao(contatoAtualizar.getDescricao());
        contatoRecuperado.setNumero(contatoAtualizar.getNumero());
        contatoRecuperado.setTipo(contatoAtualizar.getTipo());
        return contatoRecuperado;
    }//BANCO DE DADOS = REPOSUTORY

    public void delete(Integer id) throws Exception {
        Contato contatoRecuperado = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("COntato não encontrado"));
        listaContatos.remove(contatoRecuperado);
    }

    public List<Contato> listByName(String nome) {
        return listaContatos.stream()
                .filter(contato -> contato.getTipo().toUpperCase().contains(nome.toUpperCase()))
                .collect(Collectors.toList());
    }
}