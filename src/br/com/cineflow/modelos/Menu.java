package br.com.cineflow.modelos;

import java.util.Scanner;

public class Menu {

    public static void exibeFichaDoFilme(Filme filme) {
        System.out.println("\n-----------------------------------");
        System.out.println("Filme: " + filme.getNome() + "\nDescriçao do filme: " + filme.getDescricao() +
                "\nAno de lançamento: " + filme.getAnoDeLancamento()  + "\nNota do filme: " + filme.calculaMediaFilme() + " É um filme: " + filme.calculaEstrelas() + " Estrelas");

    }

    public static void exibeFichaDaSerie(Serie serie) {
        System.out.println("\n-----------------------------------");
        System.out.println("Série: " + serie.getNome() + " Temporadas: " + serie.getTemporadas() + " Episodios: " + serie.getEpisodiosTotais() + "\nDescriçao da série: " + serie.getDescricao() +
                "\nAno de lançamento: " + serie.getAnoDeLancamento()  + "\nNota da série: " +  serie.calculaMediaFilme() + " É uma série " + serie.calculaEstrelas() + " Estrelas");

    }

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

            System.out.println("Filmes no CineFlow");
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
                    exibeFichaDoFilme(filmeSelecionado);
                    int escolhaDentroDoMenu;
                    System.out.println("-----------------------------------");
                    System.out.println("O que fazer a seguir?");
                    System.out.println("1 - voltar ao menu de filmes");
                    System.out.println("2 - Fechar CineFlow");
                    escolhaDentroDoMenu = scanner.nextInt();
                    if (escolhaDentroDoMenu == 1) {
                        continue;
                    } else {
                        return;
                    }

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
        public static void exibeSeries(
                Scanner scanner,
                Serie gameOfThrones,
                Serie theOffice,
                Serie simpsons,
                Serie vikins,
                Serie suits
        )   {
            Serie serieSelecionada = null;
            int opcaoDeSerie = 0;
            String fecharSistema = "Sair do sistema";
            while (opcaoDeSerie != 6) {

                System.out.println("Séries no CineFlow");
                System.out.println("-----------------------------------");
                System.out.println("Escolha um dos seguintes filmes: \n" +
                        "1 - " + gameOfThrones.getNome() + "\n" +
                        "2 - " + theOffice.getNome() + "\n" +
                        "3 - " + simpsons.getNome() + "\n" +
                        "4 - " + vikins.getNome() + "\n" +
                        "5 - " + suits.getNome() + "\n" +
                        "6 - " + fecharSistema);

                opcaoDeSerie = scanner.nextInt();
                if (opcaoDeSerie == 6) {
                    System.out.println("Saindo.....");
                    break;
                }

                switch (opcaoDeSerie) {

                    case 1:
                        serieSelecionada = gameOfThrones;
                        break;

                    case 2:
                        serieSelecionada = theOffice;
                        break;

                    case 3:
                        serieSelecionada = simpsons;
                        break;

                    case 4:
                        serieSelecionada = vikins;
                        break;

                    case 5:
                        serieSelecionada = vikins;
                        break;

                    default:
                        System.out.println("Serie Invalida");
                        continue;
                }
                System.out.println("-----------------------------------");
                System.out.println("Você selecionou a serie: " + serieSelecionada.getNome());
                System.out.println("1 - Abrir ficha da serie");
                System.out.println("2 - Avaliar a serie");
                System.out.println("3 - Voltar ao menu");
                System.out.println("-----------------------------------");

                int escolhaDeMenu = 0;

                escolhaDeMenu = scanner.nextInt();

                switch (escolhaDeMenu) {
                    case 1:
                        exibeFichaDaSerie(serieSelecionada);
                        int escolhaDentroDoMenu;
                        System.out.println("-----------------------------------");
                        System.out.println("O que fazer a seguir?");
                        System.out.println("1 - voltar ao menu de series");
                        System.out.println("2 - Fechar CineFlow");
                        escolhaDentroDoMenu = scanner.nextInt();
                        if (escolhaDentroDoMenu == 1) {
                            continue;
                        }else{
                            return;
                        }

                    case 2:
                        System.out.println("Digite a nota que deseja dar para a serie: ");
                        double nota = scanner.nextDouble();

                        serieSelecionada.receberNota(nota);
                        serieSelecionada.exibeNotaRecebida();
                        break;

                    case 3:
                        continue;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }




        scanner.close();
    }
}
