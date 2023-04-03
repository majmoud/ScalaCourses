package courses.intermediate.Scala2MethodsAndFunctions

object PartiallyAppliedFunctions extends App {

  val googStockPrices = List(1367.17, 8651.92, 2976.10, 101.52, 1023.2, 1452.11, 2679.42)

  def chekPriceGreaterThan1400(price : Double): Boolean = price > 1400

  var googStockPriceGreaterThan1400 = googStockPrices.filter((price : Double) => chekPriceGreaterThan1400(price))

  println(googStockPriceGreaterThan1400)

  /** Redefine googStockPriceGreaterThan1400 variable using << partially applied function >>  */
  googStockPriceGreaterThan1400 = googStockPrices.filter(chekPriceGreaterThan1400 _)
  googStockPriceGreaterThan1400 = googStockPrices.filter(chekPriceGreaterThan1400) // it is same

  println("Partially Applied Function : " + googStockPriceGreaterThan1400)

  /**
   * The << _ >> is a placeholder for an entire parameter list. This is a << partially applied
   * function >>, where you don't need supply all of the arguments the function needs,
   * you specify either some or none of the arguments.
   * NB : the _ is a replacement for the entire parameter list to that function.
   */
  /** You can use the method, it's same */
  val checkPricesGreaterThan1400Method = chekPriceGreaterThan1400 _
  googStockPriceGreaterThan1400 = googStockPrices.filter(checkPricesGreaterThan1400Method)

  // Get prices in range
  def checkPriceInRange (price : Double, lower : Double, upper : Double) : Boolean = price >= lower && price <= upper

  val checkPriceInRangeFunction = checkPriceInRange _

  var googStockPricesInRange = googStockPrices
    .filter((price : Double) => checkPriceInRangeFunction(price, 1390, 3000))

  println(googStockPricesInRange)

  // Defining prices in range using placeholder _
  val googStockPricesInRangeFunction = checkPriceInRange(_ : Double, _: Double, 3000)
  googStockPricesInRange = googStockPrices
    .filter((price: Double) => googStockPricesInRangeFunction(price, 1390))

  println(googStockPricesInRange)

}
