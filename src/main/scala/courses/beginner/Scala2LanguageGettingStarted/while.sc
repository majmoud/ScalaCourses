
/** Utilisation de while en incrément la valeur */
var i = 1
while (i <= 10) {
  println(i)
  i += 1
}

/** Utilisation de while en décrément la valeur */
var i = 10
while (i >= 1) {
  println(i)
  i -= 1
}

/** Utilisation de do while loops */
var i = 10
do {
  println(i)
  i = i - 1
} while (i > 0)


var i = -100
do {
  println(i)
  i = i - 1
} while (i > 0)

/**
 * NB : Différence entre do while et while
 * do while : exécute le code avant de faire les tests sur le while
 * while loops : vérifier la condition avant d'exécuter le code
 */
