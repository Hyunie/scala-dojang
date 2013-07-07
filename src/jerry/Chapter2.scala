package jerry
import scala.math.BigInt.int2bigInt

object Chapter2 {

  def product1(str: String): BigInt = {
    var x: BigInt = 1
    for (c <- str) x *= c
    x
  }

  def product2(str: String): BigInt = {
    var x: BigInt = 1
    str.foreach(x *= _.toInt)
    x
  }

  def product3(str: String): BigInt = {
    def product_r(str: String, x: BigInt): BigInt = {
      str match {
        case "" => x
        case _ => product_r(str.drop(1), str.head.toInt * x)

      }
    }
    product_r(str, 1)
  }

  def calcurate(x: Double, n : Int): Double = {
    var xn= 0.0
     if ((n > 0) && (n % 2 == 0)) {
      val y = calcurate(x, n / 2)
      xn = y * y
    } else if ((n > 0) && (n % 2 != 0))
      xn = x * calcurate(x, n - 1)
    else if (n == 0)
      xn = 1
    else if (n < 0) {
      xn = 1 / calcurate(x, -n)
    }
    xn
  }

  def main(args: Array[String]) {
    val str = "Hello"
    println("Q6:" + product1(str))
    println("Q7:" + product2(str))
    println("Q9:" + product3(str))
    println("Q10:" + calcurate(333,2))

  }
}