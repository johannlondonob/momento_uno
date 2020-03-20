function algoritmo3() {
  let a = prompt("Introduce el primer número:");
  let b = prompt("Introduce el segundo número:");
  a = parseInt(a);
  b = parseInt(b);

  if (a >= b) {
    if (a == b) {
      document.write("Son números iguales.");
    } else {
      document.write(`${a} es mayor que ${b}`);
    }
  } else {
    document.write(`${a} es menor que ${b}`);
  }
}
