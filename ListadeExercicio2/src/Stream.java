import java.util.*;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
        public static void main(String[] args) {
            List<Pessoa> lista = new ArrayList<>();
            int i = 0;
            lista.add(new Pessoa(++i, "Paulo", 6500, "Desenvolvedor"));
            lista.add(new Pessoa(++i, "Pedro", 5300, "Desenvolvedor"));
            lista.add(new Pessoa(++i, "Joel", 6000, "Arquiteto"));
            lista.add(new Pessoa(++i, "Henrique", 1000, "Estagiário"));
            lista.add(new Pessoa(++i, "Gabriel", 1000, "Estagiário"));
            lista.add(new Pessoa(++i, "Gustavo", 18000, "Diretor"));

            System.out.println(lista);

            List<PessoaNomeId> pessoasNomeId = (List<PessoaNomeId>) lista.stream()
                    .filter(pessoa -> pessoa.getSalario() > 5000)
                    .map(pessoa -> {
                        return new PessoaNomeId(pessoa.getId(), pessoa.getNome());
                    })
                    .collect(Collectors.toList());

            System.out.println(pessoasNomeId);

            Double media = lista.stream()
                    .mapToDouble(Pessoa::getSalario)
                    .average()
                    .getAsDouble();
            System.out.println(media);

            boolean todosGanham5000 = lista.stream()
                    .allMatch(pessoa -> pessoa.getSalario() > 5000);
            System.out.println(todosGanham5000);

            boolean alguemGanha = lista.stream()
                    .anyMatch(pessoa -> pessoa.getSalario() >= 60000);
            System.out.println(alguemGanha);

            Map<Integer,String> meuMapaDePessoasPorId = lista.stream()
                    .collect(Collectors.toMap(Pessoa::getId, Pessoa::getNome));
            System.out.println(meuMapaDePessoasPorId);

            static boolean filtrarLista(Pessoa pessoa){
                return pessoa.getNome().contains("e");
            }
        }
    static class Pessoa {
        private int id;
        private String nome;
        private double salario;
        private String cargo;

        public Pessoa(int id, String nome, double salario, String cargo) {
            this.id = id;
            this.nome = nome;
            this.salario = salario;
            this.cargo = cargo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }



            //1- listar todas as pessoas

            //2- filtrar todas as pessoas com salario maior do que 5 mil

            //3- filtrar todas as pessoas que são desenvolvedoras e organizar por salário crescente

            //4- fazer a média salarial de todos

            //5- verificar na lista (utilizando o método anyMatch) se tem alguém que ganha mais do que 20 mil

            //6 - retornar uma lista de todos os ids das pessoas

            //7 - criar uma nova classe Salario com ID e Salário, utilizando a função "map" do stream, retornar uma lista desse novo objeto

            //8- retornar um Map contendo os ids e os nomes dos colaboradores

            //9- com o mapa da 8, retornar o nome com o id=2
        }