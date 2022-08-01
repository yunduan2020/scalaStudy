package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    val arr: Array[Int] = new Array[Int](5)
    // 另一种创建方式
    val arr2 = Array(12, 37, 43, 45, 67)

    // 2. 访问数组中的元素
    println(arr(1))
    println(arr2(3))
    arr(1) = 3
    arr(2) = 1
    println(arr(1))
    println("===================")

    // 数组的遍历
    // (1) 普通for循环
    for (i <- 0 until arr.length){
      println(arr(i))
    }

    for (i <- arr.indices) println(arr(i))

    // (2) 直接遍历所有元素， 增强for循环
    for (elem <- arr2) println(elem)

    println("--------------------")
    // (3) 迭代器
    val iter = arr2.iterator
    while(iter.hasNext){
      println(iter.next())
    }

    // (4) 调用foreach方法
    arr2.foreach((elem: Int) => println(elem))

    arr.foreach(println)

    println(arr2.mkString("--"))
    println("=====================================")

    // 添加元素
    val newArr = arr2.:+(78)
    println(newArr.mkString("--"))

    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("--"))

    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 29 +: newArr3 :+ 73 :+ 63
    println(newArr4.mkString(","))


  }
}
