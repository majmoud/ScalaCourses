
val amounts = Array(10, 24, 35, 23, 12)

/** Utilisation simple de for loops */
for(amount <- amounts) {
  println(amount)
}

/** La somme des valeurs en utilisant for */
var sum = 0
for(amount <- amounts) {
  sum = sum + amount
}
println(sum)

/**  */
val results = for (amount <-  amounts) {
  amount
}
println(results)


/** for est statement c'est pourqoui il
 * ne retourne pas de valeurs
 * Pour cela, il faut utiliser yield
 */
val result : Array[Int] = for (amount <- amounts) yield {
  amount
}
println(result)

/** Association avec plusieurs collections */
val currencies = Array("USD", "CFA")

val result : Array[String] = for {
  amount <- amounts
  currency <- currencies
} yield {
  amount + " " + currency
}
println(result)

/** Ajout de filtre dans les données for loops */
val result : Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "USD" || currency == "CFA")
} yield {
  amount + " " + currency
}
println(result)

/** foreach is  a statement */
amounts.foreach(element => println(element * 10))








