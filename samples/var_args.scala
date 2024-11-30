def min (a:Int, b:Int) : Int =
 if a < b then a else b
def printNumbers(numbers: Int*): Unit = {
  numbers.foreach(println)
}

// I call the function once with multiple parameters which can be read as a list
printNumbers(1,2,3)
val arr = Array(1, 2, 3, 4)

// Expands `arr` so each element is passed as a separate argument
printNumbers(arr: _*) 
val a=7
val b=0
println(s"El minimimo de $a y $b es ${min(a,b)}")
