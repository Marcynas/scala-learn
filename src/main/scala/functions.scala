object functions extends App {

  def aFunction( a: String, b: Int): String =
    a + " " + b


  println(aFunction("Hello, I am:", 16))


  def aFunctionNoParam(): Int = 42

  println(aFunctionNoParam())

  def aRepeatedFunction(a:String, n: Int): String = {
    if (n==1) a
    else a + aRepeatedFunction(a, n-1)
  }

  println(aRepeatedFunction("Hi!", 3))

  //WHEN U NEED LOOPS USE RECURSIVE
  //DO NOT USE IMPERATIVE CODE

  def aRepeatedFunction2(a: String, n: Int): String = {
    if (n == 1) a
    else a + aRepeatedFunction(a, n - 1)
  }

  def aFunctionWithSideEffects(a: String): Unit = println(a)

  def aBigFunction(n: Int): String ={
    def aSmallFunction(a: String, b:Int):String ={
      a + " " + b
    }

    aSmallFunction("Martynas", n)

  }

  println(aBigFunction(21))


  def aGreetingFunction(name: String, age: Int): String ={
    s"Hello, my name is $name and I am $age years old."
  }

  println(aGreetingFunction("Martynas", 21))


  def aFactorialFunction(n: Int):Int ={
    if (n == 0) 1
    else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(2))

  def isItPrime(i:Int): Boolean={
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }
  println(isItPrime(2))



}
