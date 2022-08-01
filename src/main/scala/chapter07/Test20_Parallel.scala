package chapter07

import scala.collection.parallel.{ParSeq, immutable}

object Test20_Parallel {
  def main(args: Array[String]): Unit = {
//    val result: immutable.IndexedSeq[String] = (1 to 100).map(
//      x => Thread.currentThread.getId
//    )
//    println(result)

    val result2: ParSeq[Long]= (1 to 100).par.map(
      x => Thread.currentThread.getId
    )
    println(result2)
  }
}
