import br.com.cineflow.modelos.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Usuario pessoa = new Usuario();

        Plano plano = new Plano();

        Filme topGun = new Filme(
                "Top Gun",
                "Tony Scott",
                "Ação",
                "Pete Mitchell, um jovem piloto, ingressa na academia aérea para se tornar piloto de caça.",
                1986,
                110
        );

        Filme duna = new Filme(
                "Duna",
                "Denis Villeneuve",
                "Ficção científica",
                "Paul Atreides viaja para Arrakis, planeta desértico essencial para o futuro de sua família e do império.",
                2021,
                155
        );

        Filme vingadores = new Filme(
                "Os Vingadores",
                "Joss Whedon",
                "Ação",
                "Um grupo de heróis precisa unir forças para impedir uma ameaça capaz de colocar a Terra em perigo.",
                2012,
                143
        );

        Filme barbie = new Filme(
                "Barbie",
                "Greta Gerwig",
                "Comédia",
                "Barbie deixa a Barbielândia e parte para o mundo real em busca de respostas sobre sua existência.",
                2023,
                114
        );

        Filme oppenheimer = new Filme(
                "Oppenheimer",
                "Christopher Nolan",
                "Drama",
                "A história do físico J. Robert Oppenheimer e sua participação no desenvolvimento da primeira bomba atômica.",
                2023,
                180
        );

        Serie gameOfThrones = new Serie(
                "Game of Thrones",
                "Fantasia",
                "Famílias nobres disputam o controle do Trono de Ferro enquanto uma ameaça cresce no norte.",
                2011,
                8,
                73
        );

        Serie theOffice = new Serie(
                "The Office",
                "Comédia",
                "Funcionários de uma empresa de papel têm seu cotidiano acompanhado por uma equipe de documentário.",
                2005,
                9,
                201
        );

        Serie simpsons = new Serie(
                "The Simpsons",
                "Animação e comédia",
                "A família Simpson vive situações cotidianas e satiriza diversos aspectos da sociedade americana.",
                1989,
                37,
                800
        );

        Serie vikings = new Serie(
                "Vikings",
                "Drama histórico",
                "Ragnar Lothbrok e outros guerreiros nórdicos exploram novas terras e enfrentam disputas por poder.",
                2013,
                6,
                89
        );

        Serie suits = new Serie(
                "Suits",
                "Drama jurídico",
                "Mike Ross começa a trabalhar em um grande escritório de advocacia ao lado de Harvey Specter apesar de esconder um segredo.",
                2011,
                9,
                134
        );

        pessoa.setNomeDoUsuario("Fabricio");
        plano.setNomeDoPlano("normal");

        System.out.println("Este é o CineFLow");
        System.out.println("-----------------------------------");
        System.out.println("Bem vindo, " + pessoa.getNomeDoUsuario() + "!!");

        System.out.println("Plano atual: " + plano.getNomeDoPlano());
        System.out.println("-----------------------------------");


        System.out.println("O que gostaria de ver?");
        System.out.println("1 - Filmes");
        System.out.println("2 - Séries");
        System.out.println("-----------------------------------");

        String opcaoDeTitulo = scanner.nextLine();

        if (opcaoDeTitulo.equals("1")) {
            Menu.exibeFilmes(
                    scanner,
                    topGun,
                    duna,
                    vingadores,
                    barbie,
                    oppenheimer
            );
        } else if (opcaoDeTitulo.equals("2")) {
            Menu.exibeSeries(
                    scanner,
                    gameOfThrones,
                    theOffice,
                    simpsons,
                    vikings,
                    suits
            );
        }

        scanner.close();
    }
}


