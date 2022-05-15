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

Você tem duas opções:

1. Executar pelo .class

``````bash
cd build/classes
java ofendercliapp/OfenderCliApp [...args]
``````

2. Executar pelo .jar

``````bash
cd dist
java -jar ofenderCliApp.jar [...args]
``````

## Palavra Final

Divirta-se!!
