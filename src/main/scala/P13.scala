package p13

import scala.annotation.tailrec

// Run-length encoding of a list (direct solution).
def encodeDirect(l: List[Char]): List[(Int, Char)] =
  l match
    case Nil => List()
    case x :: xs =>
      encodeDirectHelper(xs, List((1, x)))

@tailrec
def encodeDirectHelper(
    rem: List[Char],
    res: List[(Int, Char)]
): List[(Int, Char)] =
  rem match
    case Nil => res.reverse
    case x :: xs =>
      val (yCount, yChar) :: ys = res
      if x == yChar then
        val newHead = (yCount + 1, yChar)
        encodeDirectHelper(xs, newHead :: ys)
      else encodeDirectHelper(xs, (1, x) :: res)