package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    // person.name    // error
    println(person.age)
    println(person.sex)

    person.printInfo()

    val worker:Worker = new Worker()
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    // println(idCard)    // error
    name = "bob"
    age = 25
    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}