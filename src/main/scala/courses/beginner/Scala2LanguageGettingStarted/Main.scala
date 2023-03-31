package courses.beginner.Scala2LanguageGettingStarted

object Main {

        def main(args: Array[String]): Unit = {
                // money 100

                val Array(code : String, value : String) = args(0).split("\\s")
                val valueAsDouble = value.toDouble

                if (! Set("NZD", "CAD").contains(code)) {
                        println("Supported Currencies are CAD and NZD")
                        sys.exit()
                }
                else {
                        val rate = Utils.getRateFromCode(code)
                        println(args(0) + " = USD " + (rate * valueAsDouble) )
                }
        }

        object Utils {

                private val cadToUSD : Double = 1 / 1.30
                private val nzdToUSD : Double = 1 / 1.50

                def getRateFromCode(code: String): Double = {
                        println(s"Getting rate from ${code}")
                        code match {
                                case "NZD" => nzdToUSD
                                case "CAD" => cadToUSD
                        }
                }
        }

}
