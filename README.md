# CineFlow

Projeto de estudos desenvolvido para praticar Java, Programação Orientada a Objetos e organização de código por meio de um catálogo de filmes executado no terminal.

> **Status:** em desenvolvimento. O projeto acompanha meu progresso nos estudos e ainda possui funcionalidades e decisões de código que serão aprimoradas.

## Funcionalidades atuais

- Catálogo com cinco filmes cadastrados em memória.
- Menu interativo utilizando `Scanner`.
- Seleção de filmes por meio de `switch`.
- Exibição da ficha do filme com nome, descrição e ano de lançamento.
- Registro de avaliações para cada filme.
- Cálculo da média com base na soma e na quantidade de avaliações.
- Conversão da média em uma classificação visual de até cinco estrelas.
- Opções para retornar ao catálogo ou encerrar o programa.
- Interface web inicial criada separadamente com HTML e CSS.

## Progresso recente

O código foi reorganizado para aplicar melhor os conceitos de orientação a objetos:

- Os dados dos filmes foram encapsulados na classe `Filme`.
- Nome, descrição, ano, avaliações e classificação estão definidos como atributos privados.
- A própria classe `Filme` controla o recebimento das notas, o cálculo da média e a geração das estrelas.
- As classes `Usuario` e `Plano` também utilizam atributos privados com métodos de acesso.
- Os modelos foram organizados no pacote `br.com.cineflow.modelos`.
- O menu principal passou a utilizar os métodos das classes em vez de acessar diretamente seus atributos.

## Conceitos praticados

- Classes e objetos.
- Atributos e métodos.
- Encapsulamento.
- Getters e setters.
- Pacotes Java.
- Condicionais `if`, `else` e `switch`.
- Laços de repetição.
- Entrada de dados com `Scanner`.
- Acumulação de valores e cálculo de média.
- Git e GitHub.
- HTML e CSS.

## Estrutura do projeto

```text
CineFlow/
├── src/
│   ├── Main.java
│   └── br/com/cineflow/modelos/
│       ├── Filme.java
│       ├── Plano.java
│       └── Usuario.java
└── frontend/
    ├── index.html
    └── assets/
        ├── styles.css
        └── images/
```

## Como executar

### IntelliJ IDEA

1. Clone ou baixe o repositório.
2. Abra a pasta do projeto no IntelliJ IDEA.
3. Configure um JDK compatível.
4. Execute o método `main` localizado em `src/Main.java`.
5. Utilize o terminal para navegar pelo catálogo e avaliar os filmes.

### Terminal

Na pasta principal do projeto:

```bash
javac -d out src/Main.java src/br/com/cineflow/modelos/*.java
java -cp out Main
```

## Interface web

A pasta `frontend` contém a estrutura visual inicial do CineFlow, com HTML, CSS, imagens, cabeçalho e menu de navegação.

Atualmente, essa interface é estática e ainda não está integrada à aplicação Java executada no terminal.

## Limitações atuais

- Os filmes, o usuário e o plano ainda são criados diretamente na classe `Main`.
- Ao abrir uma ficha, uma nota fixa de teste ainda é adicionada ao filme.
- As notas informadas pelo usuário ainda não são validadas completamente.
- Entradas que não sejam números podem interromper a execução.
- As classes `Usuario` e `Plano` ainda possuem uma estrutura inicial e não estão relacionadas entre si.
- O tipo de plano ainda não altera o comportamento do sistema.
- Parte das responsabilidades permanece concentrada na classe `Main`.
- Os dados ficam apenas em memória.
- Não existe banco de dados.
- Não existem testes automatizados.
- O front-end ainda não se comunica com o Java.

## Próximos passos

- Corrigir o fluxo de avaliações e remover a nota fixa utilizada nos testes.
- Validar as opções do menu e as notas recebidas.
- Melhorar a divisão de responsabilidades da classe `Main`.
- Utilizar `Collections` para organizar o catálogo de filmes.
- Evoluir a relação entre usuários e planos.
- Aplicar tratamento de exceções.
- Praticar herança e polimorfismo.
- Criar testes automatizados.

Em uma etapa posterior, o projeto poderá evoluir para Spring Boot, API REST, JPA e PostgreSQL. Essas tecnologias fazem parte do planejamento e ainda não estão implementadas.
