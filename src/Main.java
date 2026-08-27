import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    
    Scanner scanner = new Scanner(System.in);


    char tipoDePlano ; 
    int valorPagoAtualEmDolar = 4;
    double valorDoPlanoEmReal = (double) valorPagoAtualEmDolar * 5.15;
    
    if (valorDoPlanoEmReal >= 39.90) {
      tipoDePlano = 'A';
    } else if (valorDoPlanoEmReal >= 29.90) {
      tipoDePlano = 'B';
    } else {
      tipoDePlano = 'C';
    }


    
    String nomeDoFilme1 = "Top Gun";
    String nomeDoFilme2 = "Duna";
    String nomeDoFilme3 = "Vingadores";
    String nomeDoFilme4 = "Barbie";
    String nomeDoFilme5 = "Oppenhaimer";
    
    String nomeDoFilme = "";
    double nota1DoFilme = 0;
    double nota2DoFilme = 0;
    double notaGeralDoFilme = 0  ;
    int estrelas = 0  ; 
    int anoDeLancamento = 0 ;

    
    System.out.println("Este é o screenMatch");
    System.out.println("Escolha um dos seguintes filmes: \n" +
    "1 - " + nomeDoFilme1 + "\n" +
    "2 - " + nomeDoFilme2 + "\n" +
    "3 - " + nomeDoFilme3 + "\n" +
    "4 - " + nomeDoFilme4 + "\n" +
    "5 - " +  nomeDoFilme5);
    
    int filmeEscolhido = scanner.nextInt();

    switch(filmeEscolhido) {

      case 1 :
         
         nomeDoFilme = nomeDoFilme1;
         nota1DoFilme =9.4;
         nota2DoFilme =7.4;
         anoDeLancamento = 2022;
       
        break;
        
      case 2 :
        
         nomeDoFilme = nomeDoFilme2;
         nota1DoFilme =10.0;
         nota2DoFilme =6.8;
         anoDeLancamento = 2023;

        break; 
      
      case 3 : 

         nomeDoFilme = nomeDoFilme3;
         nota1DoFilme =9.1;
         nota2DoFilme =7.7;
         anoDeLancamento = 2026;

        break;
      
      case 4 :

         nomeDoFilme = nomeDoFilme4;
         nota1DoFilme =9.7;
         nota2DoFilme =5.8;
         anoDeLancamento = 2025;
 
        break;

      case 5 :

        nomeDoFilme = nomeDoFilme5;
        nota1DoFilme =8.5;
        nota2DoFilme =7.4;
        anoDeLancamento = 2024;
        
        break;

      default:
     
      System.out.println("Filme inválido");
      scanner.close();
      return; 
        
      }
 

    notaGeralDoFilme = (nota2DoFilme + nota1DoFilme) / 2;
    estrelas = (int) notaGeralDoFilme / 2;

    System.out.println("-----------------------------------");
    System.out.println("Filme: " + nomeDoFilme + 
    "\nAno de lançamento: " + anoDeLancamento + "\nNota do filme: " + notaGeralDoFilme + " É um filme: " + estrelas + " Estrelas" );
    
    if (notaGeralDoFilme >= 8) {
      System.out.println("É um bom filme, com boas avaliaçoes");
    } else if (notaGeralDoFilme >=5) {
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

 scanner.close();










  }
}