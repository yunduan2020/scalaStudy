package chapter04

object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$j x $i = ${i * j} \t")
      }
      println()
    }

    for (i <- 1 to 9; j <- 1 to i){
      print(s"$j x $i = ${i * j} \t")
      if (i == j){
        println()
      }

    }
  }
}
