package newPackage

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World");
    hello()
  }
   def hello() {
    val x = 12
    dinner();
  }
   def dinner() {
     var i = 0;
     print("Enter a number of dishes: ")
     val count = scala.io.StdIn.readInt()
     var dishes = new Array[String](count)
     var amount = new Array[Int](count)
     for( i <- 0 until count)
     { 
         println("Your dish : ")
         val dish = scala.io.StdIn.readLine()
         dishes(i) = dish;
         println("Your amount : ")
         val amounts = scala.io.StdIn.readInt()
         amount(i) = amounts;
     }
     println("Your list of dishes: ")
     for(m1 <- dishes)
     {
       println(m1);
     }
     var sum = 0;

     for( i <- 0 until count)
     { 
         if(dishes(i) == "Jablko") sum += amount(i) * 20;
         if(dishes(i) == "Banan") sum += amount(i) * 30;
         if(dishes(i) == "Gruszka") sum += amount(i) * 40;
         if(dishes(i) == "Sliwka") sum += amount(i) * 50;
         if(dishes(i) == "Pomarancz") sum += amount(i) * 60;
     }
     println("Your calories: " + sum)
     
   }
}