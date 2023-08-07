package Lab_7

object Q1 {
  def filterEvenNumbers(x: List[Int]): List[Int] = {
    x.filter(x => x % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var output = filterEvenNumbers(input)

    println(output)
  }

}
