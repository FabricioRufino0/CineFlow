import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Filme topGun = new Filme();
    Filme duna = new Filme();
    Filme vingadores = new Filme();
    Filme barbie = new Filme();
    Filme oppenheimer = new Filme();
    Filme filmeSelecionado = null;

    char tipoDePlano;
    int valorPagoAtualEmDolar = 4;
    double valorDoPlanoEmReal = valorPagoAtualEmDolar * 5.15;

    if (valorDoPlanoEmReal >= 39.90) {
      tipoDePlano = 'A';
    } else if (valorDoPlanoEmReal >= 29.90) {
      tipoDePlano = 'B';
    } else {
      tipoDePlano = 'C';
    }

    topGun.nome = "Top Gun";
    topGun.descricao = "Ases Indomáveis, Pete Mitchell (Tom Cruise), um jovem piloto, ingressa na Academia Aérea para se tornar piloto de caça.";
    topGun.anoDeLancamento = 2024;
    topGun.nota1DoFilme = 9.2;
    topGun.nota2DoFilme = 8.9;

    duna.nome= "Duna";
    duna.descricao = "Duna é uma famosa obra de ficção científica criada por Frank Herbert que se passa no inóspito planeta desértico Arrakis.";
    duna.anoDeLancamento = 2021;
    duna.nota1DoFilme = 9.0;
    duna.nota2DoFilme = 8.0;

    vingadores.nome = "Vingadores";
    vingadores.descricao = "Os heróis mais poderosos da Terra precisam unir forças para impedir uma ameaça capaz de colocar todo o planeta em perigo.";
    vingadores.anoDeLancamento = 2012;
    vingadores.nota1DoFilme = 9.1;
    vingadores.nota2DoFilme = 7.7;

    barbie.nome = "Barbie";
    barbie.descricao = "Barbie deixa o mundo perfeito da Barbielândia e parte para o mundo real em busca de respostas sobre sua existência.";
    barbie.anoDeLancamento = 2023;
    barbie.nota1DoFilme = 9.7;
    barbie.nota2DoFilme = 5.8;

    oppenheimer.nome = "Oppenheimer";
    oppenheimer.descricao = "A história do físico J. Robert Oppenheimer e sua participação no desenvolvimento da primeira bomba atômica durante o Projeto Manhattan.";
    oppenheimer.anoDeLancamento = 2023;
    oppenheimer.nota1DoFilme = 8.5;
    oppenheimer.nota2DoFilme = 7.4;

    String fecharSistema = "Sair do sistema";

    int opcao = 0;

    while (opcao != 6) {

      System.out.println("Este é o screenMatch");
      System.out.println("-----------------------------------");
      System.out.println("Escolha um dos seguintes filmes: \n" +
          "1 - " + topGun.nome + "\n" +
          "2 - " + duna.nome + "\n" +
          "3 - " + vingadores.nome + "\n" +
          "4 - " + barbie.nome+ "\n" +
          "5 - " + oppenheimer.nome + "\n" +
          "6 - " + fecharSistema);

      opcao = scanner.nextInt();

      if (opcao == 6) {
        System.out.println("Saindo.....");
        break;
      }

      switch (opcao) {

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


      String estrelasGeradas = "";

      double notaGeralDoFilme = (filmeSelecionado.nota1DoFilme + filmeSelecionado.nota2DoFilme) / 2;
      int estrelas = (int) notaGeralDoFilme / 2;

      int estrelasVazias = 5 - estrelas;
      String estrelasApagadas = "";

      for (int i = 0; i < estrelas; i++) {
        estrelasGeradas += "★";
      }
      for (int i = 0; i < estrelasVazias; i++) {
        estrelasApagadas += "☆";
      }

      System.out.println("\n-----------------------------------");
      System.out.println("Filme: " + filmeSelecionado.nome+ "\nDescriçao do filme: " + filmeSelecionado.descricao +
          "\nAno de lançamento: " + filmeSelecionado.anoDeLancamento + "\nNota do filme: " + notaGeralDoFilme + " É um filme: "
          + estrelasGeradas + estrelasApagadas + " Estrelas");

      if (notaGeralDoFilme >= 8) {
        System.out.println("É um bom filme, com boas avaliaçoes");
      } else if (notaGeralDoFilme >= 5) {
        System.out.println("É um filme mediano, com avaliçoes medias");
      } else {
        System.out.println("O filme não tem boas avaliaçoes");
      }

      System.out.println("-----------------------------------");

      if (tipoDePlano == 'A') {
        System.out.println("Esta incluido no seu plano");
      } else {
        System.out.println("Infelizmente nao esta incluido no seu plano");
      }

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

}}