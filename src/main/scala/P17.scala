package p17

import scala.annotation.tailrec

def split(n: Int, l: List[Char]): (List[Char], List[Char]) =
  val ret = splitAcc(n - 1, l, List())
  ret

@tailrec
def splitAcc(
    n: Int,
    l: List[Char],
    acc: List[Char]
): (List[Char], List[Char]) =
  l match
    case Nil => (acc.reverse, List())
    case x :: xs =>
      if n == 0 then ((x :: acc).reverse, xs)
      else splitAcc(n - 1, xs, x :: acc)