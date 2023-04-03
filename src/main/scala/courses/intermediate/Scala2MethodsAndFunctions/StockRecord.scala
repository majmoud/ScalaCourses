package courses.intermediate.Scala2MethodsAndFunctions

/** Case classes are used to model immutable data and can be constructed without the new keyword */
case class StockRecord(
                      date      : String,
                      open      : Float,
                      high      : Float,
                      low       : Float,
                      close     : Float,
                      adj_close : Float,
                      volume    : Double
                      )

case class StockMarket(
                        date      : String,
                        open      : Float,
                        high      : Float,
                        low       : Float,
                        close     : Float,
                        ticker : String
                      )