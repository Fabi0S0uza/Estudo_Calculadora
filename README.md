# Calculadora Android - Estudo Básico

Este projeto é um **estudo básico** para a construção de um aplicativo Android simples de uma calculadora. O objetivo é aprender e aplicar conceitos fundamentais de Kotlin e Android, como manipulação de views, eventos de clique e operações matemáticas básicas.

## Funcionalidades

- **Soma**: Realiza a soma entre dois números.
- **Subtração**: Realiza a subtração entre dois números.
- **Multiplicação**: Realiza a multiplicação entre dois números.
- **Divisão**: Realiza a divisão entre dois números.
- **Limpar**: Limpa os campos de entrada e reseta o resultado.

## Como usar

1. Insira dois números nos campos de texto.
2. Clique no botão da operação que deseja realizar (Soma, Subtração, Multiplicação ou Divisão).
3. O resultado será exibido na tela.
4. Clique no botão "Limpar" para apagar os números e o resultado.

## Detalhes do código

Este projeto foi desenvolvido como parte de um **estudo básico** e tem como objetivo explorar conceitos iniciais do desenvolvimento Android:

- **Layouts**: Interface com campos `EditText` para inserir números, botões para operações e um `TextView` para exibir o resultado.
- **Entrada de dados**: Os números inseridos são convertidos de `String` para `Int` para as operações, e há uma verificação básica para garantir que os campos não estejam vazios.
- **Gestão de erros**: O aplicativo exibe um `Toast` quando os campos de entrada estão vazios.
- **Funcionalidade "Edge-to-Edge"**: O layout utiliza a configuração de barras do sistema para ajustar o conteúdo à tela inteira.
- **Operações matemáticas**: Implementação simples de soma, subtração, multiplicação e divisão.
- **Botão "Limpar"**: Reseta os campos de entrada e o resultado exibido.

## Exemplo de uso

1. Digite `10` no primeiro campo e `5` no segundo.
2. Clique no botão "Somar", o resultado exibido será `Resultado: 15`.
3. Clique no botão "Limpar" para apagar os valores e o resultado.

## Layout XML

O layout do aplicativo está definido no arquivo `activity_main.xml`, onde estão organizados os campos de entrada, os botões e o `TextView` para exibir o resultado.

## Contribuições

Este projeto foi criado como parte de um estudo básico, então não se trata de uma aplicação finalizada.
