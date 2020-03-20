function algoritmo1() {
  let a = prompt("Presiona alguna tecla para la variable a:");
  let b = prompt("Presiona alguna tecla para la variable b:");
  let c = a;
  a = b;
  b = c;
  document.write(`El valor de 'a' es ${a} y el valor de 'b' es ${b}`);
}
