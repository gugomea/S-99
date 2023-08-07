object F13 {

  def encodeDirect[T](l: List[T]): List[(Int, T)] = {
    if (l == Nil) Nil
    else {
      val (x, xs) = l.span(_ == l.head)
      (x.size, x.head) :: encodeDirect(xs)
    }
  }
}

object P13 extends App {

    val l1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val l2 = List()

    val value_1 = F13 encodeDirect l1
    println("" + l1 + " => " + value_1)

    val value_2 = F13 encodeDirect l2
    println("" + l2 + " => " + value_2)

}
