/**
 * Esta função recebe o número de seu parâmetro e verifica se este é divisível por 3 ou por 5
 * @param {*} numero
 * @returns resultado
 */
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
