/**
 * Différence entre Functions et Méthode :
 * - Une fonction est directement défini dans un fichier
 * - Une méthode par contre est accessible depuis une classe
 */

  /** Déclaration d'une fonction :
   * def functionName (argument : Type) : ReturnType = { body }
   * def functionName () : ReturnType = { body }
   * */


def square(x : Int) : Int = x * x
val sqr = square(4)

/** Multiplication de deux nombres */
def multiply(x: Int, y : Int) : Int = x * y
val multiply2_5 = multiply(2, 5)

//val multiply2_3_5 = multiply(2, 3, 5) // erreur parce que la fonction prend uniquement 2 arguments

/** Pour palier a cela :  */
def multiply(nums : Int*) : Int = {
  var instance = 1
  for (num <- nums) instance = instance * num
  instance
}
val multiply2_3_5 = multiply(2, 3, 5)
val multiply_ = multiply(2, 3, 5, 10, 100, 20)

/** Création de fonction locale
 * Affichage des nombres impairs entre 1 et n donné en argument
 * @Return la somme des valeurs impaires
 * */
def sumOdd(n: Int): Int = {
  def getOdd(x: Int): Array[Int] = {
    var result = Array[Int]()
    var current = 1
    while (current < x) {
      if (current % 2 == 1) result = result :+ current
      current = current + 1
    }
    result
  }

  val odds = getOdd(n)
  println(odds.mkString(","))
  odds.sum
}

sumOdd(10)

/**
 * NB : les arguments nommés sont très important pour les
 * fonctions, ils permettent de compiler le code même si
 * l'ordre des arguments n'est pas respectée
 */
def hello (first : String, last : String): Unit = {
  println(s"Hello, $first, $last ")
}
hello("Majmoud", "DIOP")
hello("DIOP", "Majmoud")
hello(last =  "DIOP", first = "Majmoud")


/**
 * Implémentation des fonctions Higher Order Functions
 */
def square(x: Int) : Int = x * x        //  Int => Int : fonction prenant un Int en argument et retourne un Int
def cube(x: Int) : Int = x * x * x      //  Int => Int
def sum(x: Int, y : Int) : Int = x + y  //  (Int, Int) => Int
def length(s : String) : Int = s.length //  String => Int

// A high order function is a function that either takes another function as the input
// or returns another function as the return value.
def transform(f : Int => Int, elements : Int*) : Seq[Int] = elements.map(f)
transform(square, 1, 2, 5, 8, 10)
transform(cube, 1, 2, 5, 8, 10)
//square and cube as passed as value. It's knows as "function as first-class citizens"

transform((n : Int) => n * n , 1, 2, 3, 4, 5)
transform(n => n * n * n , 1, 2, 3, 4, 5)
transform(n => 2 * n , 1, 2, 3, 4, 5)

val numbers = Array(1, 2, 3, 4, 5)
numbers.map(number => number * 2)
numbers.filter(n => n % 2 == 0)
numbers.filter(n => n % 2 == 1)

/**
 * Implicit Conversion In Scala déja implementé  dans Implicit.scala
 */

import courses.beginner.Currency
import courses.beginner.Implicit.stringToCurrency
val cad : Currency = "CAD 200"

