package com.example.pessoaapi.controller;

import com.example.pessoaapi.entity.Contato;
import com.example.pessoaapi.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    private ContatoService contatoService;

    public ContatoController() {
        contatoService = new ContatoService ();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping()
    public Contato create(@RequestBody Contato contato){
        return contatoService .create(contato);
    }

    @GetMapping
    public List<Contato> list(){
        return contatoService .list();
    }

    @PutMapping("/{idContato}")
    public Contato update(@PathVariable("idContato") Integer id,
                         @RequestBody Contato contatoAtualizar) throws Exception{
        return contatoService.update(id, contatoAtualizar);
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer id) throws Exception{
        contatoService.delete(id);
    }
}
