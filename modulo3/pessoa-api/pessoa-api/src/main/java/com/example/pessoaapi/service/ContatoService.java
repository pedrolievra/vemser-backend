package com.example.pessoaapi.service;

import com.example.pessoaapi.entity.Contato;
import com.example.pessoaapi.repository.ContatoRepository;
import com.example.pessoaapi.repository.PessoaRepository;
import java.util.List;

public class ContatoService {
    private ContatoRepository contatoRepository;
    //ENCAMINHA A CHAMADA E RECEBE PASSOS VALORES
    //REGRAS DE NEGOCIOS
    public ContatoService(){
        contatoRepository = new ContatoRepository();
    }

    public Contato create(Contato contato){
        return contatoRepository.create(contato);
    }

    public List<Contato> list(){
        return contatoRepository.list();
    }

    public Contato update(Integer id,
                          Contato contatoAtualizar) throws Exception{
        return contatoRepository.update(id, contatoAtualizar);
    }
    public void delete(Integer id) throws Exception{
        contatoRepository.delete(id);
    }
    public List<Contato> listByName(String nome){
        return contatoRepository.listByName(nome);
    }
}
