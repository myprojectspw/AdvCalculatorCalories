package newPackage

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World");
    hello()
  }
   def hello() {
    println("Hello Worlds");
    val x = 12
    println("Hello Worlds " + x);
  }
}