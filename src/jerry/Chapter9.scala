package jerry

import java.io.PrintWriter

import scala.io.Source

object Chapter9 {
  def printReverse(fname: String) {
    val source = Source.fromFile(fname)
    val lines = source.getLines.toArray.reverse
    println(lines.deep.mkString("\n"))
  }

  def printFile(fname: String) {
    val out = new PrintWriter(fname)

    for (i <- 0 to 20) {
      val n2 = math.pow(2, i)
      out.print("%10.0f\t%10.2g\n".format(n2, 1 / n2))
    }
    out.close
  }

  def printImg(url: String) {
    val source = Source.fromURL(url)
    val page = source.mkString
    val srcPattern = """<img.*? src="(.+?)".*?>""".r
    srcPattern.findAllIn(page).matchData foreach {
      m => println(m.group(1))
    }

  }

  def main(args: Array[String]) {
    printReverse("src/jerry/test.txt")
    printFile("src/jerry/num.txt")
    printImg("http://www.naver.com")
  }
}