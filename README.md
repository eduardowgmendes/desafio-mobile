# desafio-mobile 2019

## Fellini 
O app tem como por objetivo apresentar os filmes que estão em cartaz e exibição nos cinemas além de outros filmes que são os filmes favoritos da comunidade. Ele consome uma API popular chamada de `TheMovieDatabase` para trazer os dados para o app. O nome do App é uma homenagem ao Cineasta Federico Fellini.  

### Informações do Teste 
Para desenvolvimento foram disponibilizados 4 dias. Os requisitos para desenvolvimento podem ser encontrados no [final](https://github.com/eduardowgmendes/desafio-mobile#instru%C3%A7%C3%B5es) desse arquivo.     


### Categorias 
O app traz ao usuário diversas categorias de filmes das quais as principais são:  

* **Top Rated** - Os filmes mais bem avaliados da comunidade do *The Movie Database* 

* **Popular** - Filmes populares entre a comunidade do *The Movie Database*.

* **Upcoming** - Os que estão em pós produção ou já em cartaz nos cinemas.

* **Now Playing** - Os que estão sendo exibidos nos cinemas.

![Categories](https://raw.githubusercontent.com/eduardowgmendes/desafio-mobile/master/screenshots/final-screenshots/main-comp-ii.png)

### Overview 
Ao selecionar algum filme específico o app lhe apresentará informações básicas sobre o filme em questão, tais como: 

* **Sinopse**
* **Elenco Principal**
* **Elenco Geral**
* **Categorias do Filme** 

![App Screens](https://raw.githubusercontent.com/eduardowgmendes/desafio-mobile/master/screenshots/final-screenshots/main-comp-iii.png) 

### Elenco Principal e Elenco Geral
Em conjunto com as informações básicas do filme, você encontra uma seção dedicada ao elenco principal que é mostrado automaticamente e um botão o leva a uma lista completa com todos os integrantes da equipe de produção do filme incluindo o elenco principal. 

![Movie Contents](https://raw.githubusercontent.com/eduardowgmendes/desafio-mobile/master/screenshots/final-screenshots/main-comp-iv.png)

### Categorias 
Também é apresentado ao usuário uma lista de categorias referentes ao filme selecinado. 

![]()

  
## Bibliotecas 
Para o desenvolvimento da aplicação foram utilizadas bibliotecas como o `Picasso` para cache, gerenciamento e controle de imagens, o `Retrofit` para consumo da API do *TheMovieDatabase*, `GSON` para parsing das requisições no formato `JSON`.   
  
## Suporte a orientação Landscape
Para dar suporte às duas orientações foram criados diversos layouts independentes com qualificadores de densidade de pixels, tamanhos e orientações. 
Sendo assim é esperado que em cada dispositivo haja uma visualização em correspondência e adequação. 

# Desafio Mobile - 2019

Bem Vindo ao desafio mobile da CI&T, por favor siga as instruções a baixo para realizar o desafio 😀.

## Instruções

- Faça um fork desse repositório e crie sua solução para iOS ou Android;
- Ao terminar a solução realize um Pull Request;
- Comente no readme do repositório os métodos utilizados, tais como arquitetura, linguagem, soluções técnicas e etc.;

## O App

<img src="screenshots/ss01.png?raw=true" width="250"> <img src="screenshots/ss02.png?raw=true" width="250"> <img src="screenshots/ss03.png?raw=true" width="250">

#### Filmes Populares

Como usuário, gostaria de ver a lista de de filmes mais populares em cartaz nos cinemas. Os itens dessa lista deverão conter:
 - O banner do filme;
 - O nome do filme;
 - A data de estreia;

#### Em Breve

Como usuário, gostária de conseguir filtrar a lista de filmes populares para que agora mostre os filmes que entrarão em cartaz em breve:
 - O Filtro deverá ser aplicado na lista já existente, implementada na task anterior

#### Detalhes do filme

Como usuário, ao selecionar um item da lista, gostaria de ver os detalhes do filme:
 - Uma imagem em alta resolução;
 - Nome do filme
 - Generos do filme
 - Ano de estreia
 - Duração
 - Elenco principal 
 - Sinópse
 
## Requisitos
 - O app deve ser desenvolvido para suportar as orientação Portrait e Landscape
 - Seja criativo, as imagens de referência são apenas exemplos, você pode criar seu próprio layout
 - Use libs e frameworks que você estiver mais acostumado
 - Teste o seu código ;D
 - Utilize a The Movie Database para realizar as consultas 
 -- TMDB (https://www.themoviedb.org)
 -- API (https://www.themoviedb.org/documentation/api)
 
# BOA SORTE!
 
 
