package courses.intermediate.Scala2MethodsAndFunctions

object PartialFunctions extends App {

  val divideBy20 = (x : Int) => 20 / x

  println(divideBy20(8))
  //println(divideBy20(0)) // Error : divide by zero not possible

  /**
   * A partial function caters to only a <<subset>> of possible data for which it has been defined
   */
  val divideBy64 = new PartialFunction[Int, Int] {

    def apply(x : Int) : Int = 64 / x

    def isDefinedAt(x: Int): Boolean = x != 0

  }

  println("Defined at 11 : " + divideBy64.isDefinedAt(11))
  println("Defined at 0  : " + divideBy64.isDefinedAt(0))

  println("Divide 64 by 11 : " + (if (divideBy64.isDefinedAt(11)) divideBy64(11)))
}
