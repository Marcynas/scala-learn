import expressions.y

object expressions extends App {

  val x = 1+2

  println(x)

  var y = 2
  y += x
  println(y)


  val aContition = true

  val aConditionValue = if(aContition) 5 else 3
  println(aConditionValue)

  println(if(aContition) 5 else 3)

  var i = 0

  //DO NOT DO THIS!!!!!
//  while (i<10){
//    println(i)
//    i += 1
//  }
  //NO LOOPS!!!!


  val aWierdValue = (y = 3) // Unit === void
  println(aWierdValue)


  // side effects: println(), whiles, reassigning

  val aCodeBlock = {
    val y = 2
    val z = y - 1

    if (z > 2) "hellop" else "bye"
  }


}
