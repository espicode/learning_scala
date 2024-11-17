def printNumbers(numbers: Int*): Unit = {
  numbers.foreach(println)
}
printNumbers(1,2,3)
val arr = Array(1, 2, 3, 4)
printNumbers(arr: _*) // Expands `arr` so each element is passed as a separate argument
