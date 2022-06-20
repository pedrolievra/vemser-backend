import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um estado: Amazonas, Sao Paulo ou Rio Grande do Sul?");
        String nomeDoEstado = scanner.nextLine();

        if (nomeDoEstado.equals("Amazonas")) {
            System.out.println("Manaus e PF");
            String cidade = scanner.nextLine();
            if (cidade.equals("Manaus")) {
                System.out.println("Manaus, nos bancos do Rio Negro no noroeste do Brasil, é a capital do vasto estado do Amazonas. Trata-se de um ponto de partida importante próximo à Floresta Amazônica. A leste da cidade, o Rio Negro, escuro, converge para o Rio Solimões, barrento, resultando em um fenômeno visual incrível chamado de \"Encontro das Águas\". A combinação dos afluentes forma o Rio Amazonas.");
            } else {
                System.out.println("A cultura folclórica de Presidente Figueiredo surge por meio do contato entre culturas distintas, das migrações e dos meios de comunicação. A festa acontece na Vila de Balbina durante o mês de novembro, quando é ressaltado o pescado da região, por meio de concursos de pescaria, gastronomia e escolha da rainha do lago.");
            }
        }

        if (nomeDoEstado.equals("Rio Grande do Sul")) {
            System.out.println("Porto Alegre ou Sao Leopoldo");
            String cidadeSul = scanner.nextLine();
            if (cidadeSul.equals("Porto Alegre")) {
                System.out.println("Porto Alegre é a capital do estado de Rio Grande do Sul, no sul do Brasil. Na praça principal, a Praça Marechal Deodoro, encontra-se a Catedral Metropolitana, de estilo renascentista, com murais religiosos no exterior. O Palácio Piratini, de estilo neoclássico, é a sede do governo estadual. O Theatro São Pedro, do século XIX, fica nas proximidades. A cidade é conhecida como uma porta de entrada para os enormes desfiladeiros do Parque Nacional de Aparados da Serra.");
            } else {
                System.out.println("População total (est. IBGE/2016): 229,678 hab\n" +
                        "Aniversário: 25 de julho\n" +
                        "Fundação: 25 de julho de 1824 (197 anos)\n" +
                        "PIB per capita ((BR: 940º - IBGE/2013): R$ 250000000\n");
            }
        }
        if (nomeDoEstado.equals("Sao Paulo")) {
            System.out.println("Sao Paulo ou Osasco?");
            String cidadeSP = scanner.nextLine();
            if (cidadeSP.equals("Sao Paulo")) {
                System.out.println("São Paulo, centro financeiro do Brasil, está entre as cidades mais populosas do mundo, com diversas instituições culturais e uma rica tradição arquitetônica. Há prédios simbólicos como a catedral neogótica, o Edifício Martinelli, um arranha-céu inaugurado em 1929, e o Edifício Copan, com suas linhas curvas projetadas pelo arquiteto modernista Oscar Niemeyer. A igreja em estilo colonial do Pátio do Colégio marca o local onde os padres jesuítas fundaram a cidade em 1554");
            } else {
                System.out.println("Osasco é um município brasileiro localizado na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil. Nascido como um bairro da capital paulista no final do século XIX, tornou-se município emancipado após um plebiscito em 1962. Ocupa uma área de 64,954 km², e sua população estimada no ano de 2021 era de 701 428 habitantes, sendo o 8º mais populoso do estado de São Paulo");
            }
        }
    }
}