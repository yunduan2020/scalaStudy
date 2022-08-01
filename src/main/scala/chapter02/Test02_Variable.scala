package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a: Int = 10

    // （1） 声明变量时，类型可以省略，编译器 自动推导，即类型推导
    var a1 = 10
    val b1 = 23

    // （2）类型确定后，就不能修改，说明 Scala 是强数据类型语言。
    var a2 = 12
//    a2 = "hello"

    // （3）变量声明时，必须要有初始值
//    var a3: Int

    // （4）在声明定义一个变量时，可以使用 var 或者 val 来修饰， var 修饰的变量可改变， val 修饰的变量不可改。
    a1 =15
//    b1 = 20

    var alice = new Student("alice", 20)
    alice = new Student("Alice", 20)
    alice = null
    val bob = new Student("bob", 23)    // bob 本身不可变，但是bob 的属性可以变，因为属性并没有用 val 修饰
    bob.age = 24
    bob.printInfo()
//    bob = new Student("bob", 24)
  }
}
