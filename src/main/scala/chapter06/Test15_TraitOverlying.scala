package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student15: Student15 = new Student15
    student15.increase()

    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}

// 定义球类特征
trait Ball {
  def describe():String = "ball"
}

// 定义颜色特征
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

// 定义种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

// 定义一个自定义球的类
class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super.describe()
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increased")
  }
}

trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("knowledge increased")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = {
    println("dancing")
  }

  override def singing(): Unit = {
    println("singing")
  }

  override def increase(): Unit = {
    super[Talent15].increase()   // 叠加顺序从后往前
  }
}