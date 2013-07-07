package jerry

import scala.collection.mutable.ArrayBuffer

object Chapter3 {
  def switchArray(x: Array[Int]): Array[Int] = {
    for (i <- 0 until x.length - 1 if i % 2 == 0) {
      var temp = x(i)
      x(i) = x(i + 1)
      x(i + 1) = temp
    }
    x
  }

  def newSwitch(x: Array[Int]): Array[Int] = {
    val res = for (i <- 0 until x.length) yield {
      if (i % 2 == 0 && i < x.length - 1)
        x(i + 1)
      else if (i % 2 != 0 && i > 0)
        x(i - 1)
      else
        x(i)
    }
    x
  }

  def remove(x: ArrayBuffer[Int]): ArrayBuffer[Int] = {

    var index = for (i <- 0 until x.length if x(i) < 0) yield {
      i
    }
    val reverse = index.reverse.dropRight(1)
     for (y <- reverse){
      x.remove(y)
    }
      x
  }

  def main(args: Array[String]) {
    val x = Array(1, 2, 3, 4, 5)
    val y = ArrayBuffer(12, -10, 1, -9, 8, 7, -11)
    var rv = switchArray(x)
    for (i <- 0 until rv.length) {
      println("Q2:" + i + ":" + rv(i))
    }
    var rv2 = newSwitch(x)
    for (i <- 0 until rv2.length) {
      println("Q3:" + i + ":" + rv2(i))
    }
    var rv3 = remove(y)
    println(rv3) }
}