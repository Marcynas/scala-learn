object variables extends App {

  val x: Int = 22
  val y = 22

  //COMPILER CAN INFER TYPES

  println(x)
  println(y)

  //x = 2
  // VALS ARE IMmUTABLE

  val sentence: String = "What a lovely day!"
  val isTrue: Boolean = true
  val firstLet: String = sentence.substring(0,1)

  println(isTrue)
  println(firstLet)


  var X = 5
  println(X)



}
