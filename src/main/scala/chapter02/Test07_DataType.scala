package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整数类型
    val a1: Byte = 127
    val a2: Byte = -128

    val a3 = 12 // 整数默认类型为int
    val a4: Long = 1324145345456L

    val b1: Byte = 10
    val b2: Byte = (10 + 20)
    println(b2)

    val b3: Byte = (b1 + 20).toByte
    println(b3)

    // 2. 浮点类型
    val f1: Float = 1.2345f
    val d1 = 43.245

    // 3. 字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '5'
    println(c2)

    // 控制字符
    val c3: Char = '\t' // 制表符
    val c4: Char = '\n' // 换行符
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    val c5 = '\\'
    val c6 = '\"'
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1: " + i1)

    val c7: Char = (i1 + 1).toChar
    println(c7)

    // 4. 布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    // 5. 空类型
    // 5.1 空值Uint
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a: Unit = m1()
    println("a: " + a)

    // 5.2 空引用Null
    //    val n: Int = null
    var student: Student = new Student("alice", 20)
    student = null // 引用类型才能赋值为null
    println(student)

    // 5.3 Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b: Int = m2(2)
    println("b:" + b)
  }
}
