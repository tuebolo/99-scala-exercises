package p01

import java.util.NoSuchElementException

//  Find the last element of a list.
def last(l: List[Int]): Int = l match
  case Nil      => throw NoSuchElementException()
  case x :: Nil => x
  case x :: xs  => last(xs)
