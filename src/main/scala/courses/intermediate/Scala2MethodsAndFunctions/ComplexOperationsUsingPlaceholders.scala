package courses.intermediate.Scala2MethodsAndFunctions

object ComplexOperationsUsingPlaceholders extends App {

  val readFinanceData = () => {
    val source = io.Source.fromFile("src/main/resources/GOOG.csv")
    for {
      line <- source.getLines().drop(1).toVector
      cols = line.split(",").map(_.trim)
    } yield StockRecord (
      date = cols(0).toString, open = cols(1).toFloat, high = cols(2).toFloat,
      low = cols(3).toFloat, close = cols(4).toFloat,  adj_close = cols(5).toFloat,
      volume = cols(6).toDouble
    )
  }

  var data = readFinanceData()


  val getTotalNumberOfRows = () => data.size

  val getAvgCloseValue = () => data.map(_.close).sum / data.size

  val getMinCloseValue = () => data.map(_.close).min

  val getMaxCloseValue = () => data.map(_.close).max

  val getCloseValueOnData = (givenDate : String) => {
    val filteredClose = data.filter(_.date == givenDate)

    filteredClose.map(_.close).head
  }

  println("Dataset size  : " + getTotalNumberOfRows())
  println("Average close : " + getAvgCloseValue())
  println("Min close     : " + getMinCloseValue())
  println("Max close     : " + getMaxCloseValue())

  val date = "2020-01-03"
  println(s"Close value on $date : ${getCloseValueOnData(date)} ")


  //
  val priceDelta = (_: Double) - (_: Double)

  val getDailyDelta = (openPrice : Double, closePrice : Double,
                       delta : (Double, Double) => Double ) => delta (openPrice, closePrice)

  val record = data.filter(_.date == "2020-01-03")

  println(getDailyDelta(record(0).open, record(0).close, priceDelta))  /** les deux sont equivalentes  */
  println(getDailyDelta(record(0).open, record(0).close, _ - _))



}
