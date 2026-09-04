package br.com.cineflow.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosTotais;


    public void setEpisodiosTotais(int episodiosTotais) {
        this.episodiosTotais = episodiosTotais;
    }

    public int getEpisodiosTotais() {
        return episodiosTotais;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void exibeSerie() {
        topGun.setNome("Top Gun");
        topGun.setDescricao("Ases Indomáveis, Pete Mitchell (Tom Cruise), um jovem piloto, ingressa na Academia Aérea para se tornar piloto de caça.");
        topGun.setAnoDeLancamento(2024);

        duna.setNome("Duna");
        duna.setDescricao("Duna é uma famosa obra de ficção científica criada por Frank Herbert que se passa no inóspito planeta desértico Arrakis.");
        duna.setAnoDeLancamento(2021);


        vingadores.setNome("Vingadores");
        vingadores.setDescricao("Os heróis mais poderosos da Terra precisam unir forças para impedir uma ameaça capaz de colocar todo o planeta em perigo.");
        vingadores.setAnoDeLancamento(2012);


        barbie.setNome("Barbie");
        barbie.setDescricao("Barbie deixa o mundo perfeito da Barbielândia e parte para o mundo real em busca de respostas sobre sua existência.");
        barbie.setAnoDeLancamento(2023);


        oppenheimer.setNome("Oppenheimer");
        oppenheimer.setDescricao("A história do físico J. Robert Oppenheimer e sua participação no desenvolvimento da primeira bomba atômica durante o Projeto Manhattan.");
        oppenheimer.setAnoDeLancamento(2023);


        String fecharSistema = "Sair do sistema";

        int opcaoDeSerie = 0;

        while (opcaoDeSerie != 6) {

            System.out.println("Este é o screenMatch");
            System.out.println("-----------------------------------");
            System.out.println("Escolha uma das seguintes series: \n" +
                    "1 - " + topGun.getNome() + "\n" +
                    "2 - " + duna.getNome() + "\n" +
                    "3 - " + vingadores.getNome() + "\n" +
                    "4 - " + barbie.getNome() + "\n" +
                    "5 - " + oppenheimer.getNome() + "\n" +
                    "6 - " + fecharSistema);

            opcaoDeSerie = scanner.nextInt();

            if (opcaoDeSerie == 6) {
                System.out.println("Saindo.....");
                break;
            }

            switch (opcaoDeSerie) {

                case 1:
                    serieSelecionada = topGun;
                    break;

                case 2:
                    serieSelecionada = duna;
                    break;

                case 3:
                    serieSelecionada = vingadores;
                    break;

                case 4:
                    serieSelecionada = barbie;
                    break;

                case 5:
                    serieSelecionada = oppenheimer;
                    break;

                default:
                    System.out.println("Filme inválido");
                    continue;

            }


            System.out.println("-----------------------------------");
            System.out.println("Você selecionou o filme: " + serieSelecionada.getNome());
            System.out.println("1 - Abrir ficha do filme");
            System.out.println("2 - Avaliar o filme");
            System.out.println("3 - Voltar ao menu");
            System.out.println("-----------------------------------");

            int escolhaDeMenu = 0;

            escolhaDeMenu = scanner.nextInt();

            switch (escolhaDeMenu) {
                case 1:
                    serieSelecionada.calcularNota(8.5);
                    serieSelecionada.exibeFicha();
                    break;

                case 2:
                    System.out.println("Digite a nota que deseja dar para o filme: ");
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
    }
}
