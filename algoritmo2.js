function algoritmo2() {
  let a = prompt("Introduce el primer número:");
  let b = prompt("Introduce el segundo número:");
  let suma = parseInt(a) + parseInt(b);
  let resta = a - b;
  let multiplo = a * b;
  let division = a / b;
  document.write(`${a} + ${b} = ${suma} <br>`);
  document.write(`${a} - ${b} = ${resta} <br>`);
  document.write(`${a} * ${b} = ${multiplo} <br>`);
  document.write(`${a} / ${b} = ${division} <br>`);
}
