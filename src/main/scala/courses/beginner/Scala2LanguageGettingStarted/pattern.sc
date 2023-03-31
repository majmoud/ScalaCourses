
/** Utilisation basic de Pattern Matching */
val amount = 230

amount match {
  case 50 => println("$50")
  case 100 => println("$100")
  case _ => println("Not a $50 or $100 bill")
}

/** Utilisation des variables Pattern Matching */
amount match {
  case a if a == 50   => println("bill is == 50")
  case a if a == 100  => println("bill is == 100")
  case a              => println("The amount is : " + a)
}


/** Stockage du résultat Pattern Matching dans une variable */
val result: String = amount match {
  case a if a == 50 => "bill is == 50"
  case a if a == 100 => "bill is == 100"
  case a => "The amount is : " + a
}

result.split(":")(1).trim

/** Performing Pattern Matching on Types */
abstract class Currency
case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

val currency : Currency = CAD()
val amount = 100

currency match {
  case u : USD => println("USD : " + amount)
  case c : CAD => println("USD : " + amount * (1/1.30))
  case n : NZD => println("USD : " + amount * (1/1.50))
}


/** Extracting data using Pattern Matching */
/** 1er CAS : */
val anArray = Array(100, 200, 300)
anArray match {
  case Array(first, second, third) => println("second = " + second ) // Ici on voit que les autres variables ne sont utilisées.
}

/** 2eme CAS : */
val anArray = Array(100, 200, 300)
anArray match {
  case Array(_, _, third) => println("third = " + third ) // Ici les autres variables non utilisées sont remplacées par _.
}

/** 3eme CAS : Pattern Maching avec un Tuple */
val aTuple = ("NZD", 100)

aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "NZD" => println("USD " + amount * (1/1.50))
}