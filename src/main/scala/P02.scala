package p02

import java.util.NoSuchElementException

// Find the last but one element of a list.
def penultimate(l: List[Int]): Int = l match
  case Nil           => throw NoSuchElementException()
  case x :: _ :: Nil => x
  case x :: xs       => penultimate(xs)
