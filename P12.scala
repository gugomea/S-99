object F12 {
  def rep[T](elemento: T, veces: Int): List[T] = {

    if (veces <= 0) Nil
    else elemento :: rep(elemento, veces - 1)

  }

  def decode[T](l: List[(Int, T)]): List[T] = {
    l.flatMap((I, c) => rep(c, I))
  }
}

object P12 extends App {

    val l1 = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    val l2 = List()

    val value_1 = F12 decode l1
    println("" + l1 + " => " + value_1)

    val value_2 = F12 decode l2
    println("" + l2 + " => " + value_2)

}
