function somarDivisiveis(numero) {
  let resultado = 0;
  for (let i = 0; i < numero; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      resultado = resultado + i;
    }
  }
  return resultado;
}

let numero = 10; // Altere aqui o número desejado
let somatorio = somarDivisiveis(numero);
console.log(`# Somatório de números divisíveis por 3 e por 5 #\n\nResultado: ${somatorio}`);