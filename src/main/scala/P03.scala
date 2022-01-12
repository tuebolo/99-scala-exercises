package p03

import java.util.NoSuchElementException

// Find the kth element of a list.
def nth(k: Int, l: List[Int]): Int = (k, l) match
  case (_, Nil)        => throw NoSuchElementException()
  case (k, _) if k < 0 => throw NoSuchElementException()
  case (0, x :: xs)    => x
  case (k, x :: xs)    => nth(k - 1, xs)