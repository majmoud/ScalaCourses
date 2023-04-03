package courses.intermediate.Scala2MethodsAndFunctions

object VarValLazyValDef extends App {

  /**
   * NB : vals don't permit reassignment, but they do permit modification.
   */
  val data = {
    println("Array is initialized")
    Array("SONATEL", "ORANGE", "GOOGLE", "AWS")
  }

  println("Before accessing data")
  data.foreach(println)

  //data = Array("GCP", "AWS", "AZURE") // Error : Reassignment to val

  data(1) = "TESLA"
  data(3) = "AZURE"

  println("After modified values")
  data.foreach(println)

}
