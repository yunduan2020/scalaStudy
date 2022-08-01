package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入姓名：")
    val name: String = StdIn.readLine()
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    // 控制台打印输出
    println(s"欢迎${age}岁的${name}同学来到HUST")
  }
}
