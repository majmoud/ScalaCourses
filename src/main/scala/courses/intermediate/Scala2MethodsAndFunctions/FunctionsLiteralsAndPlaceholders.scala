package courses.intermediate.Scala2MethodsAndFunctions

object FunctionsLiteralsAndPlaceholders extends App {

  val googStockPrices = List(1367.17, 8651.92, 2976.10, 101.52, 1023.2, 1452.11, 2679.42)

  // foreach : all these are same
  googStockPrices.foreach((price : Double) => println(price))
  googStockPrices.foreach(price => println(price))
  googStockPrices.foreach(println)

  // filter condition
  googStockPrices.filter((price : Double) => price > 1400)
  googStockPrices.filter(price => price > 1400) /** function literals can be written in a shorter form if the type of the input can be inferred, this is called Target Typing.  */
  googStockPrices.filter(_ > 1400) /** Placeholder represented using _ symbol hold one or more parameters to be passed into function object */

  // Placeholder in map function
  val stockTickersInLowercase = List("gooole", "amazon", "sonatel", "microsoft", "highfi")
  val stockTickersInUppercase = stockTickersInLowercase.map( _.toUpperCase())

  println(stockTickersInUppercase)

  // Function literals can take n arguments
  val sayHello = () => println("Hello function")

  val multiplyBy100 = (x :Int) => x * 100

  val addTwoNumbers = (x : Int, y : Int) => x + y

  val addThreeNumbers = (x : Int, y : Int, z : Int) => x + y + z

  println(multiplyBy100.apply(32))
  println(addTwoNumbers.apply(32, 10))
  println(addThreeNumbers.apply(32, 10, 52))

  println("**" * 50)

  println("sayHello.isInstanceOf[Function0[_]] : " + sayHello.isInstanceOf[Function0[_]])
  println("multiplyBy100.isInstanceOf[Function1[_, _]] : " + multiplyBy100.isInstanceOf[Function1[_, _]])
  println("addTwoNumbers.isInstanceOf[Function2[_, _, _]] : " + addTwoNumbers.isInstanceOf[Function2[_, _, _]])
  println("addThreeNumbers.isInstanceOf[Function3[_, _, _, _]] : " + addThreeNumbers.isInstanceOf[Function3[_, _, _, _]])




}
