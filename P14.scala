object F14 {

  def duplicate[T](l: List[T]): List[T] = {
    l match {
      case Nil => Nil
      case x :: xs => x :: x :: duplicate(xs)
    }
  }
}

object P14 extends App {

    val l1 = List('a', 'b', 'c', 'c', 'd')
    val l2 = List()

    val value_1 = F14 duplicate l1
    println("" + l1 + " => " + value_1)

    val value_2 = F14 duplicate l2
    println("" + l2 + " => " + value_2)

}
