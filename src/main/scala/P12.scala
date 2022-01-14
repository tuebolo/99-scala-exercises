package p12

import scala.annotation.tailrec

// Decode a run-length encoded list.
def decode(l: List[(Int, Char)]): List[Char] =
  l.flatMap(x => decodeHelper(List(), x))

@tailrec
def decodeHelper(res: List[Char], rem: (Int, Char)): List[Char] = rem match
  case (0, c) => res
  case (n, c) => decodeHelper(res ::: List(c), (n - 1, c))