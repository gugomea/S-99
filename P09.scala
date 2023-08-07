object F09 {

    def chunk[T](l: List[T], elemento: T): (List[T], List[T]) = {
      l match {
        case e:: xs if elemento == e => chunk(xs, elemento) match {
          case (acc, resto) => (e:: acc, resto)
        }
        case _ => (Nil, l)
      }
    }

    def pack[T](l: List[T]): List[List[T]] = {
      l match {
        case Nil => Nil
        case l => chunk(l, l(0)) match {
          case (group, resto) => group :: pack(resto)
        }
      }
    }

}

object P09 extends App {
    // devuelve (grupo de elementos iguales, resto de la lista)
    val l1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val l2 = List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 5)

    val value_1 = F09 pack(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F09 pack(l2)
    println("" + l2 + " => " + value_2)

}
