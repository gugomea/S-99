import F20.removeAt;
object F23 {
  val rnd = new scala.util.Random

  def randomSelect[T](t: Int, l: List[T]): List[T] = {
    t match {
      case 0 => List()
      case _ => removeAt(rnd.nextInt(l.size), l) match {
        case (l, e) => e :: randomSelect(t - 1, l)
      }
    }
  }
}

object P23 extends App {
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F23 randomSelect (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F23 randomSelect (10, l2)
    println("" + l2 + " => " + value_2)
}
