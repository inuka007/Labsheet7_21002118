package Lab_7

object Q2 extends App {
  def calculateSquare(x: List[Int]): List[Int] = {
    x.map(x => x * x )
  }

  val input = List(1, 2, 3, 4, 5)
  var output = calculateSquare(input)

  println(output)
}
