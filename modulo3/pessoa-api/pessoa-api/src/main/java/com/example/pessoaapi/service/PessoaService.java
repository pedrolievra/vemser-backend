package com.example.pessoaapi.service;

import com.example.pessoaapi.entity.Pessoa;
import com.example.pessoaapi.repository.PessoaRepository;
import java.util.List;

public class PessoaService {
    private PessoaRepository pessoaRepository;
//ENCAMINHA A CHAMADA E RECEBE PASSOS VALORES
    //REGRAS DE NEGOCIOS
    public PessoaService(){
        pessoaRepository = new PessoaRepository();
    }

    public Pessoa create(Pessoa pessoa){
        return pessoaRepository.create(pessoa);
    }

    public List<Pessoa> list(){
        return pessoaRepository.list();
    }

    public Pessoa update(Integer id,
                         Pessoa pessoaAtualizar) throws Exception{
        return pessoaRepository.update(id, pessoaAtualizar);
    }
    public void delete(Integer id) throws Exception{
        pessoaRepository.delete(id);
    }
    public List<Pessoa> listByName(String nome){
        return pessoaRepository.listByName(nome);
    }
}
