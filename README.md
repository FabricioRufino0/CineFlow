# CineFlow

Projeto de estudos em evolução criado para praticar fundamentos de Java, Programação Orientada a Objetos e desenvolvimento web.

> **Status:** em desenvolvimento. Esta versão representa meu nível atual de aprendizado e ainda não é uma aplicação final.

## Objetivo

Construir, de forma incremental, um catálogo de filmes com usuários e planos. Cada atualização acompanha os conceitos estudados e aplica esses conhecimentos em um projeto próprio.

## O que funciona atualmente

### Aplicação Java no terminal

- Cadastro em memória de cinco filmes.
- Menu interativo utilizando `Scanner`.
- Seleção de filmes com `switch`.
- Repetição do menu com `while`.
- Exibição de nome, descrição e ano de lançamento.
- Cálculo da média de duas notas.
- Conversão da média para uma classificação visual de até cinco estrelas.
- Opções para retornar ao menu ou encerrar o programa.
- Classes separadas para `Filme`, `Usuario` e `Plano`.
- Uso inicial de pacotes, atributos privados, getters e setters.

### Interface web inicial

- Estrutura básica em HTML.
- Estilização em CSS.
- Logo, cabeçalho e menu de navegação.
- Identidade visual inicial do CineFlow.

A interface web ainda é estática e não está integrada à aplicação Java.

## Conceitos praticados

- Variáveis e tipos de dados.
- Condicionais `if` e `else`.
- `switch`.
- Laços de repetição.
- Entrada de dados com `Scanner`.
- Classes, objetos, atributos e métodos.
- Pacotes Java.
- Encapsulamento básico.
- Getters e setters.
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

### Pelo IntelliJ IDEA

1. Clone ou baixe o repositório.
2. Abra a pasta do projeto no IntelliJ IDEA.
3. Confirme que o JDK está configurado.
4. Execute o método `main` localizado em `src/Main.java`.
5. Utilize o terminal da aplicação para escolher um filme.

## Limitações conhecidas

- Os filmes, o usuário e o plano ainda são definidos diretamente no código.
- O plano é exibido, mas ainda não altera o acesso aos filmes.
- O encapsulamento ainda está sendo aplicado gradualmente.
- A entrada do usuário ainda não trata todos os valores inválidos.
- Não existe banco de dados ou persistência.
- O front-end ainda não possui funcionalidades e não se comunica com o Java.
- Ainda não existem testes automatizados.

## Próximos passos

- Finalizar o estudo e a aplicação de encapsulamento.
- Evoluir o projeto com herança e polimorfismo quando esses conceitos forem estudados.
- Utilizar Collections para organizar os filmes.
- Melhorar a validação das entradas.
- Fazer os tipos de plano influenciarem o comportamento do sistema.
- Reduzir dados fixos e responsabilidades concentradas na classe `Main`.
- Posteriormente estudar Spring Boot, APIs REST, PostgreSQL, JPA e testes automatizados.

## Autor

Desenvolvido por [Fabrício Rufino](https://github.com/FabricioRufino0) como projeto de aprendizado contínuo.
