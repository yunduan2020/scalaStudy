package chapter02


/*
130: Int 类型， 占4个字节，32位
原码： 0000 0000 0000 0000 0000 0000 1000 0010
补码： 0000 0000 0000 0000 0000 0000 1000 0010

截取最后一个字节，Byte
得到补码 1000 0010
对应原码 1111 1110 表示-126
 */
object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    var n: Int = 128
    val b: Byte = n.toByte
    println(b)
  }
}
