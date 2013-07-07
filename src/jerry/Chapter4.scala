package jerry

object Chapter4 {

  def minmax(x: Array[Int]) = {
    (x.min, x.max)
  }

  def lteqgt(x: Array[Int], v: Int) = {
    (x.count(_ < v), x.count(_ == v), x.count(_ > v))
  }

  def main(args: Array[String]) {

    var x = Array(9, 6, 7, 12, 4, 1, 4)
    println("Q8:" + minmax(x))
    println("Q9:" + lteqgt(x,6))

  }
}