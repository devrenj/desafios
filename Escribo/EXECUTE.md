# Escribo

### Código

```javascript
function somarDivisiveis(numero) {
  let resultado = 0;
  for (let i = 0; i < numero; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      resultado = resultado + i;
    }
  }
  return resultado;
}

let numero = 10; // Mude para o número desejado
let somatorio = somarDivisiveis(numero);
console.log(`
# Somatório de números divisíveis por 3 e por 5 #
  Resultado: ${somatorio}
  `);
```

Meios de Execução:

## MDN Playground

1. Copie o código acima
2. Acesse <https://developer.mozilla.org/en-US/play>
3. Cole o código na seção `JavaScript`
4. Clique no botão `RUN`

## Com GIT e VS Code instalados

1. Faça um `fork` deste repositório
2. Faça um `clone` para seu dispositivo
3. Já no VS Code com o repositório aberto, execute o programa `script.js` clicando em RUN (CTRL+ALT+N)

## Sem Visual Studio Code instalado

Instalação:

1. Faça o download e instale o VS Code, editor que habilitará escrever código e auxiliar na sua execução (<https://code.visualstudio.com/Download>)
2. Faça o download e instale o NODE, motor necessário para executar o código em JavaScript no VS Code (<https://nodejs.org/en/download>)

> Opte sempre por arquivos LTS (Long Time Support)

## Execução (sem usar extensão)

1. Abra o VS Code
2. Clique na aba `File`
3. Selecione `New Text File`
4. Copie o código acima e cole no seu novo arquivo
5. Salve o seu arquivo com a extensão `.js`
6. Clique com o botão direito no arquivo e selecione `Open in integrated terminal`
7. Execute o comando: `node script.js`

## Usando o VS Code, com extensão

1. Abra o VS Code
2. Clique na aba `File`
3. Selecione `New Text File`
4. Copie o código acima e cole no seu novo arquivo
5. Salve o seu arquivo com a extensão `.js`
6. Na guia extensions, procure e instale a extensão `Code Runner (Jun Han)`
7. Selecione novamente o arquivo com a extensão .js e à direita das abas, selecione o botão RUN (CTRL+ALT+N)

### LICENSE

Copyright (c) 2023 Roberto Nóbrega Jr. ([@devrenj](https://www.github.com/devrenj)) under MIT License
