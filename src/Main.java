import br.com.cineflow.modelos.Filme;
import br.com.cineflow.modelos.Plano;
import br.com.cineflow.modelos.Usuario;

import java.util.Scanner;

public class Main {

  static void main(String[] args) {

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

    System.out.println("Bem vindo, " + pessoa.getNomeDoUsuario() +  "!!");

    System.out.println("Plano atual: " + plano.getNomeDoPlano());
    System.out.println("-----------------------------------");


    topGun.setNome("Top Gun");
    topGun.setDescricao("Ases Indomáveis, Pete Mitchell (Tom Cruise), um jovem piloto, ingressa na Academia Aérea para se tornar piloto de caça.");
    topGun.setAnoDeLancamento(2024);
    topGun.nota1DoFilme = 9.2;
    topGun.nota2DoFilme = 8.9;

    duna.setNome("Duna");
    duna.setDescricao("Duna é uma famosa obra de ficção científica criada por Frank Herbert que se passa no inóspito planeta desértico Arrakis.");
    duna.setAnoDeLancamento(2021);
    duna.nota1DoFilme = 9.0;
    duna.nota2DoFilme = 8.0;

    vingadores.setNome("Vingadores");
    vingadores.setDescricao("Os heróis mais poderosos da Terra precisam unir forças para impedir uma ameaça capaz de colocar todo o planeta em perigo.");
    vingadores.setAnoDeLancamento(2012);
    vingadores.nota1DoFilme = 9.1;
    vingadores.nota2DoFilme = 7.7;

    barbie.setNome("Barbie");
    barbie.setDescricao("Barbie deixa o mundo perfeito da Barbielândia e parte para o mundo real em busca de respostas sobre sua existência.");
    barbie.setAnoDeLancamento(2023);
    barbie.nota1DoFilme = 9.7;
    barbie.nota2DoFilme = 5.8;

    oppenheimer.setNome("Oppenheimer");
    oppenheimer.setDescricao("A história do físico J. Robert Oppenheimer e sua participação no desenvolvimento da primeira bomba atômica durante o Projeto Manhattan.");
    oppenheimer.setAnoDeLancamento(2023);
    oppenheimer.nota1DoFilme = 8.5;
    oppenheimer.nota2DoFilme = 7.4;

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

      filmeSelecionado.calcularNota();
      filmeSelecionado.exibeFichaFilme();

      System.out.println("-----------------------------------");

      System.out.println("-----------------------------------");
      System.out.println("1 -Voltar ao menu?");
      System.out.println("2 -Fechar o sistema?");

      int opcoesDepoisDoFilme = scanner.nextInt();

      if(opcoesDepoisDoFilme == 1){
        continue;
      } else if(opcoesDepoisDoFilme == 2){
        System.out.println("Volte Sempre!!");
        break;
      }else{
        System.out.println("Opçao invalida");
      }


    }



      scanner.close();

  }
}