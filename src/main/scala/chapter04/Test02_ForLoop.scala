package chapter04

import scala.collection.parallel.immutable


object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for 语法： for (int i = 0; i < 10; ++i){ System.out.println(i + ".hello world");}

    // 1. 范围遍历
    for (i <- 1 to 10) {
      println(i + ".hello world")
    }
    //    for (i <- 1.to(10)){
    //      println(i + ".hello world")
    //    }

    println("=====================")
    for (i <- Range(1, 10)) {
      println(i + ".hello world")
    }

    println("=====================")
    for (i <- 1 until 10) {
      println(i + ".hello world")
    }

    println("=====================")
    // 2. 集合遍历
    for (i <- Array(12, 34, 56)) {
      println(i)
    }
    for (i <- List(12, 34, 56)) {
      println(i)
    }
    for (i <- Set(12, 34, 56)) {
      println(i)
    }

    println("=====================")
    // 3. 循环守卫
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    println("=====================")
    // 4. 循环步长
    for (i <- 1 to 10 by 2) {
      println(i) // step 不能为 0
    }

    for (i <- 40 to 13 by -2) {
      println(i)
    }

    for (i <- 1 to 10 reverse) {
      println(i)
    }

    for (i <- 1.0 to 10.0 by 0.3) {
      println(i)
    }

    println("=====================")
    // 5. 嵌套循环
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("(" + i + ", " + j + ")")
      }
    }
    println("----------------------")
    for (i <- 1 to 4; j <- 1 to 5) {
      println("(" + i + ", " + j + ")")
    }

    println("=====================")
    // 6. 循环引入变量
    for (i <- 1 to 10) {
      val j = 10 - i
      println("(" + i + ", " + j + ")")
    }
    println("----------------------")
    for (i <- 1 to 10; j = 10 - i) {
      println("(" + i + ", " + j + ")")
    }
    println("----------------------")
    for {i <- 1 to 10
         j = 10 - i
         } {
      println("(" + i + ", " + j + ")")
    }

    // 6. 循环返回值
    val a: Unit = for (i <- 1 to 10) {
      println(i)
    }
    println("a = " + a)

    val b = for (i <- 1 to 10) yield i * 2
    println("b = " + b)
  }
}
