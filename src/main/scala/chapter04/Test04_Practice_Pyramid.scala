package chapter04

// 打印输出九层妖塔
object Test04_Practice_Pyramid {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      println(" " * (9 - i) + "*" * (2 * i - 1))
    }

    for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i) {
      println(" " * spaces + "*" * stars)
    }

    for (stars <- 1 to 17 by 2; spaces = (17 - stars) / 2){
      println(" " * spaces + "*" * stars)
    }
  }
}
