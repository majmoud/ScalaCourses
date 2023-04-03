package courses.intermediate.Scala2MethodsAndFunctions

object FunctionsLiterals extends App {

  /**
   * Functions First Class Citizen In Scala :
   * - Functions are also first-class citizen, which means a function can be stored
   * in a variable or value type.
   * - A function can also be the return value of a another function, and a function
   * can be parameter of a function i.e a function can be passed in as an input argument
   * to another function.
   */

  /**
   * Function literals :
   * Function literals in the source code get compiled into a class that is instantiated
   * at runtime as a function object.
   */
  (x: Int) => x * 30 // Anonymous function literal

  // Reference  of the function literal
  var multiplyBy = (x : Int) => x * 10

  println(multiplyBy(2))
  println(multiplyBy(10))

  // Reassign function value : you need to have the same signature (same type)
  //multiplyBy = (s : String) => s.toUpperCase() // Error : Type mismatch, excepted Int, actual : String
  multiplyBy = (x : Int) => x * 200 // Error : Type mismatch, excepted Int, actual : String
  println(multiplyBy(10))

  /** Functions literals can be defined into in curly braces */
  private val calculateResult = (x : Int, y : Int) => {
    val sum       = x + y
    val diff      = x - y
    val product   = x * y
    val quotient  = x / y

    (sum, diff, product, quotient)
  }

  println(calculateResult(10, 5))
  println(calculateResult(42, 8))
}
