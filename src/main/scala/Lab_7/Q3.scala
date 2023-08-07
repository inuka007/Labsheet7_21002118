package Lab_7

object Q3 extends App {

  def filterPrime(x: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to Math.sqrt(n).toInt).exists(x => n % x == 0)
    }
    x.filter(isPrime)
  }


  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  var output = filterPrime(input)

  println(output)
}