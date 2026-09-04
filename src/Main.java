import br.com.cineflow.modelos.Filme;
import br.com.cineflow.modelos.Plano;
import br.com.cineflow.modelos.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      Usuario pessoa = new Usuario();

      Plano plano = new Plano();

      Filme topGun = new Filme();
      Filme duna = new Filme();
      Filme vingadores = new Filme();
      Filme barbie = new Filme();
      Filme oppenheimer = new Filme();
      Filme filmeSelecionado = null;

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

      } else if (opcaoDeTitulo.equals("2")) {
        opcaoDeTitulo = "Series";
      } 

      public void exibeFilmes() {


        String fecharSistema = "Sair do sistema";

        int opcaoDeFilme = 0;

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
                    filmeSelecionado.calcularNota(8.5);
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

            System.out.println("-----------------------------------");
            System.out.println("1 -Voltar ao menu?");
            System.out.println("2 -Fechar o sistema?");

            int opcoesDepoisDoFilme = scanner.nextInt();

            if (opcoesDepoisDoFilme == 1) {
                continue;
            } else if (opcoesDepoisDoFilme == 2) {
                System.out.println("Volte Sempre!!");
                break;
            } else {
                System.out.println("Opçao invalida");
            }


        scanner.close();
    }
    }
