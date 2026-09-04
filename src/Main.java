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