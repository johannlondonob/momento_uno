function algoritmo4() {
  let a = prompt("Introduce el primer número:");
  let b = prompt("Introduce el segundo número:");
  let c = prompt("Introduce el tercer número:");
  a = parseInt(a);
  b = parseInt(b);
  c = parseInt(c);

  if (a > b && a > c) {
    document.write(`${a} es el mayor de todos.`);
  } else if (b > c) {
    document.write(`${b} es el mayor de todos.`);
  } else {
    document.write(`${c} es el mayor de todos.`);
  }
}
