public class Main {

  public static void main(String[] args){

    String nomeDoFilme = "Top Gun";
    int notaDoFilme = 4;
    int anoDeLancamento = 2022;
    boolean inluidoNoPlano = false;


    System.out.println("Este é o screenMatch");
    System.out.println("Filme: " + nomeDoFilme + " Ano de lançamento: " + anoDeLancamento + " Nota do filme: " + notaDoFilme);
    if (inluidoNoPlano) {
      System.out.println("Esta incluido no seu plano");
    } else {
      System.out.println("Infelizmente nao esta incluido no seu plano");
    }

    if (notaDoFilme >= 8) {
      System.out.println("É um bom filme, com boas avaliaçoes");
    } else if (notaDoFilme >=5) {
      System.out.println("É um filme mediano, com avaliçoes medias");
    } else {
      System.out.println("O filme não tem boas avaliaçoes");
    }










  }
}