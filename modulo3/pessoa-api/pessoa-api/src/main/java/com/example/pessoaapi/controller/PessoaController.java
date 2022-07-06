package com.example.pessoaapi.controller;

import com.example.pessoaapi.entity.Pessoa;
import com.example.pessoaapi.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private PessoaService pessoaService;

    public PessoaController() {
        pessoaService = new PessoaService ();
    }

    @GetMapping("/hello") //localhost:8080/pessoa/hello
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello2") //localhost:8080/pessoa/hello
    public String hello2() {
        return "Hello World! 2";
    } //adiciona barraas no site

    @GetMapping("/byname")
    public List<Pessoa> listByName(@RequestParam("nome") String nome){
        return pessoaService.listByName(nome);
    }

    @PostMapping() //localhost:8080/pessoa
    public Pessoa create(@RequestBody Pessoa pessoa){
        return pessoaService .create(pessoa);
    }

    @GetMapping //localhost:8080/pessoa/hello
    public List<Pessoa> list(){
        return pessoaService .list();
    }

    @PutMapping("/{idPessoa}") //localhost:8080/pessoa/1000
    public Pessoa update(@PathVariable("idPessoa") Integer id,
                         @RequestBody Pessoa pessoaAtualizar) throws Exception{
        return pessoaService.update(id, pessoaAtualizar);
    }

    @DeleteMapping("/{idPessoa}") //localhost:8080/pessoa/10
    public void delete(@PathVariable("idPessoa") Integer id) throws Exception{
        pessoaService.delete(id);
    }
}
