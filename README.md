# Ofender CLI App

Primeiro (de muitos, espero), projeto em Java que faço, só que esse é um projeto bem mini, visto que é para aprendizado

## Do que se trata

Este aplicativo cospe xingamentos (poucos ainda) dependendo do argumento que você insere na execução do programa. O programa é extremamente simples.
Os argumentos disponíveis são

``````bash
-f // Printa um "Fuck you"
-a // Printa um "Asshole"
-b // Printa um "Bastard"
-m // Printa um "MotherFucker"
-i // Printa um "Idiot"
-s // Printa um "Suck My Dick"
``````
## Mas e se eu não inserir nenhum argumento?

Você é xingado!

## Mas e se eu inserir um argumento incorreto?

Você é xingado novamente!! 

## Como executar

É necessário que você tenha o JDK 18!

`git clone`

Navegue até a pasta que foi clonada.

Navegue até a pasta onde está o código fonte:

``````bash

cd src/ofendercliapp
``````
Será necessário rodar a compilação para o arquivo .java.

``````bash

javac OfenderCLIApp.java
``````
Agora, basta executar, com adendo de que há um header de package no código-fonte, então basta subir uma pasta e executar:

``````bash
cd ..
java ofendercliapp/OfenderCLIApp [...Args]
``````
## Palavra Final

Divirta-se!!
