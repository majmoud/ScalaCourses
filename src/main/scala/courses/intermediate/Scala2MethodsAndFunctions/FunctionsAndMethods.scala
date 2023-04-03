package courses.intermediate.Scala2MethodsAndFunctions


object FunctionsAndMethods extends App {

  /**
   * Methods are not  Object :
   * The terms method and object are often use interchangeably because methods can
   * be stored in objects quite easily
   */

  /** Functions are Objects :
   * Function objects are first class entities on par with classes - methods are not.
   * */

  /** Functions definition
  val getCount = () => {
    ???
  }
   */

  /** Methods definition
  def getCount(): Int = {
    ???
    2
  }
   */

  val data = Array("PF", "GCP", "MSFT", "TESLA")

  def getNumRowsMethod () : Int = data.length

  val getNumRowsFunction = () => data.length

  /** 1er Cas : */
  println("Total number of rows (method)   : " + getNumRowsMethod())
  println("Total number of rows (function) : " + getNumRowsFunction())

  /** Identification of classes */
  println(getNumRowsMethod.getClass)
  println(getNumRowsFunction.getClass)

  /** Utilisation of apply function */
  //println(getNumRowsMethod.apply) //Error : Methods do not implements traits
  println(getNumRowsFunction.apply) // @Return 4

  /** Every function object is an instance of a class that implements traits
   * The traits that are implemented by a function depend on the number of
   * input arguments to a function
   * */
  println(getNumRowsFunction.isInstanceOf[Function0[_]]) // @Return true because Function0 means function with 0 argument


  /** 2eme Cas */
  def existsMethod (ticker : String) : Boolean = data.contains(ticker)

  val existsFunction = (ticker : String) => data.contains(ticker)

  println("Does GCP exist (method) : " + existsMethod("GCP"))
  println("Does TESLA exist (function) : " + existsFunction("TESLA"))

  /** Create a function object from a method, this uses partially applied functions */
  val exists  = existsMethod _ //coercion of the method to a function object
  val exists2 = (ticker : String) => existsMethod(ticker) // It's same to exists

  println("Does Maj exists : "   + exists("Maj"))
  println("Does TESLA exists : " + exists("TESLA"))
  println("Does TESLA exists : " + exists2("TESLA"))
  
}
