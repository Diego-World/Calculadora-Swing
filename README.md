# Calculadora em Java Swing

## Objetivo do programa

Esse é uma versão da calculadora do Mac OS desenvolvida em Java e Swing durante a formação do curso Java-pro
ministrado pelo professor Leonardo Moura, link do curso: udemy.com/course/fundamentos-de-programacao-com-java/

## Tecnologias

#### Linguagem: Java
#### Paradigmas: Programação orientada a objetos e Funcional (Lambdas e Streams)
#### IDE: Intelij

## Principais utilizações

-> **StreamAPI**:

Coloquei em prática o uso do *StreamApi* implementado no Java 8, que torna muito mais simples a manipulação de coleões de dados, 
passando a responsabilidade do processamento interno para a própia linguagem.

-> **Java Swing**:

Biblioteca para desenvolvimento de interfaces desktop presente no pacote do Java.

-> **Padrão de projeto: OBSERVER**:

Para trabalhar com as ações dentro do jogo como abrir um campo, marcar, desmarcar, explodir uma mina e reiniciar, utilizei o padrão observer para notificar
os respectivos observadores sobre o principal evento dentro do campo minado, o pressionamento do mouse.

-> **Padrão de projeto: Singleton**:

Esse padrão de projeto singleton tem como objetivo garantir que uma classe tenha uma única instância, no projeto ele tem a função de assegurar que exista somente uma calculadora.
Até porque na calculadora é feita somente uma operação por vez, não existe uma calculadora assincrona.

## Como rodar o projeto
#### Requisitos: Java e IDE ( Recomendo o Intelij )

Na classe *Calculadora* é onde você está localizado o metódo main, basta rodar e utilizar o projeto!

## Commits

Caso queria acompanhar como foi o desenvolvimento, deixei os commits bem descritivos para estudo!


