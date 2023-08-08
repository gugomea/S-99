object F27 {

  def group3[T](l: List[T]): List[List[List[String]]] = {
  }
}

object P27 extends App {

    val l1 = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val l2 = List('a', 'b', 'c', 'd')

    val value_1 = F27 group3 (l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F27 group3 (l2)
    println("" + l2 + " => " + value_2)
}
