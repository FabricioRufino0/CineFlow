import br.com.cineflow.modelos.Filme;
import br.com.cineflow.modelos.Plano;
import br.com.cineflow.modelos.Usuario;

import java.util.Scanner;

public class Main {

    public static void exibeFilmes(
            Scanner scanner,
            Filme topGun,
            Filme duna,
            Filme vingadores,
            Filme barbie,
            Filme oppenheimer
    ) {
        Filme filmeSelecionado = null;
        int opcaoDeFilme = 0;
        String fecharSistema = "Sair do sistema";
        while (opcaoDeFilme != 6) {

            System.out.println("Este é o screenMatch");
            System.out.println("-----------------------------------");
            System.out.println("Escolha um dos seguintes filmes: \n" +
                    "1 - " + topGun.getNome() + "\n" +
                    "2 - " + duna.getNome() + "\n" +
                    "3 - " + vingadores.getNome() + "\n" +
                    "4 - " + barbie.getNome() + "\n" +
                    "5 - " + oppenheimer.getNome() + "\n" +
                    "6 - " + fecharSistema);

            opcaoDeFilme = scanner.nextInt();
            if (opcaoDeFilme == 6) {
                System.out.println("Saindo.....");
                break;
            }

            switch (opcaoDeFilme) {

                case 1:
                    filmeSelecionado = topGun;
                    break;

                case 2:
                    filmeSelecionado = duna;
                    break;

                case 3:
                    filmeSelecionado = vingadores;
                    break;

                case 4:
                    filmeSelecionado = barbie;
                    break;

                case 5:
                    filmeSelecionado = oppenheimer;
                    break;

                default:
                    System.out.println("Filme inválido");
                    continue;
            }
            System.out.println("-----------------------------------");
            System.out.println("Você selecionou o filme: " + filmeSelecionado.getNome());
            System.out.println("1 - Abrir ficha do filme");
            System.out.println("2 - Avaliar o filme");
            System.out.println("3 - Voltar ao menu");
            System.out.println("-----------------------------------");

            int escolhaDeMenu = 0;

            escolhaDeMenu = scanner.nextInt();

            switch (escolhaDeMenu) {
                case 1:
                    filmeSelecionado.exibeFicha();
                    break;

                case 2:
                    System.out.println("Digite a nota que deseja dar para o filme: ");
                    double nota = scanner.nextDouble();

                    filmeSelecionado.receberNota(nota);
                    filmeSelecionado.exibeNotaRecebida();
                    break;

                case 3:
                    continue;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }

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

        pessoa.setNomeDoUsuario("Fabricio");
        plano.setNomeDoPlano("normal");

        System.out.println("Bem vindo, " + pessoa.getNomeDoUsuario() + "!!");

        System.out.println("Plano atual: " + plano.getNomeDoPlano());
        System.out.println("-----------------------------------");


        System.out.println("O que gostaria de ver?");
        System.out.println("1 - Filmes");
        System.out.println("2 - Séries");
        System.out.println("-----------------------------------");

        String opcaoDeTitulo = scanner.nextLine();

        if (opcaoDeTitulo.equals("1")) {
            exibeFilmes(
                    scanner,
                    topGun,
                    duna,
                    vingadores,
                    barbie,
                    oppenheimer
            );
        } else if (opcaoDeTitulo.equals("2")) {
            opcaoDeTitulo = "Series";
        }


        scanner.close();
    }
}


