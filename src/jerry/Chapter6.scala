package jerry

import java.awt.Point

object Chapter6 {

  abstract class UnitConversion {
    def convert(value: Double): Double
  }

  object InchesToCentimeters extends UnitConversion {
    def convert(value: Double) = {
      value * 2.54
    }
  }

  object GallonsToLiters extends UnitConversion {
    def convert(value: Double) = {
      value * 4.54609188
    }
  }

  object MilesToKilometers extends UnitConversion {
    def convert(value: Double) = {
      value * 1.609344
    }
  }

  object Origin extends Point {
  }

  object Main extends App {
    println(args.reverse.mkString(" "))
  }

  def main(args: Array[String]) {
    println("Inch2Cent:" + InchesToCentimeters.convert(10))
    println("Gallon2Liter:" + GallonsToLiters.convert(10))
    println("Miles2KM:" + MilesToKilometers.convert(10))
    Main
  }
}