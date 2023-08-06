object P02 extends App {

    def penultimate(l: List[Int]): Option[Int] = {
      l match {
        case penultimo :: List(ultimo) =>  Some(penultimo)
        case penultimo :: resto => penultimate(resto)
        case _ => None

      }
    }
    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List()

    val value_1 = penultimate(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = penultimate(l2)
    println("" + l2 + " => " + value_2)
}
