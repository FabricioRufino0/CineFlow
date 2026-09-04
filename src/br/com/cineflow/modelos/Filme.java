package br.com.cineflow.modelos;


public class Filme extends Titulo {

    int duracaoEmMinutos;
    private String Diretor;

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Filme super(String nome, String diretor, String genero, String descricao,
                 int anoDeLancamento, int duracaoEmMinutos) {
        this.diretor = diretor;
        this.duracaoEmMinutos= duracaoEmMinutos;
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
}
