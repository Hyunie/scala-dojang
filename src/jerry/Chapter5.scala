package jerry

object Chapter5 {

  class Car(val brand: String,
    val name: String,
    val year: Int = -1,
    var licenseNo: String = "") {

    def to_string() {
      println("brand:"+this.brand+",name:"+this.name+",year:"+this.year+",licenseNo:"+this.licenseNo)
    }
  }

  def main(args: Array[String]) {
    val bmw = new Car("BMW", "SERIES3000", 2013, "5330")
    bmw.to_string();

    val audi = new Car("AUDI", "XE3312")
    audi.to_string();
  }

}