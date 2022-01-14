package p14

import scala.annotation.tailrec

// Duplicate the elements of a list.
def duplicate(l: List[Char]): List[Char] =

  @tailrec
  def duplAcc(l: List[Char], acc: List[Char]): List[Char] =
    l match
      case Nil => acc.reverse
      case x :: xs =>
        duplAcc(xs, x :: x :: acc)

  duplAcc(l, Nil)